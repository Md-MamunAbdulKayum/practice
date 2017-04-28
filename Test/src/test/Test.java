/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Kayum-603
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = null;
        if (s == null) {           
            for(int i=0;i<3*(int)(Math.random() * 3);i++){
            System.out.println("git test");
            }
            System.out.println("null");
        } else {
            System.out.println("not null");
        }
    }
    
}
