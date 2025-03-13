#include "notes.h"
using namespace std;
Notes::Notes(){
    test1=0;
     test2=0;
    ds=0;
     examen=0;
    orale=0;
     tp=0;
    avectp= true;
}
Notes::Notes(float test1,float test2,float ds,float examen,float orale,
float tp)
    {
           this->test1=test1;
   this->test2=test2;
    this->ds=ds;
    this->examen=examen;
    this->orale=orale;
    this->tp=tp;
    }
    Notes::Notes(float t1,float t2,float d,float e,float o){
         test1=t1;
   test2=t2;
   ds=d;
   examen=e;
    orale=o;
    avectp=false;
    }
   float Notes::calculNCC(){
     return   ((test1+test2+orale+(2*ds))/5);
   }
float Notes::calculMoyenne(){
  if(avectp)
  {
      return ((calculNCC()*0.3)+(tp*0.2)+(examen*0.5));
  }
  else
    return ((calculNCC()*0.4)+(examen*0.6));
  }
