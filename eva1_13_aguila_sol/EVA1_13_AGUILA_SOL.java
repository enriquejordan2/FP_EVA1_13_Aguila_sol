/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_aguila_sol;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_13_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ALEAOTRIO
        //GENERAR NUMEROS ALEAOTORIOS
        double valor = Math.random();
        //random genera valores >= 0 y < a 1
        // entre 0 y .9999999999999
        
        if(valor <= 0.1){
         System.out.println("Aguila");
        }else{ 
            System.out.println("Sol");
        }        
    }
    
}
