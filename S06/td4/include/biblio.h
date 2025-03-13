#ifndef BIBLIO_H
#define BIBLIO_H
#include <iostream>

using namespace std;
#include <string>
#include<list>
#include "Ouvrage.h"
class biblio
{
    public:
        biblio();
        virtual ~biblio();
        void ajouter(  Ouvrage &O);
        void afficher();
     list<Ouvrage>::iterator recherche (int c);
       float calcul_prixtotal();
       void diminuerNBExp(int c , int n);
       void augmenterNBExp(int c, int n);


    protected:

    private:
        list<Ouvrage>tab;
};

#endif // BIBLIO_H
