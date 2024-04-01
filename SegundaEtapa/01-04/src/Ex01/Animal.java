/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Animal {
    
    String nome;
    String sexo;
    
    //não retorna e não tem parâmetro
    void apresentarNome(){
        System.out.println("Nome: "+nome);
    }
    //não retorna e tem parâmetro
    void apresentarNomeProprietario(String prop){
        System.out.println("Proprietário: "+prop);
    }
    //retorna sem parâmetro
    String apresentarNomeRetorno(){
        return nome;
    }
    //retorna com parâmetro
    int calcularIdadeEquivalente(int idadeCachorro){
        int idadeEquivalente = idadeCachorro * 7;
        return idadeEquivalente;
    }
    
    public static void main(String[] args) {
        
        Animal a = new Animal();
        //atribuir valores
        a.nome = "Pluto";
        //chamando métodos que não retornam
        a.apresentarNome();
        a.apresentarNomeProprietario("Davi");
        //chamando métodos que retornam
        String valorRetornoString = a.apresentarNomeRetorno();
        int valorRetornoInt = a.calcularIdadeEquivalente(3);
        
        System.out.println("Nome utilizando método que retorna: "+valorRetornoString);
        System.out.println("Idade equivalente: "+valorRetornoInt);
        
    }
           
    
}
