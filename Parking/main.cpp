#include <iostream>
#include "Abonnement.h"
#include "Carte.h"
#include "Gestion.h"
#include"Parking.h"
using namespace std;

int main()
{
     Gestion g;
    Carte c(1,12,5);
    Abonnement a(2,12,5,"a");
    Parking p(1,20);

    g.ajouter(c);
    g.ajouter(a);
    g.ajouter(p);
    g.afficherGestion();
    g.supprimercarte(c);
    g.afficherGestion();
    cout<<"******************************"<<endl;
    g.moinRentable()->afficherParking();
    return 0;
}
