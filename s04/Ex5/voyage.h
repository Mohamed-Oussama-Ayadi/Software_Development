#ifndef VOYAGE_H_INCLUDED
#define VOYAGE_H_INCLUDED
#include <iostream>
#include <string>
#include "hebergement.h"


using namespace std;
class Voyages{
private:
  int id;
   string villeO;
   string villeD;
   string dateD;
   string dateR;
   float prix;
   string nom;
Hebergement* H;

public:
    Voyages(int id, string villeO, string villeD, string dateD, string dateR, float prix, Hebergement* H);
      void afficher();
      void setHebergement(Hebergement* H);
     };

#endif // VOYAGE_H_INCLUDED
