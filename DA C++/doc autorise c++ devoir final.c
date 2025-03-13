///.h
#include <typeinfo>
#include <fstream>

#include <iostream>
#include <string>
#include <vector>
using namespace std;
///classe de gestion et classe mere
virtual ~compte();
virtual void const afficher();

///getter et setter///
 string Getmatricule() const{ return matricule; }
 void Setmatricule(string val) { matricule = val; }
 string Getespece() const{ return espece; }
 void Setespece(string val) { espece = val; }


///constructeur///lezem avec constructeur par defaut et parametree
Zoo::Zoo(const Zoo& zo)
{
    //lesVeterinaires=zo.lesVeterinaires;
    Animal *p;

    vector< Animal*>::const_iterator i;
    for(i=zo.lesAnimaux.begin(); i!=zo.lesAnimaux.end(); i++)
    {
        if(typeid(**i)==typeid( Animal))
        {
            p=new  Animal (**i);
        }
        else
        {
            p=new Lion (static_cast<const Lion&>(**i));
        }

        lesAnimaux.push_back(p);

    }
}

Banque::Banque(const Banque& B)
{compte *p;
    for(list<compte*>::iterator i=B.MesComptes.begin;i!=B.MesComptes.end();i++)
    {
       if(typeid(**i)==typeid(compte))
       {
           p=new compte(**i);
       }
       else if (typeid(**i)==typeid(CompteEpar))
       {
            p=new CompteEpar(static_cast<const CompteEpar&>(**i));
       }
       else
       {
            p=new CompteCourant(static_cast<const CompteCourant&>(**i));
       }
       MesComptes.push_back(p);
    }
}
///destructeur de la classe gestion////
Zoo::~Zoo()
{
    //dtor
    for(vector<Animal*>::iterator it=lesAnimaux.begin(); it!=lesAnimaux.end(); it++)
        delete(*it);
}


/////vecteur////
vector <string> datesVaccins;
vector<Animal*> lesAnimaux; ///heritage
vector<MedecinVeterinaire> lesVeterinaires; ///simple

///f kol classe mere
        Animal();
        Animal(string, string); // ou bien fonction de saisir
        virtual ~Animal();
///f classe normal
             ~Zoo();
             Zoo();
             zoo(const zoo &zo);
///f classe fille constructeur parametree
Lion::Lion(string matricule, string espece, float quanttViande):Animal(matricule,espece)
{
    this->quanttViande=quanttViande;

}

///.cpp
//////////recherche/////////////
vector<Animal*>::iterator Zoo::chercherAnimal(string matricule)
{
    for(vector<Animal*>::iterator it=lesAnimaux.begin(); it!=lesAnimaux.end(); it++)
    {
        if((*it)->Getmatricule()==matricule)
            return it;
    }
    return lesAnimaux.end();


}

vector<MedecinVeterinaire>::iterator Zoo::chercherVeterinaire(int id)
{
    for(vector<MedecinVeterinaire>::iterator it=lesVeterinaires.begin(); it!=lesVeterinaires.end(); it++)
    {
        if((it)->GetidVeterinaire()==id)
            return it;
    }
    return lesVeterinaires.end();

}

////verifier//
bool MedecinVeterinaire::verifierAnimal(string matricule)
{
    for(unsigned i=0; i<matriculesAnimaux.size(); i++)
    {
        if(matriculesAnimaux[i]==matricule)
        {
            return true;
        }
    }
    return false;
}

//////////ajouter////////////////////
bool Animal::ajouterVaccin(string date)
{
    //vérifier unicté de la date.
    for(vector<string>::iterator it=datesVaccins.begin(); it!=datesVaccins.end(); it++)
    {
        if((*it)==date)
        {
            cout<<"Vaccin existe dèjà!!"<<endl;
            return false;
        }
    }

        datesVaccins.push_back(date);
        cout<<"Vaccin ajouté"<<endl;
        return true;
}

bool Zoo::ajouter(const Animal& an)
{
    if(chercherAnimal(an.Getmatricule())==lesAnimaux.end())
    {
        Animal* p=new Animal(an);
        lesAnimaux.push_back(p);
        return true;
    }
    return false;

}
bool Zoo::ajouter(const Lion& ln)
{
    if(chercherAnimal(ln.Getmatricule())==lesAnimaux.end())
    {
        Animal* p=new Lion(ln);
        lesAnimaux.push_back(p);
        return true;
    }
    return false;

}
///ou
 void ajouterCompte(compte const &C)
 {compte * c1 =new compte(C);
MesComptes.push_back(c1);
 }
void ajouterCompteEpar(CompteEpar const &CE)
{
compte * c1 =new CompteEpar(CE);
MesComptes.push_back(c1);
}
///
bool Zoo::ajouter (const MedecinVeterinaire& vt)
{

    if(chercherVeterinaire(vt.GetidVeterinaire())==lesVeterinaires.end())
    {
        lesVeterinaires.push_back(vt);
        return true;
    }
    return false;
}
//ajout wast ajout//
 bool Zoo::ajouterDateVaccinAnimal(string matricule, string date){
  vector<Animal*>::iterator itAn=chercherAnimal(matricule); //verification
  if(itAn!=lesAnimaux.end())
   {
      (*itAn)->ajouterVaccin(date);
      return true;
   }

    cout<<"Animal n existe pas!"<<endl;
    return false;
 }

 ///////////////afficher//////////
 void Zoo::afficherZoo()const
{

    cout<<"Zoo : "<<adresse<<endl;
    cout<<"liste des animaux: "<<endl;
    for(vector<Animal*>::const_iterator itAn=lesAnimaux.begin(); itAn!=lesAnimaux.end(); itAn++)
        (*itAn)->afficherAnimal();
    cout<<"liste des medecins veterinaires: "<<endl;
    for(vector<MedecinVeterinaire>::const_iterator itVt=lesVeterinaires.begin(); itVt!=lesVeterinaires.end(); itVt++)
        itVt->afficherVeterinaire();
}
void Lion::afficherAnimal()const
{
    Animal::afficherAnimal();
    cout<<"Quantité de la viande consommée: "<<quanttViande<<endl;

}
void Animal::afficherAnimal()const
{
    cout<<"Animal:  "<<matricule<<" de l'espèce: "<<espece<<endl;
    cout<<"Les dates de< vaccins: "<<endl;
    for(unsigned int i=0; i< datesVaccins.size(); i++)
        cout<<datesVaccins[i]<<endl;

}
void MedecinVeterinaire::afficherVeterinaire()const
{
    cout<<"Veterinaire: "<<idVeterinaire<<" , "<<nom<<" , "<<prenom<<endl;
    cout<<"Les matricules des animaux: "<<endl;
    for(unsigned i=0; i<matriculesAnimaux.size(); i++)
        cout<<"matricule animal "<<i+1<<" : "<<matriculesAnimaux[i]<<endl;
}

void Zoo::afficherAnimauxVeterinaires(int id)
{
    vector<MedecinVeterinaire>::iterator itVt=chercherVeterinaire(id);
    if(itVt!=lesVeterinaires.end())
    {
        for(vector<Animal*>::iterator itAn=lesAnimaux.begin(); itAn!=lesAnimaux.end(); itAn++)
        {
            if(itVt->verifierAnimal( (**itAn).Getmatricule()))
                (**itAn).afficherAnimal();
        }

    }
    else
        cout<<"Veterinaire n existe pas!!"<<endl;
}
////////////affecter///////////////
void Zoo::affecterAnimalVeterinaire(string matricule, int idVet)
{
    vector<MedecinVeterinaire>::iterator itVt=chercherVeterinaire(idVet);
    vector<Animal*>::iterator itAn=chercherAnimal(matricule);
    try
    {
        if(itVt!=lesVeterinaires.end() && itAn!=lesAnimaux.end()&& !itVt->verifierAnimal(matricule))
            itVt->ajouterMatriculeAnimal(matricule);
        else
            throw string("Animal ou Veterinaire inexistant ou bien animal deja affecte au veterinaire\n");

    }
    catch (string const& ch)
    {
        cerr<<ch<<endl;
    }

}

/////total haja///////
int Zoo::totalAnimauxEnCharge()
{
    MedecinVeterinaire vtr;

    for(vector<MedecinVeterinaire>::iterator itVt=lesVeterinaires.begin(); itVt!=lesVeterinaires.end(); itVt++)
    {
        vtr+=(*itVt);

    }

    return vtr.GetmatriculesAnimaux().size();

}


/////////enregister dans un fichier//////
void Zoo::enregistrerLions(int seuil)
{

    ofstream fichier("Lions.txt");
    if(fichier)
    {
        for(vector<Animal*>::iterator itAn=lesAnimaux.begin(); itAn!=lesAnimaux.end(); itAn++)
        {
            if(typeid(**itAn)==typeid(Lion))
            {
                Lion *ln = (Lion*)(*itAn);
                if(ln->GetquanttViande()>seuil)
                {
                    fichier<<"lion: "<<ln->Getmatricule()<<","<<ln->Getespece()<<","<<ln->GetquanttViande()<<'\n';
                    fichier<<"les dates des vaccins:"<<'\n';
                    for(unsigned i=0;i<ln->GetdatesVaccins().size();i++)
                        fichier<<ln->GetdatesVaccins()[i]<<'\n';

                }
            }


        }
        cout<<"enregistrement terminé"<<endl;
        fichier.close();
    }
    else
        cout<<"erreur d'ouverture "<<endl;
}

//////////operator ///////
///=///
Zoo& Zoo::operator=(const Zoo& zo)
{
    if(this!=&zo)
    {
        for(vector<Animal*>::iterator it=lesAnimaux.begin(); it!=lesAnimaux.end(); it++)
            delete(*it);
        lesAnimaux.clear();
       // lesVeterinaires=zo.lesVeterinaires;
        Animal *p;

        vector< Animal*>::const_iterator i;
        for(i=zo.lesAnimaux.begin(); i!=zo.lesAnimaux.end(); i++)
        {
            if(typeid(**i)==typeid( Animal))
            {
                p=new  Animal (**i);
            }
            else
            {
                p=new Lion (static_cast<const Lion&>(**i));
            }

            lesAnimaux.push_back(p);

        }


    }
    return(*this);

}
///+=///
MedecinVeterinaire& MedecinVeterinaire::operator+=(const MedecinVeterinaire& vt)
{
    for(unsigned i=0; i<vt.matriculesAnimaux.size(); i++)
        matriculesAnimaux.push_back(vt.matriculesAnimaux[i]);
    return(*this);

}


///////////main exemple ////////////////
#include <iostream>
#include "Zoo.h"
using namespace std;

int main()
{

    Animal A1("A001","carnivore");
    Animal A2("A002","herbivore");
    Animal A3("A002","herbivore");
    ///
    Lion L1("L003","carnivore",3.5);
    Lion L2("L004","carnivore",4.5);
    ///
    MedecinVeterinaire V1(123,"ali", "bel ali");
    MedecinVeterinaire V2(123,"ali", "bel ali");
    MedecinVeterinaire V3(124,"ali", "bel ali");
    ///
    cout<<"*******************Ajout dans ZOO**********************"<<endl;
    Zoo Zo("Belvidaire");
    Zo.ajouter(A1);
    Zo.ajouter(A2);
    Zo.ajouter(A3);
    Zo.ajouter(L1);
    Zo.ajouter(L2);
    Zo.ajouter(V1);
    Zo.ajouter(V2);
    Zo.ajouter(V3);
    cout<<"******************Ajout des vaccins ************************"<<endl;
    Zo.ajouterDateVaccinAnimal("A001", "22/01/2019");
     Zo.ajouterDateVaccinAnimal("A001","22/01/2019");
     Zo.ajouterDateVaccinAnimal("A001","22/01/2020");
    Zo.ajouterDateVaccinAnimal("A002","22/03/2018");
     Zo.ajouterDateVaccinAnimal("L003","22/03/2017");
     Zo.ajouterDateVaccinAnimal("L003","22/03/2016");
    Zo.ajouterDateVaccinAnimal("L004","22/03/2018");
   Zo.ajouterDateVaccinAnimal("L004","22/04/2018");
    cout<<"********************affecter animaux aux veterinaires ********************"<<endl;
    Zo.affecterAnimalVeterinaire("A001",123);
    cout<<"***************************************************"<<endl;
    Zo.affecterAnimalVeterinaire("A002",123);
    cout<<"***************************************************"<<endl;
    //lever exception.... animal inexistant
    Zo.affecterAnimalVeterinaire("L001",123);
     cout<<"***************************************************"<<endl;
    Zo.affecterAnimalVeterinaire("L003",123);
     cout<<"***************************************************"<<endl;
    Zo.affecterAnimalVeterinaire("L004",124);
     cout<<"****************afficher ZOO ************************"<<endl;
    ///
    Zo.afficherZoo();
     cout<<"*************affichage animaux par veterinaire ***********************"<<endl;
    ///
    Zo.afficherAnimauxVeterinaires(123);
     cout<<"***************************************************"<<endl;
    ///
    cout<<"Nombre total des animaux pris en charge: "<<Zo.totalAnimauxEnCharge()<<endl;
     cout<<"***************************************************"<<endl;
    ///
    Zo.enregistrerLions(4);
     cout<<"***************************************************"<<endl;


    return 0;
}

