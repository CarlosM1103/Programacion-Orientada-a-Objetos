/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg8.programación.dos;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Principal {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("", 0);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("", 0);

        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver cuenta ahorro");
            System.out.println("2. Ver cuenta corriente");
            System.out.println("3. Ingresar saldo a cuenta ahorro");
            System.out.println("4. Ingresar saldo a cuenta corriente");
            System.out.println("5. Cambiar titular de cuenta ahorro");
            System.out.println("6. Cambiar titular de cuenta corriente");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    cuentaAhorro.mostrarTitular();
                    cuentaAhorro.mostrarSaldo();
                    cuentaAhorro.tipoIntereses();
                    break;
                case 2:
                    cuentaCorriente.mostrarTitular();
                    cuentaCorriente.mostrarSaldo();
                    cuentaCorriente.tipoIntereses();
                    break;
                case 3:
                    System.out.print("Cantidad a ingresar en cuenta ahorro: ");
                    double ingresoAhorro = sc.nextDouble();
                    cuentaAhorro.ingresarSaldo(ingresoAhorro);
                    break;
                case 4:
                    System.out.print("Cantidad a ingresar en cuenta corriente: ");
                    double ingresoCorriente = sc.nextDouble();
                    cuentaCorriente.ingresarSaldo(ingresoCorriente);
                    break;
                case 5:
                    System.out.print("Nuevo titular para cuenta ahorro: ");
                    String nuevoTitularAhorro = sc.nextLine();
                    cuentaAhorro.cambiarTitular(nuevoTitularAhorro);
                    break;
                case 6:
                    System.out.print("Nuevo titular para cuenta corriente: ");
                    String nuevoTitularCorriente = sc.nextLine();
                    cuentaCorriente.cambiarTitular(nuevoTitularCorriente);
                    break;
                case 7:
                    salir = true;
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

 
    }
}

