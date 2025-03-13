#include "Point.h"

Point::Point(int a, int b)
{
    //ctor
    X=a;
    Y=b;
}
 Point Point::operator+=(Point& k)
 {
     X+=k.X;
     Y+=k.Y;
     return *this;
 }
 Point Point::operator+(Point& k)
 {
     Point R(X+k.X,Y+k.Y);
     return R;
 }
 Point Point::operator+(int a)
 { Point r(X+a,Y+a);
     return r;

 }
 Point operator+(int a, Point&k)
 {
         Point R(a+k.X,a+k.Y);
     return R;
 }
void Point::afficher()
{
    cout<<"("<<X<<","<<Y<<")";
}
Point::~Point()
{
    //dtor
}
