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
    
    String nroConta;
    String titular;
    double saldo;

    public Conta(String nroConta, String titular, double saldo) {
        this.nroConta = nroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void saque(double valor){  
        double valorComTaxa = valor + 5;
        if(saldo >= valorComTaxa){
            saldo -= valorComTaxa;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void deposito(double valor){
        saldo += valor;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nº conta: "+nroConta);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
    }
    
    
}

