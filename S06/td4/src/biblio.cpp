#include "biblio.h"
#include "Ouvrage.h"
biblio::biblio()
{

    //ctor
}

biblio::~biblio()
{
    //dtor
}
 list<Ouvrage>::iterator biblio::recherche(int c)
{
    for(list<Ouvrage>::iterator it=tab.begin();it!=tab.end();++it)
{  if(it->Getcode()==c)

    return it;
}
return tab.end();
}
 void biblio::ajouter( Ouvrage &O)
{ if (recherche(O.Getcode())==tab.end())
{
 tab.push_back(O);
}
else cout<<"L'ouvrage existe"<<endl;
}
void biblio::afficher(){
     list<Ouvrage>::iterator it;
     for(it=tab.begin();it!=tab.end();++it)
     {
         it->afficher();
         cout<<it->totalOuvrage()<<endl;
     }

}
void biblio::diminuerNBExp(int c , int n)
{
    list<Ouvrage>::iterator it;
    if(recherche(c)!=tab.end())
    {
        it->Setnbr_exp
    }
}
