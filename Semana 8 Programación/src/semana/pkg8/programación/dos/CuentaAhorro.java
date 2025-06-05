/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg8.programación.dos;

/**
 *
 * @author utpl
 */
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String titular, double saldo) {
        super(titular, saldo);
        this.intereses = 0.05;
    }
    
}
