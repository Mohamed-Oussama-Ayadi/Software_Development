
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACER
 */
public class Prosit0 {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Veillez saisir le premier entier");
        int n1 = sc.nextInt();
		System.out.println("Veillez saisir le second entier");
        int n2 = sc.nextInt();
        float somme = 0;

        somme = n1 + n2;

        System.out.println("Le resultat est : " + somme);
		
		
		

		System.out.println("Veillez saisir un entier");
        int n = sc.nextInt();
		

        System.out.println("Le double de "+n+" est " + n*2);

    }

}
