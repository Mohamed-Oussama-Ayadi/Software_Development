#ifndef COMPTE_H
#define COMPTE_H
#include <iostream>

using namespace std;


class Compte
{
    public:
        Compte();
        Compte(int,float);
        virtual ~Compte();
        virtual void afficher();
        float deposer(float m);
       bool retirer(float montant);

         int Getrib() { return rib; }
        void Setrib( int val) { rib = val; }
        float Getsolde() { return solde; }
        void Setsolde(float val) { solde = val; }

    protected:
         int rib;
        float solde;

};

#endif // COMPTE_H
