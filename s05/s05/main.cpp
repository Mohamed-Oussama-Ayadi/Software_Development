#include <iostream>
#include <vector>
#include <algorithm>
#include "fonctions.h"
#include"ecole.h"
using namespace std;

int main()
{   Ecole ec;
    Etudiants Et1("nawel","esp","2a12","22/02/2023",1);

ec.ajouter(Et1);
ec.afficher();

    return 0;
}
