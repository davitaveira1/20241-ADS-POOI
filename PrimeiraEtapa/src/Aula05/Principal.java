/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Davi","000.888.701-19");
        
        System.out.println("Nome: "+p.nome);
        System.out.println("CPF: "+p.cpf);
    }
    
}
