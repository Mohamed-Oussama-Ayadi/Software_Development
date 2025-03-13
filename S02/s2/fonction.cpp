#include "fonctions.h"
using namespace std;
/*void Etudiants ::saisir()
{int i;
    cout<<"nom etudiant:"<<endl;
    cin>>nom;
     cout<<"prenom etudiant:"<<endl;
    cin>>prenom;
     for(i=0;i<3;i++)
     {cout<<"Tableau de note:"<<endl;
    cin>>tab_note[i];
    }
}
void Etudiants::afficher()
{int i;
   cout<<"nom etudiant:"<<nom<<endl;
     cout<<"prenom etudiant:"<<prenom<<endl;
for(i=0; i<3; i++) cout << "Tableau de note: " << i <<" est : "<< tab_note[i] <<endl;
}
float Etudiants::moyenne()
{ int i;
 float s=0,moy;
for(i=0;i<3;i++)
{
    s=tab_note[i]+s;
}
 moy=s/3;
 cout<<"Moyenne etudiant:"<<moy<<endl;
return moy;
}
bool Etudiants::admis()
{float moy;


if(moy>=10)
{ //test="true";
    cout<<"Admis"<<endl;
}
else if(moy<10)
    {
    cout<<" Non Admis"<<endl;
}
}
int Etudiants::exae_quo(Etudiants E)
{


    if(E.moyenne()>moyenne())
    {  cout<<" Resultat"<<endl;
   return -1;
    }
    else if(E.moyenne()==moyenne())
    { cout<<" Resultat"<<endl;
        return 0;
    }
    else if(E.moyenne()!=moyenne())
    { cout<<" Resultat"<<endl;
        return 1;
    }
}*/
//ex3 TD2
void Abonne::saisir(){
     cout<<"nom abonne:"<<endl;
    cin>>nom;
     cout<<"prenom abonne:"<<endl;
    cin>>prenom;
     cout<<"numero d'appel:"<<endl;
    cin>>num;
     cout<<"CIN:"<<endl;
    cin>>CIN;
     cout<<"Solde abonnee:"<<endl;
    cin>>solde;
}
void Abonne::afficher()
{    cout<<"nom abonne:"<<nom<<endl;

     cout<<"prenom abonne:"<<prenom<<endl;

     cout<<"numero d'appel:"<<num<<endl;

     cout<<"CIN:"<<CIN<<endl;

     cout<<"Solde abonnee:"<<solde<<endl;

}
float Abonne::recharger(float montant)
{
    return (solde +=montant);
}
