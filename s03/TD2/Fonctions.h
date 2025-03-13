#ifndef TD2_H_INCLUDED
#define TD2_H_INCLUDED
using namespace std;
/*class compte{
public:
    float solde;
    int numCompte;
    void saisir(){
    cout<<"donnez le solde: "<<endl;
    cin>>solde;
    cout<<"donnez le num: "<<endl;
    cin>>numCompte;
    }
};*/
/*class compte{
private:
    int numCompte;
    string nomProprietaire;
    float solde;
public:
int getnum(){
return numCompte;}
void setnum(int numc){
numCompte=numc;}
void saisir();
bool retirerargent(float montant);
float deposerargent(float montant);
void consultersolde();
void transfererargent(compte &c);
};*/
class compte{
    int rib;
  float solde;
  public: compte();
  //compte(int r,float s);
    //compte(int rib,float solde);
    ~ compte();
  void consultersolde();
};


#endif // TD2_H_INCLUDED
