#include <iostream>
#include "notes.h"
using namespace std;

int main()
{ Notes N1(10,12,15,11,17,9.5);
  Notes N2(11.5,13,18,10,12.5);
  cout<<"Moyenne N1:"<<N1.calculMoyenne()<<endl;
 cout<<"Moyenne N2:"<<N2.calculMoyenne()<<endl;
  if(N1.calculMoyenne()>N2.calculMoyenne())
      cout<<"Moyenne N1:"<<N1.calculMoyenne()<<"est la plus grande"<<endl;
    else  cout<<"Moyenne N2:\n"<<N2.calculMoyenne()<<"\nest la plus grande"<<endl;

    return 0;
}
