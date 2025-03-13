#include "hebergement.h"
Hebergement::Hebergement(string adresse, int nbr_etoile,string nom){
   this->adresse = adresse;
            this->nbr_etoile = nbr_etoile;
            this->nom = nom;
        }
void  Hebergement::afficher() {
            cout << "Adresse: " << adresse << endl;
            cout << "Nombre d'etoiles: " <<nbr_etoile << endl;
            cout << "Nom: " << nom << endl;
        }
 void Hebergement::setNbreEtoiles(int nbr_etoile) {
            this->nbr_etoile =nbr_etoile;}

