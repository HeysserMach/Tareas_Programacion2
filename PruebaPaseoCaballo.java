/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PruebaPaseoCaballo {
    
    public static void main (String[] args){
        
        int x, y;
        boolean solucion;
        
        BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
        
        try{
            System.out.println("Posicion inicial del caballo: ");
            System.out.print("X: ");
            x = Integer.parseInt(entrada.readLine());
            System.out.print("Y: ");
            y = Integer.parseInt(entrada.readLine());
            
            PaseoCaballo MiCaballo = new PaseoCaballo(x, y);
            solucion = MiCaballo.ResolverProblema();
            
            if (solucion){
                MiCaballo.EscribirTablero();
            }
        }catch (Exception m){
            System.out.println("No se pudo probar el algoritmo." + m);
        }
    }
    
}
