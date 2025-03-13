#ifndef OUVRAGE_H
#define OUVRAGE_H
#include <iostream>

using namespace std;

#include<string>

class Ouvrage
{
    public:
        Ouvrage();
        Ouvrage(string titre,string date_c,bool indi);
        void afficher();
        virtual ~Ouvrage();

        string Gettitre() { return titre; }
        void Settitre(string val) { titre = val; }
        string Getdate_c() { return date_c; }
        void Setdate_c(string val) { date_c = val; }
        bool Getindi() { return indi; }
        void Setindi(bool val) { indi = val; }

    protected:

    private:
        string titre;
        string date_c;
        bool indi;
};

#endif // OUVRAGE_H
