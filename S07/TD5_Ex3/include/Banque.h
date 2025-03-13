#ifndef BANQUE_H
#define BANQUE_H
#include <vector>
#include <iostream>
#include "Compte.h"
#include "C_Courant.h"
#include "C_Epargne.h"
#include <algorithm>
using namespace std;

class Banque
{
    public:
        Banque();
        virtual ~Banque();

       /* vector<Compte> GetC() { return TabC; }
        void SetC(vector<Compte> val) { C = val; }
        vector<C_Epargne> GetCE() { return CE; }
        void SetCE(vector<C_Epargne> val) { CE = val; }
        vector<C_Courant> GetCC() { return CC; }
        void SetCC(vector<C_Courant> val) { CC = val; }*/
        vector <Compte *>::iterator chercher (int RIB);
    void AjouterCompte( Compte &c);

     void AjouterCompteC(C_Courant &cc);
      void  AjouterCompteE( C_Epargne &ce); void AfficherBanque();
      bool ModifierSolde(int RIB);


    protected:

    private:
        vector<Compte *> TabC;





};

#endif // BANQUE_H
