/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guevara_ernesto_biarray;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ernes
 */
public class Guevara_Ernesto_BiArray {
    public static void main(String[] args) {
        
        Scanner lea=new Scanner(System.in);
        Random r=new Random();
        
        int dimension=0;
        int[][] numeros;
        
        while(true){
        try{
        System.out.println("Ingrese la dimension de la matriz cuadrada: ");
        dimension=lea.nextInt();
        if(dimension>0){
        numeros=new int[dimension][dimension];
        break;
        }
        }catch(Exception e){
            System.out.println("Ingreso un tipo de dato invalido");
            lea.nextLine();
        }
        }
               
        for (int filas = 0; filas < numeros.length; filas++) {
            for (int columnas = 0; columnas < numeros.length; columnas++) {
                int numero=r.nextInt(90)+10;
                numeros[filas][columnas]=numero;
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println("");
        }
        
        int sumaprincipal=0, sumasecundaria=0;
        String sumap="", sumas="";
        
        for (int i = 0; i < dimension; i++) {
            int numero=numeros[i][i];
            sumaprincipal+=numero;
            sumap+=numero+" + ";
            }           
        
        for (int i = dimension-1; i >= 0; i--) {
            int numero=numeros[i][i];
            sumasecundaria+=numero;
            sumas+=numero+" + ";
        }
        
        System.out.println(sumap+" = "+sumaprincipal);
        System.out.println("");
        System.out.println(sumas+" = "+sumasecundaria);
        
        
        
    
    }
}
