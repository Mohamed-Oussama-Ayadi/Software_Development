#include "Abonnement.h"

Abonnement::Abonnement()
{
    //ctor
    date="";
}

Abonnement::Abonnement(int id, int nb_h, double prix, string date) : Carte(id, nb_h, prix) {
    this->date = date;
}
void Abonnement::afficherAbonnement()
{
    Carte::afficherCarte();
    cout<<"Date expiration"<<date<<endl;
}

Abonnement::~Abonnement()
{
    //dtor
}
