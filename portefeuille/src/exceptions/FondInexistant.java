/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Tao Tuong Vi
 */
public class FondInexistant extends Exception{
    
    public FondInexistant()
    {
        System.out.println("Ce fond n'existe pas!");
    }
    
}
