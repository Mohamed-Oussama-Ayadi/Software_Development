#include "voyage.h"
#include "hebergement.h"
Voyages::Voyages(int id, string villeO, string villeD, string dateD, string dateR, float prix, Hebergement* H) {
            this->id = id;
            this->villeO = villeO;
            this->villeD = villeD;
            this->dateD = dateD;
            this->dateR= dateR;
            this->prix = prix;
            this->H = H;
        }
        void  Voyages::afficher() {
            cout << "Id: " << id << endl;
            cout << "Ville d'origine: " << villeO << endl;
            cout << "Ville de destination: " << villeD<< endl;
            cout << "Date de depart: " << dateD << endl;
            cout << "Date de retour: " << dateR << endl;
            cout << "Prix: " << prix << endl;
            cout << "Hebergement: " << endl;
            H->afficher();
        }
         void Voyages::setHebergement(Hebergement* H) {
            this->H = H;
        }
