/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg14.programacion;

/**
 *
 * @author utpl
 */

public abstract class EmpleadoBase implements Empleado {
    protected String nombre;

    public EmpleadoBase(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}

