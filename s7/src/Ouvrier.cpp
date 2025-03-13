
 #include "../Employe.h"
#include "../include/Ouvrier.h"
Ouvrier::Ouvrier()
{
    //ctor
    heuresupp=0;
}
void Ouvrier::Setheuresupp(int hs)
{
    heuresupp=hs;
}
void Ouvrier::saisir()
{
Employe::saisir();
cout<<"Entrer heure supp"<<endl;
cin>>heuresupp;
}
Ouvrier::~Ouvrier()
{
    //dtor
}
