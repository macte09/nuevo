/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initarray;

/**
 *
 * @author linux
 */
public class InitArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declara la varriable arreglo y inicializa con un arreglo de objetos
        //int[] array=new int[10];
        int[] array={1,2,3};
        System.out.printf("%s%8s%n","Index","Value");
        
        //Print cada valor
        for(int counter=0;counter<array.length; counter++)
        System.out.printf("%5d%8d%n",counter,array[counter]);
    }
}
        
        
    
    

