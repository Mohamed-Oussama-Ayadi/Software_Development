#include <iostream>
#include"Point.h"
using namespace std;

int main()
{
   Point A(1,2);
   Point B(5,2);
   Point C, D;
 //A+=B;
 cout<<"A";
 A.afficher();
 cout<<"B";
 B.afficher();
 D=A+2;
 //D=2+A; faux impossible
 cout<<"D";
 D.afficher();


/*C=A+B;
 C.afficher();*/

    return 0;
}
