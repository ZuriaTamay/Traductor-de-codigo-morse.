/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo_morse;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author zues-
 */
public class Codigo_Morse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String v_morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",}; /**Alfabeto de la A hasta la Z**/
        
        String abc = "abcdefghijklmnopqrstuvwxyz0123456789"; 
       
        int ope , Z;
        String e;
       
        String cod_morse, Morse="", texto="";
        e=JOptionPane.showInputDialog("Traductor  Codigo Morse - Español y Español - Codigo Morse" + "\n" + "1) codigo Morse" + " \n" + "2) Texto" + " \n" + "3) Salir" + " \n" + "Seleccione una opción: ");
        
        
        //En esta linea de codigo se realiza la creacion del metodo scanne
        ope = Integer.parseInt(e);//introduccion de datos a la variable ope
    if (ope==1){
        String entrada;
            entrada=JOptionPane.showInputDialog("Introduzca la clave de Codigo morse: ");
            String text[]= entrada.split(" ");
            Z = text.length;//tamaño de la cadena
            for  (int m = 0; m < Z; m++){
                    for (int j = 0; j < 60; j++)
                        if(text[m].equals(v_morse[j])){
                            texto = texto + abc.charAt(j);
                            break;      
                        }
            }
            JOptionPane.showMessageDialog(null, texto);
        
        }else if(ope==2){
            String entrada;
            entrada = JOptionPane.showInputDialog("introducza el Texto");
            Scanner entrada2 = new Scanner (entrada);
            texto = entrada2.nextLine();
            String toLowerCase = texto.toLowerCase(); //conversion cadena a minusculas
            Z = toLowerCase.length();//tamaño de la cadena
            for  (int a = 0; a < Z ; a++){ 
		if (texto.charAt(a)==' ') Morse = Morse  +  "   ";//comprobr si es un es un espacio, de ser asi colocar 3 espacios
		else {
                    for  (int j = 0; j < abc.length() ; j++) {
			if (texto.charAt(a) == abc.charAt(j))
                           Morse  = Morse + v_morse[j]+' ';	// Poner el if si no hay letras
                    }
		}
            }
            JOptionPane.showMessageDialog(null, Morse);
        }else if (ope==3){
            System.exit(0);
        }
    
    }
    
}
