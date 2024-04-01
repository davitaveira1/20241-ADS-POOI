/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class Conta {
    
    String ag;
    String nroConta;
    
    //método que não retorna + com parâmetro
    void apresentarTitular(String titular){
        System.out.println("Titular: "+titular);
    }
    //método que não retorna + com parâmetro
    void cadastrarSaldo(double saldo){
        System.out.println("Saldo: "+saldo);
    }
    //método que não retorna + com parâmetro
    void apresentarInformacoesConta(String titular, double saldo){
        System.out.println("Ag: "+ag);
        System.out.println("Conta: "+nroConta);
        apresentarTitular(titular);
        cadastrarSaldo(saldo);
    }
    
    public static void main(String[] args) {
        Conta c = new Conta();
        c.ag = "0529-0";
        c.nroConta = "123123-0";        
        c.apresentarInformacoesConta("Davi", 1000);
    }
    
}
