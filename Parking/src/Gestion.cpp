#include "Gestion.h"

Gestion::Gestion()
{
    //ctor
}

Gestion::~Gestion()
{
    //dtor
    for(vector<Carte*>::iterator it=car.begin();it!=car.end();it++)
        delete(*it);
}
Gestion::Gestion(const Gestion& Ge)
{
    par=Ge.par;
    Carte *p;
    vector<Carte*>::const_iterator i;
    for(i=Ge.car.begin();i!=Ge.car.end();i++)
    {
        if(typeid(**i)==typeid(Carte))
        {
            p=new Carte(**i);
        }
        else{
            p=new Abonnement(static_cast<const Abonnement&>(**i));
        }
        car.push_back(p);
    }
}
Gestion&Gestion::operator=(const Gestion& Ge)
{ if(this!=&Ge)
{
    for(vector<Carte*>::iterator it=car.begin();it!=car.end();it++)
        delete(*it);
    car.clear();
    par=Ge.par;
    Carte *p;
      vector< Carte*>::const_iterator i;
        for(i=Ge.car.begin(); i!=Ge.car.end(); i++)
        {
            if(typeid(**i)==typeid( Carte))
            {
                p=new  Carte (**i);
            }
            else
            {
                p=new  Abonnement (static_cast<const Abonnement&>(**i));
            }

            car.push_back(p);

        }

}
  return(*this);
}
void Gestion::afficherGestion()
{
    cout<<"liste des parking:"<<endl;
    for(vector<Parking>::iterator itP=par.begin();itP!=par.end();itP++)
    {
        itP->afficherParking();
    }
    cout<<"liste des cartes:"<<endl;
    for(vector<Carte*>::iterator itCa=car.begin();itCa!=car.end();itCa++)
    {
        (*itCa)->afficherCarte();
    }
}
//1//
vector<Carte*>::iterator Gestion::chercherCarte(int id)
{
    for(vector<Carte*>::iterator it=car.begin(); it!=car.end(); it++)
    {
        if((*it)->Getid()==id)
            return it;
    }
    return car.end();
}
bool Gestion::ajouter( Carte& ca)
{
 if(chercherCarte(ca.Getid())==car.end())
    {
        Carte* p=new Carte(ca);
        car.push_back(p);
        return true;
    }
    return false;
}
bool Gestion::ajouter(Abonnement& ab)
{
     if(chercherCarte(ab.Getid())==car.end())
    {
        Carte* p=new Abonnement(ab);
        car.push_back(p);
        return true;
    }
    return false;
}
vector<Parking>::iterator Gestion::chercherParking(int reff)
{
    for(vector<Parking>::iterator it=par.begin(); it!=par.end(); it++)
    {
        if((it)->Getref()==reff)
            return it;
    }
    return par.end();

}
bool Gestion::ajouter (Parking& pa)
{

    if(chercherParking(pa.Getref())==par.end())
    {
        par.push_back(pa);
        return true;
    }
    return false;
}
//2//
bool Gestion::verifautorise(int id , int reff)
{
    for(vector<Parking>::iterator it=par.begin(); it!=par.end(); it++)
    {  if((it)->Getref()==reff)
        {  for(vector<int>::iterator it1=it->Getautorise().begin(); it1!=it->Getautorise().end(); it++)
        {
            if(*it1 == id)
            {
                return true;
            }

        }
         return false;

        }
}
return false;
}
bool Gestion::verifnbp(int id , int reff)
{
    for(vector<Parking>::iterator it=par.begin(); it!=par.end(); it++)
    {  if (((it)->Getref()==reff) && ((int) it->Getutilise().size()<it->Getnbp()))
        {
                return true;
            }
}
return false;
}
bool Gestion::verifutilise(int id, int reff)
{

    for(vector<Parking>::iterator it=par.begin(); it!=par.end(); it++)
    {  if((it)->Getref()==reff)
        {  for(vector<int>::iterator it1=it->Getutilise().begin(); it1!=it->Getutilise().end(); it++)
        {
            if(*it1 == id)
            {
                return true;
            }

        }
         return false;

        }
}
return false;
}
void Gestion::ajoutercarte(int id, int reff)
{
    vector<Parking>::iterator itpar=chercherParking(reff);
    try
    {
        if(verifautorise(id,reff)&& verifnbp(id,reff) && verifutilise(id,reff))
            itpar->Getutilise().push_back(id);
        else{
            throw ("pas d'ajout");
        }
    }
    catch(string const& ch)
    {
        cerr<<ch<<endl;
    }
}
Parking* Gestion ::moinRentable(){
    //initialiser le pointeur moin avec l'adresse de l'élément de début du vecteur par en prenant
    //la valeur &*par.begin()
    Parking* moin = &*par.begin();
    for(vector <Parking> :: iterator it = par.begin(); it != par.end(); ++it){
        if(*it < *moin){
                //mis à jour avec l'adresse de l'élément courant en prenant la valeur &*it.
            moin = &*it;
        }
    }
    return moin;
}
double Gestion :: calcul(Carte c)
{
    if(c.Getnb_h() <= 10){
        return 0;
    }else{
        return (c.Getprix() * (c.Getnb_h()-10));
    }
}
void Gestion::supprimercarte(Carte &c1)
 // parcours de la liste de pointeurs de carte pour trouver la carte à supprimer
{  vector <Carte*> :: iterator it;
       for(it=car.begin(); it!=car.end(); it++)
    {if ((*it)->Getid()==c1.Getid()) // on vérifie si l'id de la carte correspond à celui de la carte à supprimer
        {
            delete(*it); // on libère la mémoire allouée pour la carte à supprimer
            car.erase(it);  // on enlève le pointeur de la carte à supprimer de la liste de pointeurs de carte

        }
    }
      // parcours de la liste de parking pour supprimer la carte des autorisations et utilisations
    vector<Parking> ::iterator i;
    for(i=par.begin(); i!=par.end(); ++i)
    {
        i->supprimer_carte(c1);
    }
}


