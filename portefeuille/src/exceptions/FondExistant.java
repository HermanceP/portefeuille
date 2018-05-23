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
public class FondExistant extends Exception{
    
    public FondExistant()
    {
        System.out.println("Ce fond existe déjà!");
    }
    
}
