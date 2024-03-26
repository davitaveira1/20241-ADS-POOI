/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author Davi
 */
public class carro {
    
    String modelo;
    int anoFabricacao;
    double preco;
    boolean arCondicionado;
    
    //métodos
    void informarPreco(){
        System.out.println("Preço: "+preco);
    }
    
    void verificarArCondicionado(){
        if(arCondicionado)
            System.out.println("Possui ar-condicionado");
        else
            System.out.println("Não possui ar-condicionado");
    }
    
    void alterarPreco(double precoNovo){
        preco = precoNovo;
    }
    
    
    public static void main(String[] args) {
        carro c = new carro();
        c.modelo = "Honda Civic";
        c.anoFabricacao = 2020;
        c.preco = 90000;
        c.arCondicionado = false;
        
        //saída
        System.out.println("Modelo: "+c.modelo);
        System.out.println("Ano: "+c.anoFabricacao);
        //System.out.println("Preço: "+c.preco);
        c.informarPreco();
        //System.out.println("Ar-condicionado: "+c.arCondicionado);
        c.verificarArCondicionado();
        
        c.alterarPreco(100000);
        c.informarPreco();
    }
    
}
