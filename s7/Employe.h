#ifndef EMPLOYE_H
#define EMPLOYE_H
#include <iostream>
#include <string>
using namespace std;
class Employe
{
    public:
        Employe();
        virtual ~Employe();
     void saisir();
     void afficher();
       string Getnom() { return nom; }
        void Setnom(string val) { nom = val; }
        string Getprenom() { return prenom; }
        void Setprenom(string val) { prenom = val; }
        float GetsalaireBase() { return salaireBase; }
        void SetsalaireBase(float val) { salaireBase = val; }

    private:
        string nom;
        string prenom;
        float salaireBase;
};

#endif // EMPLOYE_H
