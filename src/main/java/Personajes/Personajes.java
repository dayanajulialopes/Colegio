/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author DAW1
 */
public class Personajes {
 private String nombre;
    private int vida;
    
    public String getNombre () {return nombre;}
    public int getVida() { return vida;}
    
    public Personajes (String nombre, int vida){
        this.nombre = nombre;
        creados++;
        this.vida = vida;
    }
    public Personajes (String nombre){
        this(nombre,100);
    }
    
    private int CalcularDanio (){
        return 10 + (int)(Math.random()*16);
    }
    
    public String atacar (Personajes Enemigo){
        int Danio = CalcularDanio ();
        Enemigo.RecibirDanio (Danio);
        return nombre + "ataca a" + Enemigo.nombre + "(-"+ Danio + ")";
    }
    
    private void RecibirDanio (int cantidad){
        vida = Math.max(0, vida-cantidad);
    }
    
    public String TomarPocion (){
        int antes = vida;
        vida = Math.min(100, vida + 20);
        return nombre + "toma una poción (+" + (vida-antes)+ ")";
    }
    
    private static int creados = 0;
    public static int getCreados () {return creados;}   


}
