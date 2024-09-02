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
        
        Funcionario fHorista = new FuncionarioHorista("davi", 100, 10);
        System.out.println(fHorista.calcularSalario());
        
        //FuncionarioHorista fhora = new FuncionarioHorista("davi", 100, 10);
        
 
        
        Funcionario fMensalista = new FuncionarioMensalista("Lucas", 3000);
        System.out.println(fMensalista.calcularSalario());
        
        
    }
    
}
