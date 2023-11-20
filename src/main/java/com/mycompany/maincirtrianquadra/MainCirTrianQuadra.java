package com.mycompany.maincirtrianquadra;

import java.util.Scanner;

public class MainCirTrianQuadra {

    public static void main(String[] args) {

        int opcao;

        Circulo cir = new Circulo();
        Quadrado quadr = new Quadrado();
        Triangulo trian = new Triangulo();
        Scanner ler = new Scanner(System.in);

        opcao = 0;
        while (opcao != 4) {
            System.out.println("\n[----------------------MENU----------------------]");
            System.out.println("[1]- Calculo do Circulo\n[2]- Calculo do Triangulo\n[3]- Calculo do Quadrado\n[4]- Sair");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    cir.calcularArea();
                    break;

                case 2:
                    trian.calcularArea();
                    break;

                case 3:
                    quadr.calcularArea();
                    break;
                
                case 4: 
                    System.out.println("Programa Encerrado!!");

                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }
    }
}
