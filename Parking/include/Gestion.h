#ifndef GESTION_H
#define GESTION_H

#include <iostream>


using namespace std;
#include "Abonnement.h"
#include "Carte.h"
#include "Parking.h"
#include <typeinfo>
class Gestion
{
    public:
        Gestion();
        virtual ~Gestion();
        Gestion(const Gestion&);
        Gestion& operator=(const Gestion&);
        void afficherGestion();
          vector<Carte*>::iterator chercherCarte(int);
          vector<Parking>::iterator chercherParking(int reff);
          bool verifautorise(int id , int reff);
             bool verifnbp(int id , int reff);
                   bool verifutilise(int id , int reff);
        bool ajouter( Carte&);
        bool ajouter( Abonnement&);
        bool ajouter( Parking&);
        void ajoutercarte(int id, int reff);
        double calcul(Carte c);
        Parking* moinRentable();
        void supprimercarte(Carte &);

        vector<Parking> Getpar() { return par; }
        void Setpar(vector<Parking> val) { par = val; }
        vector<Carte*> Getcar() { return car; }
        void Setcar(vector<Carte*> val) { car = val; }


    protected:

    private:
        vector<Parking> par;
        vector<Carte*> car;

};

#endif // GESTION_H
