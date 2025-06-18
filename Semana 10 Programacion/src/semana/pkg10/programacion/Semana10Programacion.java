/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg10.programacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Semana10Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Ejemplo: ");
        
        Persona estudiante1 = new Estudiante(12,"Carlos","Jaramillo",23);
        Persona estudiante2 = new Estudiante(13,"Wilson","Guarson",25);
        
        Persona docente1 = new Docente(22,"Ramiro","Ramirez",100);
        Persona docente2 = new Docente(25,"Richard","Nol",100);
       
        Persona administrativo1 = new Administrativo(12,"Marshall","Melon", 28);
        
        List <Persona> lista = new ArrayList<>();
        lista.add(estudiante1);
        lista.add(estudiante2);
        lista.add(docente1);
        lista.add(docente2);
        lista.add(administrativo1);
        
        
        ((Docente)docente2).setHorasClase(10);
        
        System.out.println("Ingrese el numero de uniformes");
        ((Administrativo)administrativo1).setUniformes(leer.nextInt());
        
        for(Persona p:lista){
            System.out.println(p.toString());
        }
        
    }
    
}
