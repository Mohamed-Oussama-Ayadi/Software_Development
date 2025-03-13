#include <iostream>
#include "../include/Ouvrier.h"
#include "../Employe.h"
using namespace std;

int main()
{
    Ouvrier o1;
    o1.saisir();
    o1.Setheuresupp(25);
    o1.afficher();
    return 0;
}
