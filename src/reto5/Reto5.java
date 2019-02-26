
package reto5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Reto5 {

  public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
      
        
        double LadoA, LadoB, Hipotenusa;
        
        System.out.println("Programa para calcular la hipotenusa.");
        
        System.out.println("Ingrese el lado A: ");
        LadoA = Integer.parseInt(entrada.readLine());
        System.out.println("Ingrese el lado B: ");
        LadoB = Integer.parseInt(entrada.readLine());
        
        if(LadoA > 0 & LadoB > 0){
            System.out.println("Los lados son mayores a 0.");
        }else{
            System.out.println("Los lados tienen que ser mayores que 0.");
        }
        
        
    }
    
}
