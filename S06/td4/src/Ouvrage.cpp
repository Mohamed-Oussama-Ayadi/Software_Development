#include "Ouvrage.h"

Ouvrage::Ouvrage()
{   code=0;
 titre="";
 nbr_exp=0;
 prixU=0;
    //ctor
}

Ouvrage::~Ouvrage()
{

    //dtor
}
Ouvrage::Ouvrage(int code, string titre,int nbr_exp,float prixU)
{
    this->code=code;
    this->titre=titre;
    this->nbr_exp=nbr_exp;
    this->prixU=prixU;
}

void Ouvrage::afficher()
{
   cout <<"votre code est" <<code<<endl;
    cout << " titre  "<< titre <<endl;
    cout << " nb_exemplaire  "<< nbr_exp <<endl;
    cout << "  prix "<< prixU <<endl;

}

float Ouvrage::totalouvrage()
{
    return nbr_exp*prixU;
}
