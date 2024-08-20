/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Davi",41,1.87,"111.111.111-11");
        
        Aluno a = new Aluno("123-4",p);
        a.responsavelFinanceiro = "Neide";
       
        a.exibirDadosAluno();
        a.dadosPessoais();
        
    }
    
}
