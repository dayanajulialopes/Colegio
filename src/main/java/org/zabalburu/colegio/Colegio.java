/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.colegio;

import org.zabalburu.colegio.model.Alumno;
import org.zabalburu.colegio.model.Curso;
/**
 *
 * @author DAW1
 */
public class Colegio {
    private static final String CENTRO ="Zabalburu Ikastetxea S.Coop.";
    private static final String NIF ="F46121763";
    public static void main(String[] args) {
        System.out.println (
        """
        ======================
        %s
        
        NIF: %s
        ======================
        
        """.formatted(Colegio.CENTRO, Colegio.NIF));
        /*Alumno a1 = new Alumno();
        a1.apellido = "Sanz";
        a1.nombre = "Juan";*/
        Curso daw1 = new Curso ("DAW1", "Desarrollo de Aplicaciones web 1º");
        daw1.settutor("Marta Torre");
        daw1.setAlumnos(19);
        System.out.print (""" 
            Curso: %s - %s
            Tutor/a: %s
            El curso tiene %d alumnos
            El curso %s tiene suficiente matrícula
            """.formatted(daw1.getNombreCorto(),
                    daw1.getnombre(),
                    daw1.gettutor(),
                    daw1.getAlumnos(),
                    (daw1.getSuficienteMatricula()) ? "SI":"NO"
            )
        );
        
        Alumno a1 = new Alumno("Juan", "Sanz");
        a1.setEdad(18);  // a1.edad = 18;
        a1.setNotaPRO(7.5); // a1.notaPRO = 7.5;
        a1.setNotaADDAIG(4.5); // a1.notaADDAIG = 4.5;
        a1.setNotaBD(9.3); //a1.notaBD = 9.3;

        /*System.out.println("Información del Alumno");
        System.out.println("======================");
        System.out.println("Nombre : " + a1.nombre);
        System.out.println("Apellido : " + a1.apellido);
        System.out.println("Edad : " + a1.edad + " años");
        System.out.println("Nota PRO : " + a1.notaPRO);
        System.out.println("Nota ADDAIG : " + a1.notaADDAIG);
        System.out.println("Nota BD : " + a1.notaBD);
        System.out.println("---------------------");
        //System.out.println("Nota Media : " + a1.notaMedia());
        System.out.println("Nota Media : %.2f".formatted(a1.notaMedia()));*/
        System.out.println(
        """
        Información al Alumno
        =====================
        Nombre      : %s
        Apellido    : %s
        Edad        : %d años
        Nota PRO    : %5.2f 
        Nota ADDAIG : %5.2f 
        Nota BD     : %5.2f 
        ---------------------
        Nota media de %s es %.2f
        """.formatted(
            a1.getNombre(),
            a1.getApellidos(),
            a1.getEdad(),
            a1.getNotaPRO(),
            a1.getNotaADDAIG(),
            a1.getNotaBD(),
            a1.getNombre(),
            a1.notaMedia()));
        
        /*Alumno a2 = new Alumno();
        a2.apellido = "Sanz";
        a2.nombre = "Juan";
        a2.edad = 18;*/
        Alumno a2= new Alumno("Juan", "Sanz", 18);
        a2.setNotaPRO(7.5);
        a2.setNotaADDAIG(4.5);
        a2.setNotaBD(9.3);
        
        Alumno a3 = a1;
        /*a3.nombre = "Otro";
        System.out.println(a1.nombre);*/
        
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals("Juan"));
        System.out.println(a1 == a3);
        
        
        
        
    }
}