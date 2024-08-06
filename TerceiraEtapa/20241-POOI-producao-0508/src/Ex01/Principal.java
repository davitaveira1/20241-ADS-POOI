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
        
        Aluno a = new Aluno("Davi");       
        
        a.setNome("Pedro");
        a.setNome("Lucas");
        a.setMedia(11);
        System.out.println("Nome: "+a.getNome());
        System.out.println("Media: "+a.getMedia());
        
    }
    
}
