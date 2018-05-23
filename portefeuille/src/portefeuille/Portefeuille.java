/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;
import exceptions.*;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Scanner;

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
  
    /************************ FONDS  */
    
    /**
     * @param _key cle du fond que l'on recherche
     *  si elle n'existe pas on genere une exception
     * @return double amount
     * @throws exceptions.FondInexistant
    */
    public double rechercher_fonds(String _key)
            throws FondInexistant
    {
        //on teste si hm_fonds contient la clé passée en parametre
        if (hm_fonds.containsKey(_key)==false)
        {
            //si non : generer une exception
            throw new FondInexistant();
        }
        else //si oui :
        {
            double amount;
            amount=hm_fonds.get(_key).getAmount();
            System.out.println("Amount recherché : " + amount);
            //retourner le amount associé a la clé
            return amount;
        }   
    }
    
    /** méthode qui instancie et ajoute un nouveau fonds dans la HashMap des fonds
     * @param _key cle a ajouter
     * @param _amount montant du fond a ajouter
     * @throws exceptions.FondExistant */
    public void nouveau_fond(String _key, double _amount) throws FondExistant
    {
       
    }
    
    /**
     * methode qui ajoute un nouveau fonds a un instrument
     * @param _key
     * @param f
     * @throws InstrumentInexistant 
     */
    public void nouveau_fonds_inst(String _key, Fonds f) throws InstrumentInexistant{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez la coordonnee x ");
        x=scanner.nextInt();
    }
    
    /************************ INSTRUMENTS */
    
    public ArrayList<Fonds> rechercher_instrument(String cle) throws InstrumentInexistant {
        if(hm_instrument.containsKey(cle)){
            return hm_instrument.get(cle).getValeur();
        }else{
            throw new InstrumentInexistant();
        }
    }
    
    
}
