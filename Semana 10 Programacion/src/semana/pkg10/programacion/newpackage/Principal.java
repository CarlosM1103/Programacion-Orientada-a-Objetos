/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10.programacion.newpackage;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author utpl
 */
public class Principal {

    static Stack<String> elementos = new Stack<>();
    static Queue<String> cola = new LinkedList<>();

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Recurso libro1 = new Libro(12, 52435, "Alexa", "Libro", 21);
        Recurso revista1 = new Revista(12, "Revista.com", "Carlos", "Revista", 16);
        Recurso tesis1 = new Tesis("UTPL", 123, "Mateo", "Tesis", 12);

        /* System.out.println("Ingrese el ISBN del Libro");
        ((Libro)libro1).setISBN(1212); */
        cola.add(libro1.toString() + "\n");
        cola.add(revista1.toString() + "\n");
        cola.add(tesis1.toString());

        System.out.println(cola);

    }

}
