/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_each;

/**
 *
 * @author Henrique
 */
public class For_each {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] vetor = new String[] {"Maria", "Bob", "Alex"};
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        System.out.println("----------------");
        
        for (String apelido : vetor) {
            System.out.println(apelido);
        }
    }    
}
