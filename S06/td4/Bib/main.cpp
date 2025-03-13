#include <iostream>
#include "ouvrage.h"
#include "bibliotheque.h"
using namespace std;

int main()
{
    bibliotheque b;
   // double prixtotal;
    int code,nbr,code1,nbr1;
    ouvrage o(123,"sss",12,20);
    ouvrage o2(157,"ddd",19,100);
    b.ajouter(o);
    b.ajouter(o2);
    b.afficher_bib();
    //prixtotal=b.prixTotal();
    cout<<"//////////////////////"<<endl<<"donner le code : ";cin>>code;
    cout<<"donner le nombre exemplaire a diminue :";cin>>nbr;
    b.diminuerNbExp(code,nbr);
    b.afficher_bib();
    cout<<"//////////////////////"<<endl<<"donner le code : ";cin>>code1;
    cout<<"donner le nombre exemplaire a diminue :";cin>>nbr1;
    b.ajouterNbExp(code1,nbr1);
    b.afficher_bib();
    return 0;
}
