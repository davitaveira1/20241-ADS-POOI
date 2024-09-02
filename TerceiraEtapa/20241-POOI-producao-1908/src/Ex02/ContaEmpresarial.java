/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class ContaEmpresarial extends Conta{
    
    double limite;

    public ContaEmpresarial(double limite, String nroConta, String titular, double saldo) {
        super(nroConta, titular, (saldo+limite));
        this.limite = limite;
    }
    
    @Override
    public void saque(double valor){
        double valorComTaxa = valor + 10;
        if(saldo >= valorComTaxa){
            saldo -= valorComTaxa;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Limite: "+limite);
    }
    
    
    
    
}
