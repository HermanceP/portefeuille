/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;

import java.util.HashMap;

/**
 *
 * @author Hermance
 */
public class Portefeuille {

    /**
     * @param args the command line arguments
     */
    
    private HashMap<String, Fonds> hm_fonds;
    private HashMap<String, Instrument> hm_instrument;
    
    /** CTOR par defaut
     */
    public Portefeuille()
    {
        hm_fonds=new HashMap();
        hm_instrument=new HashMap();
    }
    
    /** CTOR
     * @param _hm_fonds
     * @param _hm_instrument
     */
    public Portefeuille(HashMap<String, Fonds> _hm_fonds, HashMap<String, Instrument> _hm_instrument)
    {
        hm_fonds=_hm_fonds;
        hm_instrument=_hm_instrument;
    } 
   
      
    /// *** Methodes *** ///
  
    
    /**
     * @param _cle cle du fond que l'on recherche
     *  si elle n'existe pas on genere une exception
    */
    public void rechercher_fonds(String _cle)
    {
        //on teste si hm_fonds contient la clé passée en parametre
        boolean b=hm_fonds.containsKey(_cle);
        
        if (b==true)
        {
             //boolean TRUE si hm_fonds contient la clé
            //retourner le amount associé a la clé
        }
        else
        {
            //generer une exception
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
