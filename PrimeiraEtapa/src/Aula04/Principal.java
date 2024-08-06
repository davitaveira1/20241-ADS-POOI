/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author Davi
 */
public class Principal {

    public static void main(String[] args) {

        double soma = Calculadora.somar(10, 20);
        double sub = Calculadora.subtrair(10, 20);
        double mult = Calculadora.multiplicar(10, 20);
        
        //soma
        System.out.println("Soma: " + soma);
        
        //subtrair
        System.out.println("Subtrair: "+ sub);
        
        //multiplicar
        System.out.println("Multiplicar: "+ mult);
        
  
        
        //divisão
        try {
            double div = Calculadora.dividir(10, 0);
            System.out.println("Divisão: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero!");
        }

    }

}
