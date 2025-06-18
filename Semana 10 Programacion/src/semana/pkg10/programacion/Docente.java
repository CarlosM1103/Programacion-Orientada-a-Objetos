/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10.programacion;

/**
 *
 * @author utpl
 */
public class Docente extends Persona {
    private Integer horasClase;

    public Docente(Integer horasClase, String nombre, String apellido, Integer dni) {
        super(nombre, apellido, dni);
        this.horasClase = horasClase;
    }

    public Integer getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(Integer horasClase) {
        this.horasClase = horasClase;
    }
    
    @Override
    public String toString() {
        return "Docente{" + "horas clase=" + horasClase + super.toString() + '}';
    }
    
    
   
}

