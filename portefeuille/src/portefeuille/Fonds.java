/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;

/**
 *
 * @author Tao Tuong Vi
 */
public class Fonds {
    
    private double amount;
    
      /** CTOR par defaut
     */
    public Fonds()
    {
        amount=0;
    }
    
      /** CTOR
     * @param _amount 
     */
    public Fonds(double _amount)
    {
        amount=_amount;
    } 
    
    /// *** Methodes *** ///
    
    /**
     * @param _cle cle du fond que l'on recherche
     *  si elle n'existe pas on genere une exception
     */
    public void rechercher_fonds(String _cle)
    {
        
    }
    
    
}