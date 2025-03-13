#ifndef BANQUE_H
#define BANQUE_H
#include <vector>
#include "CompteEpargne.h"
#include <iostream>
#include "compte.h"
#include "CompteCourant.h"
#include <string>
using namespace std;
class banque
{
    string nom;

    public:
        void Ajouter(compte &c);
        void Ajouter(CompteCourant &cc);
        void Ajouter(CompteEpargne &ce);
        vector <compte*>::iterator rechercher(int RIB);
        void afficherBanque();
        bool modifier (int RIB);

    protected:

    private:
        vector<compte*> TabC;
};

#endif // BANQUE_H
