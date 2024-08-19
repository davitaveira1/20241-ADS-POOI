/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Aluno extends Pessoa {
    
    String matricula;

    public Aluno(String matricula,String nome,int idade,double altura){
        super(nome, idade, altura);
        this.matricula = matricula;
    }
    
    public void exibirDadosAluno(){
        System.out.println("Matricula: "+matricula);
    }
    
    
            
    
}
