/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg8.programación;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Semana8Programación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad del perro");
        int edad = sc.nextInt();
        Perro p = new Perro("Mamifero",edad,"Labrador");
        
        p.ladrar();
        p.describir();
        p.calcularEdad(edad);
        p.vacunas(edad);
        
    }
    
}
