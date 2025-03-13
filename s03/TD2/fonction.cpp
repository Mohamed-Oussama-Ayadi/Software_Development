#include <iostream>
#include "Fonctions.h"
using namespace std;
/*void compte::saisir()
{
    cout<<"donnez le num de compte : "<<endl;
    cin>>numCompte;
    cout<<"donnez le solde: "<<endl;
    cin>>solde;
      cout<<"donnez le nom : "<<endl;
    cin>>nomProprietaire;
}

bool compte::retirerargent(float montant)
{
    if(montant>solde)
        return false ;
    else
    {
        solde-=montant;
        return true;
    }
}
float compte::deposerargent(float montant)
{
    return solde+=montant;
}
void compte::consultersolde()
{
    cout<<"le num de compte est: "<<numCompte<<" le solde actuel est: "<<solde<<endl;
}
void compte::transfererargent(compte &c)
{  float m;
   cout<<"montant: "<<endl;
   cin>>m;
   if(retirerargent(m))
   {
       c.deposerargent(m);
   }
   else
    cout<<"impossible!!"<<endl;
}*/
/*compte::compte(){
      rib=0;
     solde=0;}
compte::compte(int r ,float s){
      rib=r;
     solde=s;}
    /* compte::compte(int rib ,float solde){
      this->rib=rib;
     this->solde=solde;}*/

     ~ compte(){
     delete c;}
     void compte::consultersolde()
{   cout<<" RIB "<<rib<<endl;
    cout<<" le solde actuel est: "<<solde<<endl;
}
