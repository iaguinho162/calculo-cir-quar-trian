package com.mycompany.maincirtrianquadra;

import org.junit.Test;
import static org.junit.Assert.*;

public class CirculoTest {  

    @Test
    // Teste para raio positivo
    public void testRaioPositivo() {
        Circulo circulo = new Circulo();
        circulo.setRaio(10);
        assertTrue(circulo.validarRaio());}
        
    @Test
    // Teste com raio negativo
    public void testRaioNegativo(){
        Circulo circulo = new Circulo();
        circulo.setRaio(-5);
        assertTrue(circulo.validarRaio());}
    
    @Test
    // Teste com raio par
    public void testRaioPar(){
        Circulo circulo = new Circulo();
        circulo.setRaio(4);
        assertTrue(circulo.validarRaio());}
    

    @Test
       // Teste com raio ímpar  
        public void testRaioImpar(){
        Circulo circulo = new Circulo();
        circulo.setRaio(3);
        assertFalse(circulo.validarRaio());}        
        
    @Test
    // Teste para raio igual a zero
        public void testRaioZaero() {
        Circulo circulo = new Circulo();
        circulo.setRaio(0);
        assertTrue(circulo.validarRaio());}
        
        
    }

