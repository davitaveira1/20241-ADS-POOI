/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmSala;

/**
 *
 * @author Davi
 */
public class Triangulo {
    
    double ladoA;
    double ladoB;
    double ladoC;
    double area;
    
    boolean validarTriangulo(){
        
        if(
                ((ladoA + ladoB) > ladoC) &&
                ((ladoB + ladoC) > ladoA) &&
                ((ladoA + ladoC) > ladoB)            
          ){
            return true;
        }else{
            return false;            
        }
    }
    
    void calcularArea(){ 
        
        if(validarTriangulo()){
           double p = (ladoA + ladoB + ladoC)/2;
           area = Math.sqrt( p*(p-ladoA)*(p-ladoB)*(p-ladoC) );
            
        }else{
            System.out.println("Triângulo inválido!");
        }
      
    }
    
    public static void main(String[] args) {
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();
        
        x.ladoA = 3;
        x.ladoB = 4;
        x.ladoC = 5;
        
        y.ladoA = 7.5;
        y.ladoB = 4.5;
        y.ladoC = 4.02;
        
        x.calcularArea();
        System.out.println("Area: "+x.area);
        y.calcularArea();
        System.out.println("Area: "+y.area);
        
        if(x.area > y.area){
            System.out.println("Triângulo X maior");
        }else{
            System.out.println("Triângulo Y maior");
        }
                
    }
    
}
