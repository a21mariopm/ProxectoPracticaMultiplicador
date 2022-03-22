package com.mycompany.proxectopracticamultiplicador;

import java.util.Scanner;

/**
 *
  @author MarioP <a21mariopm@iessanclemente.net>
  @date 22 mar 2022
  @time 9:22:23
 */
public class PracticaMultiplicador 
{

    /**
     * Calcular resultado de multiplicacion de dos numeros
     * @param args
     */
    public static void main(String[] args)
 {
 // declara datos
 double num1; 
 double num2; 
 double produto;
 
 // indica datos
 java.util.Scanner in = new Scanner(System.in);
 System.out.println("Indica o primeiro número a multiplicar:");
 num1 = in.nextDouble();
         
 System.out.println("Indica o segundo número a multiplicar:");
 num2 = in.nextDouble();
 
 // calcula resultado
 produto = calcularproduto(num2, num1);
 
 // mostra resultados
 System.out.print( num1 + " * " );
 System.out.print( num2 + " = " );
 System.out.println( produto );
 }

    /**
     * Calcula producto de dos nunmeros
     * @param num2
     * @param num1
     * @return el resultado de la multiplicacion
     */
    public static double calcularproduto(double num2, double num1) {
        double produto;
        produto = num2 * num1;
        return produto;
    }
} 
