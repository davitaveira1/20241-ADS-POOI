/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nroConta, String titular, double saldo) {
        super(nroConta, titular, saldo);
    }
    
    @Override
    public void saque(double valor){
        if(saldo >= valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
}
