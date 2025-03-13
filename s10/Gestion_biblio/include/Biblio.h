#ifndef BIBLIO_H
#define BIBLIO_H
#include <vector>
#include "Abonne.h"
#include "Ouvrage.h"
#include "Livre.h"
#include "Video.h"
#include <iostream>

using namespace std;

class Biblio
{
    public:
        Biblio();
        virtual ~Biblio();
   vector<Ouvrage*>::iterator getOuvrage(string titre);
   vector<Abonne*>::iterator getAbonne(int id);
   bool ajouter(  Ouvrage&);
    bool ajouter(  Abonne&);




    protected:
    private:
        vector<Abonne*>tabA;
        vector<Ouvrage*>tabO;

};

#endif // BIBLIO_H
