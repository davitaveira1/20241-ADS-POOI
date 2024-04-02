/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class Conta2 {

    double saldo;
    String titular;
    String ag;
    String nroConta;

    //para retirar da conta preciso ter saldo
    boolean saldoSuficiente(double valorRetirada) {
        //valor 1000 saldo 1000 = comprar
        //valor 1000 saldo 999 = não compro
        //valor 1000 saldo 1001 = compro

        if (saldo >= valorRetirada) {
            return true;
        } else {
            return false;
        }
    }

    void debitar(double valorRetirada) {
        if (saldoSuficiente(valorRetirada)) {
            System.out.println("Débito realizado com sucesso!");
            saldo = saldo - valorRetirada;
        } else {
            System.out.println("Não foi possível realizar o débito!");
        }
    }
    
    void creditar(double valorCreditado){
        saldo = saldo + valorCreditado;
    }    
    
    void transferir(Conta2 c, double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            c.saldo = c.saldo + valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public static void main(String[] args) {
        Conta2 contaA = new Conta2();
        Conta2 contaB = new Conta2();
        contaA.saldo = 1000;
        contaB.saldo = 0;
        
        contaA.transferir(contaB, 999);
        System.out.println("Saldo conta A:"+contaA.saldo);
        System.out.println("Saldo conta B:"+contaB.saldo);

    }
}
