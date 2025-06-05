/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg8.programación.dos;

/**
 *
 * @author utpl
 */
class Cuenta {

    String titular;
    double saldo;
    double intereses;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarTitular() {
        System.out.println("Titular: " + titular);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }

    public void tipoIntereses() {
        System.out.println("Interés: " + (intereses * 100) + "%");
    }

    public void ingresarSaldo(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se ingresaron $" + cantidad + " a la cuenta.");
        } 
    }

    public void cambiarTitular(String nuevoTitular) {
        if (nuevoTitular != null && !nuevoTitular.trim().isEmpty()) {
            titular = nuevoTitular;
            System.out.println("Titular actualizado correctamente.");
        } 
    }
}
