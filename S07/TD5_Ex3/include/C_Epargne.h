#ifndef C_EPARGNE_H
#define C_EPARGNE_H
#include <iostream>

using namespace std;

#include <Compte.h>


class C_Epargne : public Compte
{
    public:
        C_Epargne();
        C_Epargne(int rib,float solde,float taux);
        void saisir();
        float calculInteret();
        bool retirer(float m);
         void afficher();

        virtual ~C_Epargne();

        int Gettaux() { return taux; }
        void Settaux(float val) { taux = val; }

    protected:

    private:
        float taux;
};

#endif // C_EPARGNE_H
