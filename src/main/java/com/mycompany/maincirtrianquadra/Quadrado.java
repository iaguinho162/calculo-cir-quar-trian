package com.mycompany.maincirtrianquadra;

import java.util.Scanner;

public class Quadrado  extends FigurasGeometricas{
    
    private double base,altura;
    Scanner ler = new Scanner(System.in);
    
    
    public void calcularArea(){        
        System.out.println("Digite a Base\n");
        base = ler.nextDouble();
        System.out.println("Digite a Altura\n");
        altura = ler.nextDouble();
        area = base * altura;
        System.out.printf("A área do Quadrado é: %.2f ", area);
        
    }
    
}
