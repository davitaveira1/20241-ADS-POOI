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
    String responsavelFinanceiro;

    public Aluno(String matricula,Pessoa p){
        super(p.getNome(), p.getIdade(), p.getAltura(),p.cpf);
        this.matricula = matricula;
    }
    
    public void exibirDadosAluno(){
        super.exibirDadosPessoa();
        System.out.println("Matricula: "+matricula);
    }
    
    @Override
    public void dadosPessoais(){
        super.dadosPessoais();
        System.out.println("Responsável financeiro: "+responsavelFinanceiro);
        
    }
    
    
            
    
}
