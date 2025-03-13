#ifndef ECOLE_H_INCLUDED
#define ECOLE_H_INCLUDED
#include <iostream>
#include <vector>
#include <algorithm>
#include "fonctions.h"
using namespace std;
class Ecole{
vector<Etudiants>E;
public:

  int chercher(int num);
  void ajouter( Etudiants &e);
  void afficher();
 void supprimer(int num);
void afficherClasse(string cl);
};
#endif // ECOLE_H_INCLUDED
