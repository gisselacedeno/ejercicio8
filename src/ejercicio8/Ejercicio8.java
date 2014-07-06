/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio8;

import javax.swing.JOptionPane;
/**
 *
 * @author Eugenio
 */
public class Ejercicio8 {
    public static void main(String[] args) 
    {
        int c=0,longitud;
        String Cadena1;
        Cadena1=JOptionPane.showInputDialog("Ingrese una Frase");
        Cadena1=" "+ Cadena1;         
        char[] frase1 =Cadena1.toCharArray();        
        for (int i = 0; i< Cadena1.length() ; i++)
        {
            if (frase1[i]=='A'||frase1[i]=='a') 
            {
                c=c+1;
                for (int j = i; j < Cadena1.length(); j++) 
                {
                    if (frase1[j]==' ') 
                    {
                      i=j;
                      j=Cadena1.length();                      
                    }   
                }                
            }            
        }        
        System.out.println(Cadena1);
        JOptionPane.showMessageDialog(null,"Hay "+c+ " palabras que tiene/n letras A");
    }
}

