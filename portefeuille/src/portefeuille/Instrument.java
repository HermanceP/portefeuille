/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;

import java.util.ArrayList;

/**
 *
 * @author Tao Tuong Vi
 */
public class Instrument {
    private ArrayList<Fonds> valeurs;
    private String key_i;
    
    /** CTOR par defaut
    */
    public Instrument()
    {
        valeurs=new ArrayList();
        key_i="";
    }
    
    /** CTOR
     * @param _valeurs
    */
    public Instrument(String _key_i,ArrayList<Fonds> _valeurs)
    {
        valeurs=_valeurs;
        key_i=_key_i;
    } 
    
    // ***** Methodes ******
    
    /**
     * @param _f le fond a ajouter a notre ArrayList */
    public void ajouter_fonds(Fonds _f)
    {
        valeurs.add(_f);
    }
    
    public ArrayList<Fonds> getValeur(){
        return valeurs;
    }
    
    public String getKey_i(){
        return key_i;
    }
    
}
