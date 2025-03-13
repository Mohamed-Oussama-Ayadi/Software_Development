#include "NoteManager.h"

NoteManager::NoteManager()
{
    //ctor
}
NoteManager::NoteManager(NoteManager&nm)
{
    Note*p;
    for(vector<Note*>::const_iterator i=nm.tabN.begin(); i !=nm.tabN.end();i++)
    { if(typeid(**i)==typeid(Note))
        {
            p=new Note(**i);
        }
         else if(typeid(**i)==typeid(Tag))
        {
            p=new Note(static_cast<const Tag&>(**i));
        }
      tabN.push_back(p);
    }
}
NoteManager::~NoteManager()
{
    //dtor
    for(i=tabN.begin(); i!=tabN.end();i++)
    {
        delete(*i);
    }

}
vector<Note*>::iterator NoteManager::chercherNote(int N)
{

}
