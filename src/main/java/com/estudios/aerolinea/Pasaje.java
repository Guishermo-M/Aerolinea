/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudios.aerolinea;

/**
 *
 * @author PaEstudiar
 */
public class Pasaje {
    int numVuelo, valor, numAsiento;
    String destino, fecha;
    Pasajero pasajero;
    boolean traeEquipaje;

    public Pasaje(int numVuelo, int valor, int numAsiento, String destino, String fecha, Pasajero pasajero, boolean traeEquipaje) {
        this.numVuelo = numVuelo;
        this.valor = valor;
        this.numAsiento = numAsiento;
        this.destino = destino;
        this.fecha = fecha;
        this.pasajero = pasajero;
        this.traeEquipaje = traeEquipaje;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public int getValor() {
        return valor;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public boolean isTraeEquipaje() {
        return traeEquipaje;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public void setTraeEquipaje(boolean traeEquipaje) {
        this.traeEquipaje = traeEquipaje;
    }
 
}
