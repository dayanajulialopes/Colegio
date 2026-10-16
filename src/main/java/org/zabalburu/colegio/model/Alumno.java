/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.colegio.model;

/**
 * La clase Alumno almacena la información de un alumno
 *
 * @author DAW1
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private int edad;
    private double NotaPRO;
    private double NotaADDAIG;
    private double NotaBD;

    public Alumno() {

    }

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellido = apellidos;
    }

    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.edad = edad;
    }

    /*
        Setters / Getters
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public String getApellidos() {
        return this.apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNotaPRO(double NotaPRO) {
        if ((NotaPRO >= 1 && NotaPRO <= 10)) {
            this.NotaPRO = NotaPRO;
        }
    }

    public double getNotaPRO() {
        return this.NotaPRO;
    }

    public void setNotaADDAIG(double NotaADDAIG) {
        if ((NotaADDAIG >= 1 && NotaADDAIG <= 10)) {
            this.NotaADDAIG = NotaADDAIG;
        }
        
    }

    public double getNotaADDAIG() {
        return this.NotaADDAIG;
    }

    public void setNotaBD(double NotaBD) {
        if ((NotaBD >= 1 && NotaBD <= 10)) {
            this.NotaBD = NotaBD;
        }
    }
        

    public double getNotaBD() {
        return this.NotaBD;
    }
    
    

    /**
     * Calcula la nota media del Alumno
     *
     * @returns nota media del alumno con un double
     *
     */
    public double notaMedia() {
        double sumaNotas = this.NotaADDAIG + this.NotaBD + this.NotaPRO;
        double media = sumaNotas / 3;
        return media;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alumno) {
            Alumno otro = (Alumno) obj; //Lo trato como alumno
            if (this.nombre.equalsIgnoreCase(otro.nombre)) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    
}
