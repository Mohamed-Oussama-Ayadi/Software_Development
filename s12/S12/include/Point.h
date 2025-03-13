#ifndef POINT_H
#define POINT_H

#include <iostream>

using namespace std;
class Point
{
    public:
        Point(int=0,int=0);
        Point operator+=(Point&);
        Point operator+(Point&);
        Point operator+(int);
        virtual ~Point();

        int GetX() { return X; }
        void SetX(int a) { X = a; }
        int GetY() { return Y; }
        void SetY(int b) { Y = b; }
        void afficher();
        friend Point operator+(int, Point&);

    protected:

    private:
        int X;
        int Y;
};
Point operator+(int)

#endif // POINT_H
