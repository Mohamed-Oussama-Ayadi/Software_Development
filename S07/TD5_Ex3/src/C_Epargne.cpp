#include "C_Epargne.h"

C_Epargne::C_Epargne()
{
    taux=0;
    //ctor
}
C_Epargne::C_Epargne(int rib,float solde,float taux):Compte(rib,solde)
{
    this->taux=taux;
}
void C_Epargne::saisir()
{
    cout << "Donner le RIB " << endl;
    cin >> rib;
    cout << "DOnner le taux " << endl;
    cin >> taux;

    do
    {
        cout << "Donner le solde " << endl;
        cin >> solde;
    }while(solde < 5);
}

float C_Epargne::calculInteret()
{
    return ((solde+(solde*taux))/100);
}
void C_Epargne::afficher(){
    Compte::afficher();
    cout<<"Taux:\n"<<taux<<endl;
}
bool C_Epargne::retirer(float m)
{ if (solde - m>5)
   {
       solde-=m;
       return true;
   }
   else return false;
}




C_Epargne::~C_Epargne()
{
    //dtor
}
