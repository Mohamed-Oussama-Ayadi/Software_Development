#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int division(int a, int b){return a/b;}
int main()
{
   /* ifstream nomflux;
    nomflux.open("etudiant.txt");
    if(nomflux)
    { string ligne;
    while(getline(nomflux,ligne))
        {cout<<ligne<<endl;}*/
       /* char c;
        while(nomflux.get(c)){
            cout<<c<<endl;
        }


        nomflux<<"bonjour"<<endl;
        nomflux<<"je suis une phrase"<<endl;
       int age(20);
       nomflux<<"j ai"<<age<<"ans"<<endl;
       nomflux.open("etudiant.txt");
nomflux.close();
    }
    else {cout<<"erreur"<<endl;}*/
        //exception
        int a,b;
    cout<<"valeur pour a:";
    cin>>a;
     cout<<"valeur pour b:";
    cin>>b;
    cout<<a <<"/" <<b<<" = "<<division(a,b)<<endl;

    return 0;
}
