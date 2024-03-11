/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author Davi
 */
import java.util.Scanner;
public class Ex02 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double num = leia.nextDouble();
        double resultado = Math.sqrt(num);
        
        System.out.println("Resultado: "+resultado);
    }
    
}
