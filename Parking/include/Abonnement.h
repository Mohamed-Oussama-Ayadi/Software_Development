#ifndef ABONNEMENT_H
#define ABONNEMENT_H
#include <iostream>

using namespace std;
#include <Carte.h>
#include <string>

class Abonnement : public Carte
{
    public:
        Abonnement();
        Abonnement(int,int,double,string);
        void afficherAbonnement();
        virtual ~Abonnement();

        string Getdate() { return date; }
        void Setdate(string val) { date = val; }

    protected:

    private:
        string date;
};

#endif // ABONNEMENT_H
