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

    public Aluno(String matricula,Pessoa p){
        super(p.getNome(), p.getIdade(), p.getAltura());
        this.matricula = matricula;
    }
    
    public void exibirDadosAluno(){
        super.exibirDadosPessoa();
        System.out.println("Matricula: "+matricula);
    }
    
    
            
    
}
