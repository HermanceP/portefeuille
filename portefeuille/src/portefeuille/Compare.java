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
public class Compare extends Fonds implements Comparable<Fonds>{

    //on redefinit equals de Object
    public boolean equals(Fonds f)
    {
        if (this.getAmount()==f.getAmount())
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public int compareTo(Fonds f) {
        if (this.getAmount()>f.getAmount())
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
