/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02;

/**
 *
 * @author Davi
 */
public class Produto {
    
    String nome;
    int qtdEstoque;
    
    void atualizarEstoque(int qtdAdicionada){
        qtdEstoque = qtdEstoque + qtdAdicionada;
    }
    
    void exibirDetalhes(){
        System.out.println("Estoque: "+qtdEstoque);
    }
    
    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "Chocolate";
        p.qtdEstoque = 5;
        p.atualizarEstoque(20);
        p.exibirDetalhes();
        
        
        
        
    }
    
}
