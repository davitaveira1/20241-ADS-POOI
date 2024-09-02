/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class FuncionarioHorista extends Funcionario{
    
    double horasTrabalhadas;
    
    public FuncionarioHorista(String nome, double salarioBase, double horasTrabalhadas) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    double calcularSalario(){
        return salarioBase * horasTrabalhadas;
    }
}
