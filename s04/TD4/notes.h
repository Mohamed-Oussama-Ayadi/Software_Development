#ifndef NOTES_H_INCLUDED
#define NOTES_H_INCLUDED
#include <iostream>
using namespace std;
class Notes{
private:
    float test1;
    float test2;
    float ds;
    float examen;
    float orale;
    float tp;
    bool avectp;
public:
    Notes();
    Notes(float,float,float,float,float,float);
    Notes(float,float,float,float,float);
    float calculMoyenne();
private:
    float calculNCC();
    };


#endif // NOTES_H_INCLUDED
