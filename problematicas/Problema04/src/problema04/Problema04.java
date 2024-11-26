/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author ASUS
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma = 0;
        int signo = 1;
        int denominador = 1;
        int limite = 15;
        
        while (denominador <= limite){
            double termino = signo * (1.0 / denominador);
            suma += termino;
            if (denominador == 1) {
                System.out.print("1");
            } else {
                if (signo < 0);
                System.out.print(" - " + "1" + "/" + denominador);
                
            }
            denominador += 2;
            signo *= -1;
        }
        System.out.println("\nResultado de la serie: " + suma);
        
        
        
                
    }
    
}
