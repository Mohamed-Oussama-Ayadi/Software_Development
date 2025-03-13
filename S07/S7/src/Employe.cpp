#include "Employe.h"

Employe::Employe()
{  cout<<"Constructeur Employe"<<endl;
    nom="_";
    prenom="_";
    salaireBase=0;
}
Employe::Employe(string nom,string prenom, float salaireBase)
{
    cout<<"Constructeur parametre"<<endl;
    this->nom=nom;
    this->prenom=prenom;
    this->salaireBase=salaireBase;
}

void Employe::saisir(){
cout<<"Entrer nom:"<<endl;
cin>>nom;
cout <<"Entrer prenom:"<<endl;
cin>>prenom;
cout<<"Entrer salaire de base"<<endl;
cin>>salaireBase;}
void Employe::afficher(){
    cout<<nom+" "+prenom+" "<<salaireBase<<endl;
}
Employe::~Employe()
{ cout<<"Destructeur emp"<<endl;
    //dtor
}
