#include "bibliotheque.h"
using namespace std;
#include <iostream>
bibliotheque::bibliotheque()
{
    //ctor
}

bibliotheque::~bibliotheque()
{
    //dtor
}
void bibliotheque::afficher_bib(){
    list <ouvrage>::iterator it = o.begin();
    for(;it!=o.end();it++)
    {
        it->afficher_ouvrage();
        cout<<it->totalOuvrage()<<endl;
    }

}
double bibliotheque::prixTotal(){
    double total=0;
    list <ouvrage>::iterator it = o.begin();
    for(;it!=o.end();it++)
    {
        total+=it->totalOuvrage();
    }
    return total;
}
list<ouvrage>::iterator bibliotheque::rechercher(int code){
    for(list <ouvrage>::iterator it= o.begin();it!=o.end();it++){
        if(it->Getcode()== code)
        {
            return it;
        }
    }
    return o.end();
}
void bibliotheque::ajouter(ouvrage o1){
    if(rechercher(o1.Getcode())==o.end())
    {
        o.push_back(o1);
    }
    else
    {
        cout << "existe deja";
    }


}
void bibliotheque::diminuerNbExp(int code,int n)
{
  list<ouvrage>::iterator i = rechercher(code);
    if(i==o.end())
    {
        cout <<" n'exite pas "<<endl;
    }
    else
    {
       int nbr = i->Getnbr_exemplaire() - n;
      i->Setnbr_exemplaire(nbr);
    }
}
void bibliotheque::ajouterNbExp(int code,int n)
{
  list<ouvrage>::iterator i = rechercher(code);
    if(i==o.end())
    {
        cout <<" n'exite pas "<<endl;
    }
    else
    {
       int nbr = i->Getnbr_exemplaire() + n;
      i->Setnbr_exemplaire(nbr);
    }
}
