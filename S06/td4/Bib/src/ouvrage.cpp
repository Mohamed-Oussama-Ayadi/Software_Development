#include "ouvrage.h"

ouvrage::ouvrage()
{
    this->code=0;
    this->nbr_exemplaire=0;
    this->prix=0;
    this->titre="0";
}

ouvrage::~ouvrage()
{
    //dtor
}
ouvrage::ouvrage(int code,string titre,int nbr_exemplaire,double prix){
    this->code=code;
    this->nbr_exemplaire=nbr_exemplaire;
    this->prix=prix;
    this->titre=titre;
}
void ouvrage::afficher_ouvrage(){
    cout<<"//code : "<<code<<"//titre : "<<titre<<"//nbr_exemplaire : "<<nbr_exemplaire<<"//prix : "<<prix<<endl;
}
double ouvrage::totalOuvrage(){
    return prix*nbr_exemplaire;
}
