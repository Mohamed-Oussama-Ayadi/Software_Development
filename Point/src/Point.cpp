#include "Point.h"

Point::Point()
{
    //ctor
}
Point::Point(int a , int b)
{
    x=a;
    y=b;
}
Point operator+(int a, const Point& k)
{
    Point R(a+k.x,a+k.y);
    return R;
}
void Point::afficher()
{
    cout<<"("<<x<<","<<y<<")"<<endl;
}
Point::~Point()
{
    //dtor
}
