/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;

import java.util.HashMap;
import java.util.*;

/**
 *
 * @author Tao Tuong Vi
 */
public class Vue {
    
    private Portefeuille p;
    
    public Vue(Portefeuille _p)
    {
        p=_p;
    }
    
    public void afficher_fonds_inst()
    {
        //on récupère les clés de la hashmap instrument
        Set<String> keys=p.get_hm_inst().keySet();
        System.out.println("Keys: " + keys);
        
        //itérateur pour chaque valeur du Set keys : 
        for (String s : keys) {
            //on affiche la clé
            System.out.println("Clé :" + s);
            
            //on récupère l'array de fonds associé à l'instrument de la hashmap
            ArrayList<Fonds> v;
            v=p.get_hm_inst().get(s).getValeur();
            
            System.out.println("Nombre total de fonds : " + v.size());
            
            double sum=0;
            for (int i=0; i<v.size(); i++)
            {
                sum=sum + v.get(i).getAmount();
            }
            System.out.println("Somme des fonds : " + sum);
        }
        
    }
    
    public void afficher_pourcentage(String _cle_fond)
    {
        //j'ai rien compris mais faut que je revoie le mail
    }
    
    
    
}
