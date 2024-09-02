/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class FuncionarioMensalista extends Funcionario{

    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override
    double calcularSalario() {
        return salarioBase;
    }
    
    
    
}
