/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;
import java.util.Scanner;
/**
 *
 * @author facuc
 */
public class Restaurante {
    
    public static void main(String[] args) {
        int cantHuevo;
        double cantChorizo;
        double cantPlatos;
        int cantPlatosServir;
        Frigorifico frigo= new Frigorifico();
        Scanner sc= new Scanner(System.in);
        System.out.println("Inserte la cantidad de docenas de huevos: ");
        cantHuevo= sc.nextInt();
        System.out.println("Inserte la cantidad de kg de chorizo");
        cantChorizo= sc.nextDouble();
        frigo.constructor(cantHuevo, cantChorizo);
        cantPlatos= frigo.cantPlatos(cantHuevo, cantChorizo);
        System.out.println("La cantidad de platos disponibles es: " + cantPlatos);
        System.out.println("¿Cuántos platos desea servir?");
        cantPlatosServir=sc.nextInt();
        frigo.servirPlatos(cantPlatosServir);
        System.out.println("Se han servido "+ cantPlatosServir + " platos");
        cantHuevo= frigo.getCantHuevo();
        cantChorizo= frigo.getCantChorizo();
        System.out.println("Inventario del frigorífico");
        System.out.println("Huevos: "+ cantHuevo);
        System.out.println("Chorizo: " + cantChorizo);
    }
}
