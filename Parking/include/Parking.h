#ifndef PARKING_H
#define PARKING_H

#include <iostream>


using namespace std;
#include <vector>
#include "Carte.h"
class Parking
{
    public:
        Parking();
        Parking(int,int);
        void afficherParking();
        vector<int>::iterator chercherautorise(int id);
        bool ajouterautorise(int id);
         vector<int>::iterator chercherutilise(int id);
        bool ajouterutilise(int id);
        bool operator<(const Parking& P);
        void supprimer_carte(Carte &);
        virtual ~Parking();

        int Getref() { return reff; }
        void Setref(int val) { reff = val; }
        int Getnbp() { return nbp; }
        void Setnbp(int val) { nbp = val; }
        vector<int> Getautorise() { return autorise; }
        void Setautorise(vector<int> val) { autorise = val; }
        vector<int> Getutilise() { return utilise; }
        void Setutilise(vector<int> val) { utilise = val; }

    protected:

    private:
        int reff;
        int nbp;
        vector<int> autorise;
        vector<int> utilise;
};

#endif // PARKING_H
