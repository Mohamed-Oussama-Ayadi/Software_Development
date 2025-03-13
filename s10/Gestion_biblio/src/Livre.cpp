#include "Livre.h"

Livre::Livre()
{
    //ctor
}
Livre::Livre(string auteur)
{
    this->auteur=auteur;
}
void Livre::afficher()
{
    cout<<"auteur:"<<auteur<<endl;
}
Livre::~Livre()
{
    //dtor
}
