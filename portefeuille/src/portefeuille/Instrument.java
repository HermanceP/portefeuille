/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;

import java.util.ArrayList;
import java.util.Collections;

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
    
    /**
     * cette methode trie la collection de Fonds par montant
     */
    public void trie_collection(){
        for(int i=0; i<valeurs.size(); i++){
            //double v1=valeurs.get(i).getAmount();
            //double v2=valeurs.get(i+1).getAmount();
            //int resultat=equals(v1,v2);
            Collections.sort(valeurs);
        }
    }
    
    public ArrayList<Fonds> getValeur(){
        return valeurs;
    }
    
    public String getKey_i(){
        return key_i;
    }
    
}
