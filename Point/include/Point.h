#ifndef POINT_H
#define POINT_H
#include <iostream>
using namespace std;
class Point
{
    public:
        Point();
        Point(int,int);
        virtual ~Point();

        int Getx() { return x; }
        void Setx(int val) { x = val; }
        int Gety() { return y; }
        void Sety(int val) { y = val; }
        void afficher();
        friend Point operator+(int, const Point&);
    protected:

    private:
        int x;
        int y;
};
Point operator+(int , const Point&);
#endif // POINT_H
