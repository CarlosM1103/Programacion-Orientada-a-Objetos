/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10.programacion.newpackage;

/**
 *
 * @author utpl
 */
public class Recurso {
    private String Autor;
    private String Titulo;
    private Integer Fecha;

    public Recurso(String Autor, String Titulo, Integer Fecha) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Fecha = Fecha;
    }


    public String getAutor() {
        return Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public Integer getFecha() {
        return Fecha;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setFecha(Integer Fecha) {
        this.Fecha = Fecha;
    }
    
    @Override
    public String toString() {
        return " | Recurso = " + " Autor: " + Autor + " , Titulo: " + Titulo + " , Fecha: " + Fecha + '}';
    }
}
