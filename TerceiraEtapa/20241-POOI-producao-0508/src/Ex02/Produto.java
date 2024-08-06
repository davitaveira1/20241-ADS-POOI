/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class Produto {
    
    private String nome;
    private double preco;
    static int totalProdutos=0;
    
    Produto(String nomeProduto,double precoProduto){
        nome = nomeProduto;
        preco = precoProduto;
        totalProdutos++;
    }
    
    void setNome(String nomeProduto){
        nome = nomeProduto;
    }
    
    String getNome(){
        return nome;
    }
    
    void setPreco(double precoProduto){
        preco = precoProduto;
    }
    
    double getPreco(){
        return preco;
    }
    
    void atualizarPreco(double desconto){
        preco = preco*(100-desconto)/100;
    }
    
}
