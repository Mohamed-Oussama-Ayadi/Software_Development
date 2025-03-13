#ifndef OUVRAGE_H
#define OUVRAGE_H
#include <string>
#include <iostream>
using namespace std;
class ouvrage
{
    public:
        ouvrage();
        virtual ~ouvrage();

        int Getcode() { return code; }
        void Setcode(int val) { code = val; }
        string Gettitre() { return titre; }
        void Settitre(string val) { titre = val; }
        int Getnbr_exemplaire() { return nbr_exemplaire; }
        void Setnbr_exemplaire(int val) { nbr_exemplaire = val; }
        double Getprix() { return prix; }
        void Setprix(double val) { prix = val; }
        ouvrage(int code,string titre,int nbr_exemplaire,double prix);
        void afficher_ouvrage();
        double totalOuvrage();

    protected:

    private:
        int code;
        string titre;
        int nbr_exemplaire;
        double prix;
};

#endif // OUVRAGE_H
