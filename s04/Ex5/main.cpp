#include <iostream>
#include "voyage.h"
#include "hebergement.h"
using namespace std;

int main()
{ // Créer deux hébergements
    Hebergement hebergement1("Boulevard de la Promenade, 8050 Hammamet, Tunisie", 5, "Yasmine Beach");
    Hebergement hebergement2("BP437 / Hammamet 8050 / Tunisie", 2, "la Badira Hammamet");

    // Créer un voyage
    Voyages voyage1(1, "Paris", "Tunis", "10/03/2023", "17/03/2023", 1500, 0);

    // Affecter un hébergement à ce voyage
    voyage1.setHebergement(&hebergement1);

    // Accéder à ce voyage et modifier le nombre des étoiles à 1
    hebergement1.setNbreEtoiles(1);

    // Afficher les détails de ce voyage avec les détails de son hébergement (sans passer par la méthode afficher)
    voyage1.afficher();
    return 0;
}
