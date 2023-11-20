package com.mycompany.maincirtrianquadra;

import java.util.Scanner;

public class Circulo extends FigurasGeometricas{
    
    Scanner ler = new Scanner(System.in);
    private double raio, perimentro, area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    public void calcularArea(){
        
        System.out.println("Digite o Raio");
        raio = ler.nextDouble();
        this.area = Math.PI * Math.pow(raio,2);
        System.out.printf("A área do Circulo é: %.3f\n", this.area);
        perimentro = 2* Math.PI * raio;
        System.out.printf("O perimentro do Circulo é: %.3f " , perimentro);  
        

        
    }
    public boolean validarRaio() {
    if (raio < 0 || raio % 2 != 0 || raio == 0) {
        System.out.println("Raio inválido");
        return false;
    }
    return true;
}

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPerimentro() {
        return perimentro;
    }

    public void setPerimentro(double perimentro) {
        this.perimentro = perimentro;
    }

    
}
