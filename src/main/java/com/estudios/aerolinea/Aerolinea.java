/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudios.aerolinea;
import java.util.Scanner;
/**
 *
 * @author PaEstudiar
 */
public class Aerolinea {

    public static void main(String[] args) {
        int opcion=0;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Bienvenido a la aerolinea de viajes:");
            System.out.println("¨Por favor ingrese una opcion:");
            System.out.println("1.- Ingresar Pasajero");
            System.out.println("2.- Ingresar Pasaje");
            System.out.println("3.- Mostrar Informacion del Pasaje");
            System.out.println("4.- Salir");
            System.out.println("Ingresar Una Opcion:");
            opcion=input.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }while (opcion !=4);
        input.close();
    }
    
}
