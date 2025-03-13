#include <iostream>
#include "compte.h"
#include "CompteCourant.h"
#include "CompteEpargne.h"
#include "banque.h"
using namespace std;

int main()
{
    compte c1(123,1000);
   banque b;
    banque A(b);
    b.modifier();
    cout<<"#####Banque B#############"<<endl;
    b.afficherBanque();
    cout<<"########### banque A copie de B######"<<endl;

    A.afficherBanque();
     cout<<"########### affectation A à D######"<<endl;
     banque D;
     D=A;
     cout<<"#####Banque A############"<<endl;
    A.afficherBanque();
    cout<<"#####Banque D#############"<<endl;
   D.afficherBanque();
    /*CompteEpargne ce(156,2000,0.1);
    CompteCourant cc(878,3000,0.1);
    banque b;
    b.Ajouter(c1);
    b.Ajouter(ce);
    b.Ajouter(cc);
    b.afficherBanque();
    b.modifier(156);
    cout<<"*********************************"<<endl;
    b.afficherBanque();*/
    c1.afficher();
    b.Ajouter(c1);
    b.afficherBanque();
    A.afficherBanque();
    b.modifier(123);
    b.afficherBanque();
    A.afficherBanque();
    c1.afficher();
    return 0;
}

