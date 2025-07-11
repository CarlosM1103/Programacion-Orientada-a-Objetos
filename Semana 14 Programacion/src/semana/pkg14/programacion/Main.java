 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg14.programacion;
 import java.util.*;
/**
 *
 * @author utpl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        GestorBaseDatos.crearTabla();

        System.out.print("¿Cuántos empleados deseas ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEmpleado #" + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Seleccione el rol:");
            System.out.println("1. Gerente");
            System.out.println("2. Desarrollador");
            System.out.print("Opción: ");
            int opcionRol = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Horas trabajadas: ");
            double horas = scanner.nextDouble();
            scanner.nextLine();

            Empleado empleado;

            if (opcionRol == 1) {
                empleado = new Gerente(nombre, horas);
            } else {
                empleado = new Desarrollador(nombre, horas);
            }

            System.out.println("Salario calculado: $" + empleado.calcularSalario());

            GestorBaseDatos.insertarEmpleado(empleado);
        }

        System.out.println("\nEmpleados registrados en la base de datos:");
        GestorBaseDatos.mostrarEmpleados();


    }
}

    
    

