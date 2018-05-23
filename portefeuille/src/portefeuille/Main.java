/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;
import exceptions.FondExistant;
import exceptions.FondInexistant;
import java.util.Scanner;

/**
 *
 * @author Tao Tuong Vi
 */
public class Main {
    

    public static void main(String[] args) throws FondInexistant, FondExistant {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
    
        Portefeuille p=new Portefeuille();
        System.out.println("Insérer une clé :");
        String key = sc.nextLine();
        System.out.println("Vous avez rentré : " + key);
        
        System.out.println("Insérer une valeur :");
        int amount = sc.nextInt();
        System.out.println("Vous avez rentré : " + amount);
        
        p.nouveau_fond(key, amount);
        
        
        System.out.println("wouahous");
    }
}
