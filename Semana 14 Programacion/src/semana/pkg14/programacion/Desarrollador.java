/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg14.programacion;

/**
 *
 * @author utpl
 */

public class Desarrollador extends EmpleadoBase {
    private double horas;
    private final double pagoHora = 30;

    public Desarrollador(String nombre, double horas) {
        super(nombre);
        this.horas = horas;
    }

    @Override
    public double calcularSalario() {
        return horas * pagoHora;
    }

    @Override
    public String getRol() {
        return "Desarrollador";
    }
}

