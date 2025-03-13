#include "fonctions.h"
#include "ecole.h"
#include <vector>
#include <algorithm>

int Ecole::chercher(int num){
  for(int i=0;i<E.size();i++)
  {
      if(E[i].getid()==num)

          return i;

  }
  return -1;
}
void Ecole::ajouter( Etudiants &e)
{
    if(chercher(e.getid())==-1)
    {
        E.push_back(e);
    }
    else cout<<"etudiant existe"<<endl;
}
void Ecole::afficher(){



for( vector<Etudiants>::iterator it=E.begin(); it!=E.end();++it)
{
    it->afficher();
    //(*it).afficher();
}
}
void Ecole::supprimer(int num){
int  ind=chercher(num);
 if(ind!=-1)
    E.erase(E.begin()+ind);
 }
 void Ecole::afficherClasse(string cl){
 vector<Etudiants>::iterator it;
 for(it=E.begin();it!=E.end();++it)
 {
     if(it->getClasse()=cl)
        it->afficher();
 }

}
