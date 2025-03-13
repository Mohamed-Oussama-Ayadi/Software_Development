#ifndef FONCTIONS_H_INCLUDED
#define FONCTIONS_H_INCLUDED
#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;
class Etudiants{
private:
    string nom;
    string adresse;
    string classe;
    string date_nais;
    int id;
public:
   int getid();
   int getClasse();
    Etudiants();
    Etudiants(string,string,string,string,int);
    void afficher();
   /* rechercher(int num);
    supprimer(int num);*/

};


#endif // FONCTIONS_H_INCLUDED
