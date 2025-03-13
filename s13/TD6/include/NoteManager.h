#ifndef NOTEMANAGER_H
#define NOTEMANAGER_H

#include <iostream>
#include <vector>
using namespace std;
#include "Note.h"
class NoteManager
{
    public:
        NoteManager();
        NoteManager(NoteManager&);
       ~NoteManager();
       vector<Note*>iterator::chercherNote(int N);

        vector<Note> GettabN() { return tabN; }
        void SettabN(vector<Note> val) { tabN = val; }

    protected:

    private:
        vector<Note> tabN;
};

#endif // NOTEMANAGER_H
