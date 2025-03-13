#include "fonctions.h"
#include "ecole.h"
int Etudiants::getid(){return id;}
int Ecole::getClasse(){return classe;}
Etudiants::Etudiants()
{
    nom="";
    adresse="";
    classe="";
    date_nais="";
     id=0;
}

Etudiants::Etudiants(string,string,string,string,int)
{
    this->nom=nom;
    this->adresse=adresse;
    this->classe=classe;
    this->date_nais=date_nais;
    this->id=id;
}
void Etudiants::afficher(){
  cout<<"Nom:"<<nom<<endl;
  cout<<"adresse:"<<adresse<<endl;
  cout <<"classe:"<<classe<<endl;
  cout<<"Date de naissance:"<<date_nais<<endl;
  cout<<"numero identite:"<<id<<endl;
  }
