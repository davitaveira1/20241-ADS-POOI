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
        
        Pessoa p = new Pessoa();
        p.nome = "Davi";
        //p.idade = 40;
        p.setIdade(40);
        p.endereco = "Rua x";
        p.cpf = "111111111111";
        
        
        p.alterarEndereco("Rua ABC");
        p.exibirDados();
        if(p.validarCpf()){
            System.out.println("Tamanho CPF VÁLIDO");
        }else{
            System.out.println("Tamanho CPF INVÁLIDO");
        }
        
    }
    
}
