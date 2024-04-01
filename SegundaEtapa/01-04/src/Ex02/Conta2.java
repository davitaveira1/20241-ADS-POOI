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
        } else {
            System.out.println("Não foi possível realizar o débito!");
        }
    }

    public static void main(String[] args) {
        Conta2 c = new Conta2();
        c.saldo = 1000;
        //c.debitar(999);
        //c.debitar(1000);
        c.debitar(1001);
    }
}
