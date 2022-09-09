/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;
import java.util.Scanner;
//TP Java 1
import java.util.Date;

/**
 *
 * @author pasca
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TP Java 1 - Septembre 2022");
        //Exercice1
        System.out.println("Hello World");
        
        //Exercice2
       double prix1;
       prix1 = 11.5;
       double prix2;
       prix2 = 8.7;
       double prix3;
       prix3 = 4;
       //initialisation variable total
       double total;
       total = prix1+prix2+prix3;
       //affichage total
        System.out.println(total);
        
        //Exercice3
        double nombre = 3.14;
        System.out.println(nombre);
        
        int entier;
        //entier = nombre;
        entier = (int)nombre;
        System.out.println(entier);
        
        //Exercice4
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez votre prénom :");
        String prenom = sc.next();
        System.out.println("Saissez votrre nom :");
        String nom = sc.next();
        
        System.out.println("Bienvennue " + nom + " " + prenom +" !");
        
        //Exercice5
        System.out.println("Saisir un nombre entier :");
        int nombre2 = sc.nextInt();
        System.out.println(nombre2);
        
        System.out.println("Saisir un nombre de type float :");
        float nombrefloat = sc.nextFloat();
        System.out.println(nombrefloat);
        
        System.out.println("Saisir un nombre de type double :");
        double nombredouble = sc.nextDouble();
        System.out.println(nombredouble);
        
        //Exercice6
        String saisie;
        
       /* System.out.println("Saisir un texte :");
        saisie = sc.next();
        int nb = Integer.parseInt(saisie);
        System.out.println(nb);*/
       
        System.out.println("Saisir un réel :");
        int nb = sc.nextInt();
        float nbfloat = (float)nb;
        System.out.println(nbfloat);
        double nbdouble = (double)nb;
        System.out.println(nbdouble);
        
        //Exercice7
        
        float note1;
        float note2;
        float note3;
        System.out.println("Saisir note1 :");
        note1 = sc.nextFloat();
        System.out.println("Saisir note2 :");
        note2 = sc.nextFloat();
        System.out.println("Saisir note3 :");
        note3 = sc.nextFloat();
        
        float totalnote;
        totalnote = note1+note2+note3;
        
        
        float moyenne;
        moyenne = totalnote/3;
        System.out.println("Moyenne " + moyenne);
        
        //Exercice8
        int anneenaissance;
        System.out.println("Saisir année naissance :");
        anneenaissance = sc.nextInt();
        int age;
        Date dt=new Date();
        int date = dt.getYear();
        System.out.println("La date est :" + date);
        int annee = date+1900;
        age = annee - anneenaissance;
        System.out.println("Vous aurez " + age +" ans cette année !");
    }
    
}
