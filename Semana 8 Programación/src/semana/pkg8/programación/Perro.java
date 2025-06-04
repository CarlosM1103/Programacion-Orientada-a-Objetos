/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg8.programación;

/**
 *
 * @author utpl
 */
public class Perro extends Animal {

    String raza;

    Perro(String tipo, int edad, String raza) {
        super(tipo, edad);
        this.raza = raza;
    }

    void ladrar() {
        System.out.println("Guau guau - Soy un " + raza);
    }

    void vacunas(int edad) {
        if (edad <= 3) {
            System.out.println("4 vacunas");
        } else {
            System.out.println("3 vacunas");
        }
    }

}
