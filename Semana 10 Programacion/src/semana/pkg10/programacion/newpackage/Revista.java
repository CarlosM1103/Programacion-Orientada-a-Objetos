/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10.programacion.newpackage;

/**
 *
 * @author utpl
 */
public class Revista extends Recurso {
    private Integer numEdicion;
    private String url;

    public Revista(Integer numEdicion, String url, String Autor, String Titulo, Integer Fecha) {
        super(Autor, Titulo, Fecha);
        this.numEdicion = numEdicion;
        this.url = url;
    }

    public Integer getNumEdicion() {
        return numEdicion;
    }

    public String getUrl() {
        return url;
    }

    public void setNumEdicion(Integer numEdicion) {
        this.numEdicion = numEdicion;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Revista = " + " numEdicion: " + numEdicion + " , url: " + url + super.toString() + '}';
    }
    
    
}
