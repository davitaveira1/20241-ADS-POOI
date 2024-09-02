/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
abstract public class Funcionario {
    
    String nome;
    double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    abstract double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salarioBase=" + salarioBase + '}';
    }
    
    
    
}
