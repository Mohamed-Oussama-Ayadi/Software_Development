#include "Ouvrier.h"
#include "Employe.h"
Ouvrier::Ouvrier()
{heureSupp=0;
    //ctor
}
Ouvrier::Ouvrier(string n, string p, float sb,int hsp):Employe(n,p,sb)
        {cout<<"Constructeur Ouvrier"<<endl;
            heureSupp=hsp;
        }
void Ouvrier::SetheureSupp(int hs)
{
    heureSupp=hs;
}
void Ouvrier::saisir()
{
Employe::saisir();
cout<<"Entrer heure supp"<<endl;
cin>>heureSupp;
}
void Ouvrier::afficherO(){
Employe::afficher();
cout <<"   "<<heureSupp;
}
Ouvrier::~Ouvrier()
{
    //dtor
}
