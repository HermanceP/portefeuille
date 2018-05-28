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
public class Fonds extends Compare{
    
    private double amount;
    private String key_f;
    
      /** CTOR par defaut
     */
    public Fonds()
    {
        super();
        amount=0;
        key_f="";
    }
    
      /** CTOR
     * @param _amount 
     */
    public Fonds(String _key_f,double _amount)
    {
        super(_key_f,_amount);
        amount=_amount;
        key_f = _key_f;
    } 
    
    
    /** GTOR 
     * @return amount
     */
    public double getAmount(){
        return amount;
    }
    
    public String getKey_f(){
        return key_f;
    }
    
    /// *** Methodes *** ///
  
    
    
}
