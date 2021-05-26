/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author mobicare
 */
public class JavaApplication1 {
    
public void cut (String a)
{
    String [] arr=a.split("\\.");
    
    for (int i=0 ; i<4 ; i++)
    {
        
        System.out.println(arr[i]);
    }
}
   
    
}
