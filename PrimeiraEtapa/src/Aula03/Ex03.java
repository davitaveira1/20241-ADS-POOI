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
public class Ex03 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe a base: ");
        double base = leia.nextDouble();
        
        System.out.println("Informe o expoente:");
        double exp = leia.nextDouble();
        
        double res = Math.pow(base,exp);
        System.out.println("Resultado: "+res);
    }
    
}
