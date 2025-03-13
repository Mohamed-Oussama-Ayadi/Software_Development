#ifndef OUVRAGE_H
#define OUVRAGE_H
#include <iostream>

using namespace std;
#include <string>

class Ouvrage
{
    public:
         Ouvrage();
        Ouvrage(int code, string titre,int nbr_exp,float prixU);
        virtual ~Ouvrage();

        int Getcode() { return code; }
        void Setcode(int val) { code = val; }
        string Gettitre() { return titre; }
        void Settitre(string val) { titre = val; }
        int Getnbr_exp() { return nbr_exp; }
        void Setnbr_exp(int val) { nbr_exp = val; }
        float GetprixU() { return prixU; }
        void SetprixU(float val) { prixU = val; }
        void afficher();
float totalouvrage();
    protected:

    private:
        int code;
        string titre;
        int nbr_exp;
        float prixU;
};

#endif // OUVRAGE_H
