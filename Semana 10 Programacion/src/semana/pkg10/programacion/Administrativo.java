/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10.programacion;

/**
 *
 * @author utpl
 */
public class Administrativo extends Persona {
    private Integer uniformes;

    public Administrativo(Integer uniformes, String nombre, String apellido, Integer dni) {
        super(nombre, apellido, dni);
        this.uniformes = uniformes;
    }

    public Integer getUniformes() {
        return uniformes;
    }

    public void setUniformes(Integer uniformes) {
        this.uniformes = uniformes;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "uniformes= " + uniformes + super.toString() + '}';
    }
    
    
    
}
