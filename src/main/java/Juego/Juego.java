/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;
import Personajes.Personajes;

/**
 *
 * @author DAW1
 */
public class Juego {
    public static void main (String [] args){
    Personajes Dayana = new Personajes ("Dayana");
    Personajes Julia = new Personajes ("Julia", 100);
    
        System.out.println("Se han creado" + Personajes.getCreados()+"personajes");
        System.out.println(Dayana.getNombre()+ ":" + Dayana.getVida() + "HP");
        System.out.println(Julia.getNombre()+ ":" + Julia.getVida() + "HP");
        
        while (Dayana.getVida()>0 && Julia.getVida()>0) {System.out.println(Dayana.atacar (Julia));
        if (Julia.getVida()>0) {
            System.out.println(Julia.atacar(Dayana));
            }
        }
        
        String ganador= Dayana.getVida()>0 ? Dayana.getNombre(): Julia.getNombre();
            System.out.println("Ganador" + ganador);
    
    }
}
