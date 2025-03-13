#ifndef COMPTECOURANT_H
#define COMPTECOURANT_H

#include <compte.h>


class CompteCourant : public compte
{
    public:
        CompteCourant();
        CompteCourant(int RIB,double solde,double seuil);
        virtual ~CompteCourant();
        void afficher();

    protected:

    private:
        double seuil;
};

#endif // COMPTECOURANT_H
