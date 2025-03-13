#include "Biblio.h"

Biblio::Biblio()
{
    //ctor
}

Biblio::~Biblio()
{
    //dtor
}
vector<Ouvrage*>::iterator Biblio::getOuvrage(string titre)
{  for(vector<Ouvrage*>::iterator i=tabO.begin();i != tabO.end();i++)
    {
        if ((*i)->Gettitre()==titre){
            return i;
        }
    }
    return tabO.end();

}
vector<Abonne*>::iterator Biblio::getAbonne(int id)
{  for(vector<Abonne*>::iterator i=tabA.begin();i != tabA.end();i++)
    {
        if ((*i)->Getid()==id){
            return i;
        }
    }
    return tabA.end();

}
bool Biblio::ajouter( Ouvrage& O)
{
    if(getOuvrage(O.Gettitre())==tabO.end())
    {
        Ouvrage *p=new Ouvrage(O);
        tabO.push_back(p);
        return true;
    }
    return false;
}
bool Biblio::ajouter( Abonne& A)
{
    if(getAbonne(A.Getid())==tabA.end())
    {
        Abonne *p=new Abonne(A);
        tabA.push_back(p);
        return true;
    }
    return false;
}
