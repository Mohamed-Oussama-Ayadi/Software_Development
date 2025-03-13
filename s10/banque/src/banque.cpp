#include "banque.h"
banque::~banque()
{
   /* cout<<"je suis le destructeur de la classe banque"<<endl;
    vector<compte*>::iterator i;
    for(i=TabC.begin(); i!=TabC.end();i++)
    {
        delete(*i);
    } */
}
banque::banque(const banque&b)
{
    Compte*p;
    for(vector<Compte*>::const_iterator i=B.tab.begin(); i != B.tab.end(); i++)
    {
        if(typeid(**i)==typeid(Compte))
        {
            p = new Compte(**i);
        }
        else if(typeid(**i)==typeid(CompteEpargne))
        {
            p=new CompteEpargne(static_cast<const CompteEpargne&>(**i));
        }
        else
        {
            p=new CompteCourant(static_cast<const CompteCourant&>(**i));
        }
        tab.push_back(p);

    }

}

vector <compte*>::iterator banque::rechercher(int RIB)
{
    vector <compte*>::iterator it;
    for(it=TabC.begin();it!=TabC.end();it++)
    {
        if((**it).GetRIB()==RIB)
        {
            return it;
        }

    }
    return TabC.end();
}

void banque::Ajouter(CompteEpargne &ce)
{
  if(rechercher(ce.GetRIB())==TabC.end())
    {
        CompteEpargne * ba=new CompteEpargne(ce);
        TabC.push_back(ba);
    }
}
void banque::Ajouter(compte &c)
{
    if(rechercher(c.GetRIB())==TabC.end())
    {
        compte * ba=new compte(c);
        TabC.push_back(ba);
    }
}
void banque::Ajouter(CompteCourant &cc)
{
    if(rechercher(cc.GetRIB())==TabC.end())
    {
        CompteCourant * ba=new CompteCourant(cc);
        TabC.push_back(ba);
    }
}
void banque::afficherBanque()
{
    vector <compte*>::iterator it;
    for(it=TabC.begin();it!=TabC.end();it++)
    {
        (*it)->afficher();
    }
}
bool banque::modifier (int RIB)

{
    vector <compte*>::iterator i ;
    int solde;
    for(i=TabC.begin(); i!=TabC.end(); i++)
    {
        if((**i).GetRIB()== RIB)
        {
            cout<<"donner le solde de nouveau : ";
            cin>>solde;
            (**i).Setsolde(solde);
            return true;
        }
    }
    return false;
}

