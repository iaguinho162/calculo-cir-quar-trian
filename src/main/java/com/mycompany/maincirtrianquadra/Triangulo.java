
package com.mycompany.maincirtrianquadra;

import java.util.Scanner;


public class Triangulo extends FigurasGeometricas{
     
    private double  altura, base;
    
    Scanner ler = new Scanner(System.in);
    
    public void calcularArea(){
        
        System.out.println("Digite a Base: ");
        base = ler.nextDouble();
        System.out.println("\nDigite a Altura: ");
        altura = ler.nextDouble();
        area = (base * altura) /2;
        System.out.printf("A área do Triangulo é: %.2f ",area);
    }
    
    
    
}
