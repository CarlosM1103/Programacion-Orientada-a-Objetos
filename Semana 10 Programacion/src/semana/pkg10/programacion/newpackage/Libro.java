/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10.programacion.newpackage;

/**
 *
 * @author utpl
 */
public class Libro extends Recurso  {
    private Integer ISBN;
    private Integer impresiones;

    public Libro(Integer ISBN, Integer impresiones, String Autor, String Titulo, Integer Fecha) {
        super(Autor, Titulo, Fecha);
        this.ISBN = ISBN;
        this.impresiones = impresiones;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public Integer getImpresiones() {
        return impresiones;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public void setImpresiones(Integer impresiones) {
        this.impresiones = impresiones;
    }
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", impresiones=" + impresiones + super.toString() +'}';
    }
    
    
    
    
}
