#ifndef ABONNE_H
#define ABONNE_H
#include <iostream>

using namespace std;

#include <string>
class Abonne
{
    public:
        Abonne();
        virtual ~Abonne();

        int Getid() { return id; }
        void Setid(int val) { id = val; }
        string Getnom() { return nom; }
        void Setnom(string val) { nom = val; }
        int Getnum() { return num; }
        void Setnum(int val) { num = val; }
        string Gettitre() { return titre; }
        void Settitre(string val) { titre = val; }

    protected:

    private:
        int id;
        string nom;
        int num;
        string titre;
};

#endif // ABONNE_H
