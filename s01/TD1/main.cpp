#include <iostream>
#include<string>
using namespace std;
//ex1
/*int main()
{ const  int max=10;
string message;
int n;
float x;
bool test=false;

    cout << "donnez un entier et un flottant" << endl;
    cin>>n>>x;

    if(x>max){
            test=true;
      message="true";
       cout<<"le produit de n "<<n<<"par x"<<x<<"est:"<<n*x<<message;
    }
return 0;}
*/
//ex 6 Argument par défaut
/*void display(char c= '*', int n= 1)
{for(int i = 1; i <= n; ++i)
 {
 cout << c;
 }
 cout << endl;}
void add(int a, int b = 3)
{
cout<< "la somme est"   <<a+b<<endl ;
}
int main()
{ cout << "No argument passed:\n";
 display(); // *
 cout << "\nFirst argument passed:\n";
 display('#'); //#
 cout << "\nBoth argument passed:\n";
 display('$', 5); // $$$$$
 add(4) ; // la somme est 7
return 0;
}*/
//ex7 Les références
/*void swap(int i, int j)
{
 int tmp = i;
 i = j; // i prend valeur de j
 j = tmp; // j prend valeur de temp
}
//void swap2(const int& i,const int& j)
void swap2( int& i, int& j)
{
 int tmp = i;
 i = j;
 j = tmp;
}
int main()
{
 int x = 1;
 int y = 2;
 swap(x, y); // étape 1
 cout<<"x= "<<x<<"y= "<<y<<endl; //x=1 y=2
 swap2(x, y); // étape 2
 cout<<"x= "<<x <<"y= "<<y<<endl;//x=2 y=1

}*/
//ex 7 : La Classe String
int main(){
string str("les sanglots longs des violons");
string st(str,0,12);
cout<<"\""<<st<<endl;//etape 1 "les sanglots
string str2("de l'automne blessent mon coeur");
cout<<str.replace(str.size()-1,0,""+str2)<<endl;//etape 2 les sanglots longs des violonde l'automne blessent mon coeurs
int n=str.find("sanglots");
cout<<n<<"\n";// etape 3 4
for(int i=0;i<str.size();i++)
    cout<<str.at(i)<<""<<str[i]<<"\n"; //etape4 afficher caractere par caractere

    return 0;
}
