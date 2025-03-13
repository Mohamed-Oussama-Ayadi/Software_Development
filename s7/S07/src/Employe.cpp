#include "../Employe.h"


Employe::Employe()
{
    nom="_";
    prenom="_";
    salaireBase=0;
}


void Employe::saisir(){
cout<<"Entrer nom:"<<endl;
cin>>nom;
cout <<"Entrer prenom:"<<endl;
cin>>prenom;
cout<<"Entrer salaire de base"<<endl;
cin>>salaireBase;}
void Employe::afficher(){
    cout<<nom+" "prenom+" "<<salaireBase<<endl;
}
Employe::~Employe()
{
    //dtor
}
