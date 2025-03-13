#ifndef OUVRIER_H
#define OUVRIER_H
#include <iostream>
#include "../Employe.h"
using namespace std;

class Ouvrier : public Employe
{
    public:
        Ouvrier();
        virtual ~Ouvrier();

        //int Getheuresupp() { return heuresupp; }
        void Setheuresupp(int hs);
        void saisir();


    private:
        int heuresupp;
};

#endif // OUVRIER_H
