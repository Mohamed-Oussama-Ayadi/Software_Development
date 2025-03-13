#include "Carte.h"

Carte::Carte()
{
    //ctor
id=0;
nb_h=0;
prix=0;
}
Carte::Carte(int id,int nb_h, double prix)
{
    this->id=id;
    this->nb_h=nb_h;
    this->prix=prix;
}
void Carte::afficherCarte()
{
    cout<<"carte:"<<id<<"nombre heure stationnement"<<nb_h<<"prix/heure"<<prix<<endl;
}







Carte::~Carte()
{
    //dtor
}
