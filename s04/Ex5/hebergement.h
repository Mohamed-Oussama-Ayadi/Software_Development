#ifndef HEBERGEMENT_H_INCLUDED
#define HEBERGEMENT_H_INCLUDED
#include <iostream>
#include <string>
using namespace std;
//#include "voyage.h"
class Hebergement{
private:
    string adresse;
    string nom;
    int nbr_etoile;
    public:
        Hebergement(string adresse, int nbr_etoile, string nom);
         void afficher();
     void setNbreEtoiles(int nbr_etoile);
        };


#endif // HEBERGEMENT_H_INCLUDED
