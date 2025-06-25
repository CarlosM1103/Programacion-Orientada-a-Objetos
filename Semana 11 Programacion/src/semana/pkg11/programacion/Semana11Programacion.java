/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg11.programacion;

/**
 *
 * @author utpl
 */

abstract class Figura {
   
    abstract double calcularPerimetro();
}

// Clase que representa un círculo
class Circulo extends Figura {
    double radio;

  
    Circulo(double r) {
        this.radio = r;
    }

    @Override
    double calcularPerimetro() {
        return Math.PI * radio * 2;
    }
}

// Clase que representa un triángulo
class Triangulo extends Figura {
    double lado1, lado2, lado3;


    Triangulo(double L1, double L2, double L3) {
        this.lado1 = L1;
        this.lado2 = L2;
        this.lado3 = L3;
    }

    // Calcula el perímetro sumando los tres lados
    @Override
    double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

// Clase que representa un cuadrado
class Cuadrado extends Figura {
    double lado;

 
    Cuadrado(double lado) {
        this.lado = lado;
    }

    // Calcula el perímetro multiplicando el lado por 4
    @Override
    double calcularPerimetro() {
        return lado * 4;
    }
}

// Clase que representa un rectángulo
class Rectangulo extends Figura {
    double largo, ancho;


    Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Calcula el perímetro usando la fórmula 2*(largo + ancho)
    @Override
    double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}

// Clase que representa un rombo
class Rombo extends Figura {
    double lado;

   
    Rombo(double lado) {
        this.lado = lado;
    }

    // Calcula el perímetro multiplicando el lado por 4
    @Override
    double calcularPerimetro() {
        return lado * 4;
    }
}


public class Semana11Programacion {

    public static void main(String[] args) {
        // Se crean distintas figuras y se imprime el resultado de calcularPerimetro()

        Figura miFigura = new Circulo(5);
        System.out.println("Area: " + miFigura.calcularPerimetro()); // 

        Figura miFigura2 = new Triangulo(5, 3, 2);
        System.out.println("Area: " + miFigura2.calcularPerimetro());

        Figura miFigura3 = new Cuadrado(6);
        System.out.println("Area: " + miFigura3.calcularPerimetro());

        Figura miFigura4 = new Rectangulo(4, 7);
        System.out.println("Area: " + miFigura4.calcularPerimetro());

        Figura miFigura5 = new Rombo(8);
        System.out.println("Area: " + miFigura5.calcularPerimetro());
    }
}

