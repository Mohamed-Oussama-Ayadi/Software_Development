#include "C_Courant.h"

C_Courant::C_Courant()
{
    //ctor
    seuil=-500;
}
C_Courant::C_Courant(int rib,float solde,int seuil):Compte(rib,solde)
{
    this->seuil=seuil;
}
C_Courant::~C_Courant()
{
    //dtor
}
bool C_Courant::retirer(double montant)
{
    if(solde - montant >= -500)
    {
        solde -= montant;
        return true;
    }
    return false;
}

void C_Courant::afficher()  //redéfinition
{
    Compte::afficher(); // appel à la methode afficher de la classe mére
   // cout << "Seuil : " << seuil << endl;
}
