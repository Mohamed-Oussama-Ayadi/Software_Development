#include <iostream>
#include "Compte.h"
#include "C_Courant.h"
#include "C_Epargne.h"
#include "Banque.h"
using namespace std;

int main()
{ Compte c1(123,1000);
 /* C_Epargne ce(256,2000,0.05);
  C_Courant cc(678,3000,0.1);*/
  Banque B;
  c1.afficher();
  B.AjouterCompte(c1);
  B.AfficherBanque();
  B.ModifierSolde(123);
 /* B.AjouterCompteE(ce);
  B.AjouterCompteC(cc);*/
  B.AfficherBanque();
  c1.afficher();

    return 0;
}
