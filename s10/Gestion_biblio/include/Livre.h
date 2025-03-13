#ifndef LIVRE_H
#define LIVRE_H

#include<string>
#include <Ouvrage.h>


class Livre : public Ouvrage
{
    public:
        Livre();
        Livre(string auteur);
        virtual ~Livre();
        void afficher();
        string Getauteur() { return auteur; }
        void Setauteur(string val) { auteur = val; }

    protected:

    private:
        string auteur;
};

#endif // LIVRE_H
