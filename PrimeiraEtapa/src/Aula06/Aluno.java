/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06;

/**
 *
 * @author Davi
 */
public class Aluno {
    
    int idade;
    String nome;
    double altura;

    public Aluno(int idade, String nome, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }
    
    //get e set atributo idade
    int getIdade(){
        return idade;
    }
    
    void setIdade(int idade){
        idade = this.idade;
    }
    
    
    
}
