/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        String salir = "";
        String listadoEdades = "";

        int edad = 0;
        int sumaEdades = 0;
        int contadorIteraciones = 0;
        
        double promedioEdad = 0;
        double estatura = 0;
        double sumaEstaturas = 0;
        double promedioEstatura = 0;
        
        boolean bandera = true;
        
        cadenaReporte = String.format("%s%s", cadenaReporte,
                "\nListado de Jugadores");

        while(bandera){
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posicion del Jugador: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            
            sumaEdades += edad;
            sumaEstaturas += estatura;
            contadorIteraciones += 1;
            
            cadenaReporte = String.format("%s\n%d. %s, -%s-, edad %d, estatura %.2f",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);
            
            
            listadoEdades= String.format("%s%d\n", listadoEdades, edad);

            System.out.println("¿Desea salir del ciclo?; digite: si");
            entrada.nextLine();
            salir = entrada.nextLine().toLowerCase();
            if(salir.equals("si")){
                bandera = false;
            }
            
            
        }
        promedioEdad = sumaEdades / (contadorIteraciones);
        promedioEstatura = sumaEstaturas / (contadorIteraciones);
        cadenaReporte = String.format ("%s\nListado de edades"
                    + "\n%sPromedio de edades: %.2f\nPromedio de estaturas: %.2f",
                    cadenaReporte, 
                    listadoEdades, 
                    promedioEdad,
                    promedioEstatura);


        
        System.out.printf("%s\n", cadenaReporte);
    }
    
    
}
