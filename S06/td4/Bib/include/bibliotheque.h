#ifndef BIBLIOTHEQUE_H
#define BIBLIOTHEQUE_H
#include <list>
#include "ouvrage.h"
class bibliotheque
{
    public:
        bibliotheque();
        virtual ~bibliotheque();
        void afficher_bib();
        double prixTotal();
        list<ouvrage>::iterator rechercher(int code);
        void ajouter(ouvrage o1);
        void diminuerNbExp(int code,int n);
        void ajouterNbExp(int code,int n);

    private:
        list <ouvrage> o;

};

#endif // BIBLIOTHEQUE_H
