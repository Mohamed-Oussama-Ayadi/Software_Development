#ifndef FONCTIONS_H_INCLUDED
#define FONCTIONS_H_INCLUDED
using namespace std;
#include <iostream>
#include <string>
/*class Etudiants{
    public:
string nom;
string prenom;
float tab_note[10]={0};
void saisir();
void afficher();
float moyenne();
bool admis();
int exae_quo(Etudiants E);
};*/
//ex3 TD2
class Abonne{
public:
    string nom;
    string prenom;
    int num;
    int CIN;
    double solde;
    void saisir();
    void afficher();
    float recharger(float montant);
    bool consommer(int seconde, float prix);
    };
    class operateur{
    public:
    Abonne A;
    bool chercher_abonne(int Cin);
    void Ajout_abonne(Abonne A);
    void supprimer_abonne(int Cin);
    void afficher();
    };



#endif // FONCTIONS_H_INCLUDED
