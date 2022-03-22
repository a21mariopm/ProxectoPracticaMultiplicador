/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectopracticamultiplicador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 * Calcula multiplic acion de dos numeros
 * @author MarioP <a21mariopm@iessanclemente.net>
 */
public class PracticaMultiplicadorTest {
    
    /**
     * Calcula resultado de multiplicar dos numeros
     * Prueba
     */
    public PracticaMultiplicadorTest() {
    }

    /**
     * Test of main method, of class PracticaMultiplicador.
     */
    @Disabled
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PracticaMultiplicador.main(args);
    }

    /**
     * Test of calcularproduto method, of class PracticaMultiplicador.
     */
    @Test
    public void testCalcularproduto() {
        System.out.println("calcularproduto");
        double num2 = 10.0;
        double num1 = 20.0;
        double expResult = 200.0;
        double result = PracticaMultiplicador.calcularproduto(num2, num1);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of muestraResultado method, of class PracticaMultiplicador.
     */
    @Test
    public void testMuestraResultado() {
        System.out.println("muestraResultado");
        double num1 = 5.0;
        double num2 = 4.0;
        double produto = 20.0;
        PracticaMultiplicador.muestraResultado(num1, num2, produto);
    }
    
}
