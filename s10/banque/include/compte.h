#ifndef COMPTE_H
#define COMPTE_H


class compte
{
    public:
        compte(int RIB,double solde);
        compte();
        virtual ~compte();
        void deposer_argent(double argent);
        void retirer_argent(double argent);
        virtual void afficher();
        int GetRIB() { return RIB; }
        void SetRIB(int val) { RIB = val; }
        double Getsolde() { return solde; }
        void Setsolde(double val) { solde = val; }

    protected:
        int RIB;
        double solde;

    private:
};

#endif // COMPTE_H
