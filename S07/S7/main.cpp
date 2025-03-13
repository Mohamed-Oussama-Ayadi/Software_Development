#include <iostream>
#include "Employe.h"
#include "Ouvrier.h"
using namespace std;

int main()
{  /*Ouvrier o1;
    o1.saisir();
    o1.SetheureSupp(25);
    o1.afficherO();*/
    Employe E;
    cout<<"Employe:"<<endl;
    E.afficher();
    Ouvrier o1;
    cout <<"Ouvrier 1: "<<endl;
    o1.afficherO();
    Ouvrier o2("ali","salah",500,30);
    o2.afficherO();

    return 0;
}
