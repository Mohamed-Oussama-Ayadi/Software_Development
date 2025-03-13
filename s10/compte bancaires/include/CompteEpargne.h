#ifndef COMPTEEPARGNE_H
#define COMPTEEPARGNE_H
#include <iostream>

using namespace std;
#include <compte.h>


class CompteEpargne : public compte
{
    public:
        CompteEpargne();
        CompteEpargne(int RIB,double solde,double taux_interet);
        virtual ~CompteEpargne();
        void calcul_interet_annuel();
        void afficher();
    protected:

    private:
        double taux_interet;
};

#endif // COMPTEEPARGNE_H
