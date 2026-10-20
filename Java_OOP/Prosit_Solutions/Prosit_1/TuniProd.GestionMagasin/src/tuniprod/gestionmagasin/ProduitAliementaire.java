/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuniprod.gestionmagasin;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class ProduitAliementaire {

    int identifiant;
    String libelle, marque;
    float prix;
    Date dateExpriration ; 

    public ProduitAliementaire() {
    }

    public ProduitAliementaire(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
    }

    public ProduitAliementaire(int identifiant, String libelle, String marque, float prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }
    
    public void affecterDateExpiration(Date date){
        this.dateExpriration = date;
    }

    public void afficher(){
        System.out.println("------------------------");
        System.out.println("identifiant : "+this.identifiant);
        System.out.println("libelle : "+this.libelle);
        System.out.println("marque : "+this.marque);
        System.out.println("prix : "+this.prix);
        System.out.println("------------------------");
    }
    
    @Override
    public String toString(){
        String s = "";
        s+="identifiant : "+this.identifiant+"\n";
        s+="libelle : "+this.libelle+"\n";
        s+="marque : "+this.marque+"\n";
        s+="prix : "+this.prix+"\n";
        return s;
    }
    

}
