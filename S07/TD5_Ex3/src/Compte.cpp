#include "Compte.h"

Compte::Compte()
{
    //ctor
    rib=0;
    solde=0;
}
Compte::Compte(int r,float s)
{
    rib=r;
    solde=s;
}
void Compte::afficher()
{
    cout<<"Votre RIB:\n"<<rib<<endl;
    cout<<"Votre solde:\n"<<solde<<endl;
}

bool Compte ::retirer(float montant)
{
    if(solde - montant>0)
    {solde -=montant;
      return true;
    }
    else
        return false;

}
float Compte::deposer(float m)
{
   cout<< "Entrer le montant"<<endl;
    return (solde+m);
}
Compte::~Compte()
{
    //dtor
}
