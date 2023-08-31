/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudios.aerolinea;

/**
 *
 * @author PaEstudiar
 */

public class Pasajero {
    private int rut, edad;
    private String nombre, apellido;

    public Pasajero(int rut, int edad, String nombre, String apellido) {
        this.rut = rut;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Pasajero() {
    }

    public int getRut() {
        return rut;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "rut=" + rut + ", edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
