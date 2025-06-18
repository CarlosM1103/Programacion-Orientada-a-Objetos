/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg10.programacion.newpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utpl
 */
public class Principal {

    public static void main(String[] args) {

        Recurso libro1 = new Libro(12, 123, "Carlos", "Tundayme", 16);
        Recurso revista1 = new Revista(12,"Revista.com", "Carlos", "Tundayme", 16);
        Recurso tesis1 = new Tesis("UTPL", 123, "Carlos", "Tundayme", 16);


        List<Recurso> lista = new ArrayList<>();
        lista.add(libro1);
        lista.add(revista1);
        lista.add(tesis1);
        
        
        for (Recurso p : lista) {
            System.out.println(p.toString());
        }
    }

}
