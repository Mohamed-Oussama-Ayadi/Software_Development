
#ifndef BANQUE_H_INCLUDED
#define BANQUE_H_INCLUDED
#include <iostream>
#include "Fonctions.h"
#include <string>
using namespace std;
class banque{
string nombanque;
compte tab[50];
int n=0;
public:
    void setnomb(string nom ){
    nombanque=nom;
    }
    bool cherchercompte(int rib);
    bool ajouter(compte c);
    void afficherbanque();
};


#endif // BANQUE_H_INCLUDED
