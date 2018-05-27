/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;

import exceptions.FondInexistant;
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
    
    /**
     * @param _cle_fond
    */
    public void afficher_pourcentage(String _cle_fond) throws FondInexistant
    {
        p.rechercher_fonds(_cle_fond);
        
        //afficher le pourcentage de chaque instrument pour ce fond
        
        
        HashMap<String, Instrument> i=p.get_hm_inst();
        //on récupère les clés de la hashmap instrument
        Set<String> key_inst=p.get_hm_inst().keySet();
        
        int nb_fonds=0;
        int nb_inst=0;
        boolean inst=false;
        
        
        //itérateur pour chaque valeur du Set keys : 
        for (String s : key_inst) {
            
            //on recupere l'array list de fonds associé à l'instrument pointé par l'itérateur
            ArrayList<Fonds> f;
            f=i.get(s).getValeur();
            
            //on parcours l'array de fonds de l'instrument
            for (int j=0; j<f.size(); j++)
            {
                //si on a un fond sur cet instrument
                if (f.get(j).getKey_f() == _cle_fond)
                {
                    nb_fonds++;
                    inst=true;
                }
            }
            
            if (inst==true)
            {
                nb_inst++;
            }
            
        }
        
        //calcul du pourcentage
        
        double pourcentage= (double)nb_fonds/nb_inst;
        System.out.println("pourcentage : " + pourcentage);
        
        
    }
    
    
    
}
