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
   
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
