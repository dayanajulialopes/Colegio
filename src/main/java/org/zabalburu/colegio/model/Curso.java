/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.colegio.model;

/**
 *
 * @author DAW1
 */
public class Curso {

    private String nombreCorto; //esto son los campos
    private String nombre;
    private String tutor;
    private int alumnos;

    public Curso() { //public curso es el constructor

    }

    public Curso(String nombreCorto, String nombre) {
        this.nombreCorto = nombreCorto;
        this.nombre = nombre;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getNombreCorto() {
        return this.nombreCorto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return this.nombre;
    }

    public void settutor(String tutor) {
        this.tutor = tutor;
    }

    public String gettutor() {
        return this.tutor;
    }

    public void setAlumnos(int alumnos) {
        if (alumnos > 0) {
            this.alumnos = alumnos;
        }
    }

    public int getAlumnos() {
        return this.alumnos;
    }

    
    public boolean getSuficienteMatricula() {
        /*if (this.alumnos >12){
            return true;
        } else {
            return false;
        }*/
        /*if (this.alumnos >12) {
            return true;
        }
        return false;*/
        return (this.alumnos > 12);
    }

}
