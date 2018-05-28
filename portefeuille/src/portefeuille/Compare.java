/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portefeuille;

import java.lang.Comparable;
import java.util.*;

/**
 * @author Tao Tuong Vi
 */


// jsuis pas sure pour le extends Fonds
public class Compare implements Comparable<Fonds>{

   private double amount;
    private String key_f;
    
      /** CTOR par defaut
     */
    public Compare()
    {
        amount=0;
        key_f="";
    }
    
      /** CTOR
     * @param _amount 
     */
    public Compare(String _key_f,double _amount)
    {
        amount=_amount;
        key_f = _key_f;
    } 
    
   
    //on redefinit equals de Object
    public boolean equals(Fonds f)
    {
        
        if (f instanceof Fonds)
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public int compareTo(Fonds f) {
        Fonds f2=new Fonds(this.key_f, this.amount);
        if (f2.getAmount()>f.getAmount())
        {
            return 1;
        }
        else if ( equals (f) ) {
            return 0;
        }
        else {
            return -1;
        }
    }
    
}
