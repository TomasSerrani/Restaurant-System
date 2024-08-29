/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author facuc
 */
public class Frigorifico {
    double cantChorizo,cantPlatos; 
    int cantHuevo;

    public double getCantChorizo() {
        return cantChorizo;
    }


    public int getCantHuevo() {
        return cantHuevo;
    }

    public void constructor (int cantHuevo, double cantChorizo){
         this.cantChorizo =+ cantChorizo;
         this.cantHuevo =+ (12 * cantHuevo);
    }
    public void addHuevo(int huevos){
        cantHuevo =+ (12*huevos);
    }
    public void addChorizo (double chorizos){
        cantChorizo =+ chorizos; 
    }
    public void servirPlatos(int cantPlatos){
        this.cantChorizo =- (cantPlatos*0.2);
        this.cantHuevo =- (cantPlatos* 2);
    }
    public double cantPlatos(int cantHuevo, double cantChorizo){
        cantHuevo= this.cantHuevo;
        cantChorizo= this.cantChorizo;
        int huevos= cantHuevo/2;
        double chorizos= cantChorizo/0.2;
        cantPlatos= (huevos<chorizos)? huevos:chorizos;
        return cantPlatos;
    }
}
