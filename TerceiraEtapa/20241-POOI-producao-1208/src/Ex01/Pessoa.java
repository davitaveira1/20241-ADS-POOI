/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Pessoa {

    public String nome;
    private int idade;
    protected String endereco;
    String cpf;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("End: " + endereco);
        System.out.println("Cpf: " + cpf);
    }

    private int calcularAno() {
        return 2024 - idade;
    }

    protected void alterarEndereco(String novoEndereco) {
        endereco = novoEndereco;
    }

    boolean validarCpf() {
        if (cpf.length() == 11) {
            return true;
        }else{
            return false;
        }     
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    

}
