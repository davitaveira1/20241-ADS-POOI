/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
 
        ContaEmpresarial ce = new ContaEmpresarial(2000, "12345-6", "Empresa-X", 5000);
        ce.saque(1000);
        ce.exibirInformacoes();
        
        Conta c = new Conta("78901-2", "João Silva", 2000);
        c.saque(500);
        c.exibirInformacoes();
        
        ContaPoupanca cp = new ContaPoupanca("34567-8", "Maria Oliveira", 3000);
        cp.saque(500);
        cp.exibirInformacoes();
        
        
    }
    
}
