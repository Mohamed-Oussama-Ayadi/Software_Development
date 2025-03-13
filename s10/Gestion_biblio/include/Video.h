#ifndef VIDEO_H
#define VIDEO_H

#include <Ouvrage.h>

#include<string>

class Video : public Ouvrage
{
    public:
        Video();
        virtual ~Video();

         string Getediteur() { return editeur; }
        void Setediteur( string val) { editeur = val; }
        float Getduree() { return duree; }
        void Setduree(float val) { duree = val; }

    protected:

    private:
         string editeur;
        float duree;
};

#endif // VIDEO_H
