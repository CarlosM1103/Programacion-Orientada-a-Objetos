/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10.programacion.newpackage;

/**
 *
 * @author utpl
 */
public class Tesis extends Recurso {
    private String universidad;
    private Integer fecha;

    public Tesis(String universidad, Integer fecha, String Autor, String Titulo, Integer Fecha) {
        super(Autor, Titulo, Fecha);
        this.universidad = universidad;
        this.fecha = fecha;
    }

    public String getUniversidad() {
        return universidad;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tesis{" + "universidad=" + universidad + ", fecha=" + fecha + super.toString() + '}';
    }
    
    
    
}
