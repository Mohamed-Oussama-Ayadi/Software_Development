#include <iostream>
#include"fonctions.h"
using namespace std;

int main()
{
    /*Etudiants E;
float moy;
int res;
    E.saisir();
    E.afficher();
    moy=E.moyenne();
    E.admis();
    res=E.exae_quo(E);*/
    //ex 3 TD2
    Abonne A;
    operateur O;
    A.saisir();
    A.afficher();
    float montant;
    cin>>montant;
    A.recharger(montant);

    return 0;
}
