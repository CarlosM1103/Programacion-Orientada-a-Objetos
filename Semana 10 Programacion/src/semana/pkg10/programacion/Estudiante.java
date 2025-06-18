/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10.programacion;

/**
 *
 * @author utpl
 */
public class Estudiante extends Persona {
    private Integer expediente;

    public Estudiante(Integer expediente, String nombre, String apellido, Integer dni) {
        super(nombre, apellido, dni);
        this.expediente = expediente;
    }

    public Integer getExpediente() {
        return expediente;
    }

    public void setExpediente(Integer expediente) {
        this.expediente = expediente;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "expediente=" + expediente + super.toString() + '}';
    }

    
    
}
