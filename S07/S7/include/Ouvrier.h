#ifndef OUVRIER_H
#define OUVRIER_H

#include <Employe.h>


class Ouvrier : public Employe
{
    public:
        Ouvrier();
        Ouvrier(string , string , float ,int );

        virtual ~Ouvrier();
void SetheureSupp(int hs);
        void saisir();
        void afficherO();

    private:
        int heureSupp;
};

#endif // OUVRIER_H
