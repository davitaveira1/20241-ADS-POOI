/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Aluno {
    
    
    private String nome;
    private double media;   
    private int idade;
    
    //construtor
    Aluno(String nomeAluno){
        nome = nomeAluno;
    }
    
    //set nome
    void setNome(String nomeAluno){
        nome = nomeAluno;
    }
    
    //get nome
    String getNome(){        
        return nome;
    }
    
    //set media
    void setMedia(double mediaAluno){
        if(mediaAluno<0 && mediaAluno > 10){
            System.out.println("Variável inválida!");
        }else{
            media = mediaAluno;
        }
        
    }
    
    //get media
    double getMedia(){
        return media;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idadeAluno) {
        this.idade = idadeAluno;
    }
    
    
    
    

    
    
       
}
