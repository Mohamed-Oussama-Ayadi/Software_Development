#include <iostream>

using namespace std;
#include "Point.h"
int main()
{
  Point c , D;
  Point A(1,2);
  Point B(5,2);
  cout<<"A";
  A.afficher();
  cout<<"B";
  B.afficher();
  D=2+A;
  cout<<"D";
  D.afficher();

  return 0;
}
