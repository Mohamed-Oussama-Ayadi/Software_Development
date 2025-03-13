#include "Banque.h"

Banque::Banque()
{
    //ctor
}

Banque::~Banque()
{
    //dtor
}
vector<Compte *>::iterator Banque:: chercher(int RIB)
{
    vector<Compte *>::iterator it;
    for(it=TabC.begin();it!=TabC.end();it++)
    {

        if((*it)->Getrib()==RIB)
            return it;
    }
    return TabC.end();
}
void Banque::AjouterCompte(Compte &c)
{
    if( chercher(c.Getrib())==TabC.end())
    {
        //Compte* ptrC=&c;
        Compte *p=new Compte(c);
        TabC.push_back(p);
    }
    else
        cout << "compte existe"<<endl;
}
void Banque::AjouterCompteE(C_Epargne &ce)
{
    if( chercher(ce.Getrib())==TabC.end())
    {
        C_Epargne* ptrCE=&ce;
        TabC.push_back(ptrCE);
    }
    else
        cout << "compte existe"<<endl;
}
void Banque::AjouterCompteC(C_Courant &cc)
{
    if( chercher(cc.Getrib())==TabC.end())
    {
        C_Courant* ptrCC=&cc;
       TabC.push_back(ptrCC);
    }
    else
        cout << "compte existe"<<endl;
}
void Banque::AfficherBanque()
{
    vector<Compte *>::iterator it;
     for(it=TabC.begin(); it!=TabC.end(); it++)
    {

        (*it)->afficher();
        //    (**i).afficher();
    }
}
 bool ModifierSolde(int RIB)
 {
     vector <Compte *>::iterator it;
     it=chercher(RIB);
     if(it!=TabC.end())
     {
         (*it)->Setsolde(555);
     }
 }
