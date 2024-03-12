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
public class Ex05 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome = leia.next();
        int idade = leia.nextInt();
        double altura = leia.nextDouble();
        
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
    }
    
}
