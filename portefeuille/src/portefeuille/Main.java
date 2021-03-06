/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;

import exceptions.FondExistant;
import exceptions.FondInexistant;
import exceptions.InstrumentInexistant;
import java.util.Scanner;

/**
 *
 * @author Tao Tuong Vi
 */
public class Main {

    public static void main(String[] args) throws FondInexistant, FondExistant, InstrumentInexistant {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        Portefeuille p = new Portefeuille();
        Instrument i=new Instrument();
        
        Vue v= new Vue(p);

        System.out.println("\t -- Bienvenue dans notre gestionnaire de portefeuille -- \n");
        int choice;

        do {
            System.out.println("1 - Ajouter un fond");
            System.out.println("2 - Supprimer un fond");
            System.out.println("3 - Ajouter un fond à un instrument");
            System.out.println("4 - Supprimer un instrument");
            System.out.println("5 - Trier la collection de fonds d'un instrument");
            System.out.println("6 - Exit");

            System.out.println("\n  Rentrez un chiffre : ");

            choice = sc.nextInt();
            sc.nextLine(); //pour clear le sc

            String key;

            switch (choice) {
                case 1: //ajouter un fond
                    System.out.println("Insérer une clé pour l'ajouter :");
                    key = sc.nextLine();
                    System.out.println("Vous avez rentré : " + key);
                    System.out.println("Insérer une valeur :");
                    int amount = sc.nextInt();
                    System.out.println("Vous avez rentré : " + amount);
                    p.nouveau_fond(key, amount);
                    break;

                case 2: //supprimer un fond
                    System.out.println("Insérer la clé du fond a effacer :");
                    key = sc.nextLine();
                    System.out.println("Vous avez rentré : " + key);
                    break;

                case 3: //ajouter un fond à un instrument

                    System.out.println("Donnez la cle pour l'instrument");
                    key = sc.next();
                    
                    
                    System.out.println("Insérer la clé du fond à ajouter :");
                    //soit on ajoute un novueau fond, soit on prend une clé existantes
                    
                //    p.nouveau_fonds_inst(key, f);

                    break;

                case 4: //supprimer un instrument
                    System.out.println("Insérer une clé pour supprimer l'instrument :");
                    key = sc.nextLine();
                    System.out.println("Vous avez rentré : " + key);
                    p.supprimer_instrument(key);
                    break;
                    
                case 5:
                    
                    v.afficher_fonds_inst();
                    System.out.println("Insérer une clé pour trier l'instrument :");
                    key = sc.nextLine();
                    System.out.println("Vous avez rentré : " + key);
                    i.trie_collection();
                    v.afficher_fonds_inst();
                    break;

                default:
                    System.out.println("Veuillez rentrer un chiffre correct");
            }
        } while (choice != 6);

        System.out.println("wouahous");

    }
}
