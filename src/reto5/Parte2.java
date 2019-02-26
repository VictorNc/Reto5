/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Servers
 */
public class Parte2 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException {
        
        char opcion;
        int variable;
        
        
        System.out.println("**Programa de conversiones**");
        System.out.println("Opción 1: Convertir de decimal a binario.");
        System.out.println("Opción 2: Convertir de decimal a octal.");
        System.out.println("Opción 3: Convertir de decimal a hexadecimal.");
        System.out.println("Opción 4: Convertir de binario a decimal.");
        System.out.println("Opción 5: Convertir de octal a decimal.");
        System.out.println("Opción 6: Convertir de hexadecimal a decimal.");
        
        do{
            System.out.println("Elija la opción que desee. ");
            opcion = (char) Integer.parseInt(entrada.readLine());
            
            if(opcion == 1){
                System.out.println("Ingrese el número que desea convertir");
                variable = Integer.parseInt(entrada.readLine());
                String binario = Integer.toBinaryString(variable);
                System.out.println("El resultado binario es: " + binario);
            }else if(opcion == 2) {
                System.out.println("Ingrese el número que desea convertir");
                variable = Integer.parseInt(entrada.readLine());
                String octal = Integer.toOctalString(variable);
                System.out.println("El resultado octal es: " + octal);
            }
            
            if (opcion == 3){
                System.out.println("Ingrese el número que desea convertir");
                variable = Integer.parseInt(entrada.readLine());
                String hexa = Integer.toHexString(variable);
                System.out.println("El resultado hexadecimal es: " + hexa);
            }else if (opcion == 4){
                System.out.println("Ingrese el número que desea convertir");
                String variable1 = entrada.readLine();
                int num = Integer.parseInt(variable1,2);
                System.out.println("El resultado decimal es: " + num);
            }
            
            if (opcion == 5){
                System.out.println("Ingrese el número que desea convertir");
                String variable1 = entrada.readLine();
                int num = Integer.parseInt(variable1,8);
                System.out.println("El resultado decimal es: " + num);
            }else if (opcion == 6){
                System.out.println("Ingrese el número que desea convertir");
                String variable1 = entrada.readLine();
                int num = Integer.parseInt(variable1,16);
                System.out.println("El resultado decimal es: " + num);
            }
            
            
            
            System.out.println("¿Desea otro boleto SI = 1/ NO = 0?");
            opcion = (char) Integer.parseInt(entrada.readLine());
        }while(opcion != '0');
    }
}
