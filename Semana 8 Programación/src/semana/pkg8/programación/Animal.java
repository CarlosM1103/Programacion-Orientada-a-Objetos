/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg8.programación;

/**
 *
 * @author utpl
 */
public class Animal {

    String tipo;
    int edad;

    Animal(String tipo,int edad) {
        this.tipo = tipo;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    void describir() {
        System.out.println("Tipo: " + tipo);
    }

    void calcularEdad(int edad) {
        if (edad <= 3) {
            System.out.println("Animal cachorro");
        } else {
            System.out.println("Animal adulto");
        }
    }
    
   

}
