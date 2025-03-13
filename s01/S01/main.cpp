#include <iostream>

using namespace std;

/*void affiche(int a){
cout<<"a="<<a<<endl;
}
void affiche(float b){
cout<<"b="<<b<<endl;
}
void affiche(char c){
cout<<"c="<<c<<endl;}
void affiche(int a, float b, char c){
cout<<"a="<<a<<"b="<<b<<"c="<<c<<endl;}
int main()
{
    int x=3;
    float y=2.2;
    char ch='Z';
    affiche(x);
    affiche(y);
    affiche(ch);
    affiche(x,y,ch);
    return 0;
}*/
void permut_v(int&a,int& b)
{
    int aux=b;
    b=a;
    a=aux;
}
int main(){
int x,y;
x=5;
y=10;
permut_v(x,y);
cout<<"x="<<x<<"y="<<y<<endl;
return 0;}
