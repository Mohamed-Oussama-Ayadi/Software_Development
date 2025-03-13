#include "CompteEpargne.h"
#include <iostream>

using namespace std;
CompteEpargne::CompteEpargne():compte()
{
    taux_interet=0;
}

CompteEpargne::~CompteEpargne()
{
}
CompteEpargne::CompteEpargne(int RIB,double solde,double taux_interet):compte(RIB,solde)
{
    this->taux_interet=taux_interet;
}
void CompteEpargne::calcul_interet_annuel(){
    double x=(solde*taux_interet)/100+solde;
    cout<<"l'interet annual : "<<x<<endl;
}
/*void CompteEpargne::afficher(){
    compte::afficher();
    cout<<"taux d'interet : "<<taux_interet<<endl;
}*/
void CompteEpargne::afficher()
{
    compte::afficher();
    cout<<"taux : "<<taux_interet<<endl;
}
