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
    
    
    /** CTOR par defaut
    */
    public Instrument()
    {
        valeurs=new ArrayList();
    }
    
    /** CTOR
     * @param _valeurs
    */
    public Instrument(ArrayList<Fonds> _valeurs)
    {
        valeurs=_valeurs;
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
    
}
