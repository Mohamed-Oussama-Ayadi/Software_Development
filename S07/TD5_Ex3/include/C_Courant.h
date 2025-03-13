#ifndef C_COURANT_H
#define C_COURANT_H
#include <iostream>

using namespace std;

#include <Compte.h>


class C_Courant : public Compte
{
    public:
        C_Courant();
        C_Courant(int rib,float solde,int seuil);
        bool retirer(double montant);

        void afficher();
        virtual ~C_Courant();

        int Getseuil() { return seuil; }
        void Setseuil(int val) { seuil = val; }

    protected:

    private:
        int seuil;
};

#endif // C_COURANT_H
