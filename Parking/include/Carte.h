#ifndef CARTE_H
#define CARTE_H


#include <iostream>


using namespace std;


class Carte
{
    public:
        Carte();
        Carte(int, int,double);
        void afficherCarte();
        virtual ~Carte();

        int Getid() { return id; }
        void Setid(int val) { id = val; }
        int Getnb_h() { return nb_h; }
        void Setnb_h(int val) { nb_h = val; }
       double Getprix() { return prix; }
        void Setprix(double val) { prix = val; }

    protected:

    private:
        int id;
        int nb_h;
        double prix;
};

#endif // CARTE_H
