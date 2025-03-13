#include "compte.h"
#include <iostream>

using namespace std;
compte::compte()
{
    this->RIB=0;
    this->solde=0;
}

compte::~compte()
{
    //dtor
}
compte::compte(int RIB,double solde){
    this->RIB=RIB;
    this->solde=solde;
}
void compte::deposer_argent(double argent)
{
    solde+=argent;
}
void compte::retirer_argent(double argent)
{
    if(solde>argent)
    {
       solde-=argent;
    }
    else
    {
        cout<<"on ne pas retirer"<<endl;
    }

}
void compte::afficher(){
    cout<<"RIB : " <<RIB<<endl;
    cout<<"Solde : "<<solde<<endl;
}
