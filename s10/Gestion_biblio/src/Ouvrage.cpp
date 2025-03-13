#include "Ouvrage.h"

Ouvrage::Ouvrage()
{
    //ctor
}
Ouvrage::Ouvrage(string titre,string date_c,bool indi)
{
    this->titre=titre;
    this->date_c=date_c;
    this->indi=indi;
}
Ouvrage::~Ouvrage()
{
    //dtor
}
void Ouvrage::afficher()
{
    cout<<"titre"<<titre<<endl;
     cout<<"date creation"<<date_c<<endl;
      cout<<"indicateur"<<indi<<endl;

}
