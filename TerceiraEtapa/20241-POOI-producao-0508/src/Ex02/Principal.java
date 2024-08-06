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
        
        Produto p = new Produto("Cadeira Gamer", 800);
        p.setNome("Cadeira ergonomica");
        p.atualizarPreco(15);
        System.out.println("Preco atualizado: "+p.getPreco());
        p.setPreco(720);
        System.out.println("Preco atualizado: "+p.getPreco());
        
        System.out.println(Produto.totalProdutos);
        System.out.println(p.totalProdutos);
        
    }
    
}
