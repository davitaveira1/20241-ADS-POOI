/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author Davi
 */
public class Calculadora {
    
    static double somar(double a, double b){
        return a+b;
    }   
    
    static double subtrair(double a, double b){
        return a-b;
    }
    
    static double multiplicar(double a, double b){
        return a*b;
    }
    
    static double dividir(double a,double b){
        if(b==0){
            throw new ArithmeticException();
        }
            return a/b;
    }
    
}
