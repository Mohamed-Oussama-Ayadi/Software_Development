#ifndef NOTE_H
#define NOTE_H
#include <iostream>
#include <string>
using namespace std;


class Note
{
    public:
        Note();
        virtual ~Note();

        int Getid() { return id; }
        void Setid(int val) { id = val; }
        string Getobjet() { return objet; }
        void Setobjet(string val) { objet = val; }
        string Getdescription() { return description; }
        void Setdescription(string val) { description = val; }
        string Getdate() { return date; }
        void Setdate(string val) { date = val; }

    protected:

    private:
        int id;
        string objet;
        string description;
        string date;
};

#endif // NOTE_H
