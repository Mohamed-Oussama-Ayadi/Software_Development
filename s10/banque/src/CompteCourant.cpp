#include "CompteCourant.h"
#include <iostream>

using namespace std;
CompteCourant::CompteCourant():compte()
{
    seuil = -500;
}

CompteCourant::~CompteCourant()
{
    //dtor
}
CompteCourant::CompteCourant(int RIB,double solde,double seuil):compte(RIB,solde)
{
    this->seuil=seuil;
}
void CompteCourant::afficher()
{
    compte::afficher();
    cout<<"seuill : "<<seuil<<endl;
}

