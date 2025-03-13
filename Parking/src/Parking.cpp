#include "Parking.h"

Parking::Parking()
{
    //ctor
    reff=0;
    nbp=0;
}
Parking::Parking(int reff,int nbp)
{
    this->reff=reff;
    this->nbp=nbp;
}
void Parking::afficherParking()
{

    cout<<"Reference:"<<reff<<"Nombre de place"<<nbp<<endl;
    cout<<"Liste autorisé:"<<endl;
    for(unsigned i=0; i<autorise.size();i++)

    {cout<<"carte "<<i+1<<" : "<<autorise[i]<<endl;}

     cout<<"Liste utilise:"<<endl;
    for(unsigned i=0; i<utilise.size();i++)

    {cout<<"carte "<<i+1<<" : "<<utilise[i]<<endl;}

}
vector<int>::iterator Parking::chercherautorise(int id)
{
    for(vector<int>::iterator it=autorise.begin(); it!=autorise.end(); it++)
    {
        if(*it==id)
            return it;
    }
    return autorise.end();
}
bool Parking::ajouterautorise(int id)
{ if(chercherautorise(id)==autorise.end())
   {
       autorise.push_back(id);
       return true;
   }
   else{
        return false;

   }

}
vector<int>::iterator Parking::chercherutilise(int id)
{
    for(vector<int>::iterator it=utilise.begin(); it!=utilise.end(); it++)
    {
        if(*it==id)
            return it;
    }
    return utilise.end();
}
bool Parking::ajouterutilise(int id)
{ if(chercherutilise(id)==utilise.end())
   {
       utilise.push_back(id);
       return true;
   }
   else{
        return false;

   }

}
bool Parking::operator<(const Parking& P){
    return this->autorise.size() < P.utilise.size();
}
void Parking::supprimer_carte(Carte &c)
  {
     vector<int> ::iterator it;
     // Boucle pour supprimer l'identifiant de la carte de la liste des cartes autorisées
       for(it=autorise.begin(); it!=autorise.end(); ++it)
    {if ((*it)==c.Getid())
    {  //erase pour supprimer cet élément de la liste.
       autorise.erase(it);
    }

     }
     // Boucle pour supprimer l'identifiant de la carte de la liste des cartes utilisés
      for(it=utilise.begin(); it!=utilise.end(); ++it)
    {if ((*it)==c.Getid())
    {
        utilise.erase(it);
    }
     }
  }

Parking::~Parking()
{
    //dtor
}
