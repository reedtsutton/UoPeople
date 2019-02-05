/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsubroutines;

import java.io.*; //Import TextIO

/**
 *
 * @author Reed
 */
public class Firstsubroutines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputWord; // word gathered from the use
        String inputWordStrip; // delcare string that will be the stripped input word
        String inputWordStripRev;
        
        System.out.print("enter a word and I will determine if it is palindromic: ");
        inputWord = TextIO.getln();       
        System.out.println(); // print a new line
        
        // call the subroutines produce the stripped word and then reverse that word
        inputWordStrip = strstrip(inputWord);   
        inputWordStripRev = streverse(inputWordStrip); 
        
        // print out the two results to show the user
        System.out.println("The stripped word is: " + inputWordStrip);   
        System.out.println("The reverse of that word is: " + inputWordStripRev);
        
        // test if the word is a palindrome
        // print a statement accordingly
        if (inputWordStrip.equals(inputWordStripRev)) {
            System.out.println("This is palindromic");
        } else {
            System.out.println("This is NOT palindromic");
        }
   
    }
    
    public static String strstrip(String strip) {
        int i; // declare var for counting through each position of strip
        String alphaString=""; // declare var for removed non-letters
        String alphaStringLower; // declare var for lowercase
        
        for (i=0; i<strip.length(); i++) {
            if (Character.isLetter(strip.charAt(i))) {
                alphaString = alphaString+strip.charAt(i);
            }
        }
        
        alphaStringLower = alphaString.toLowerCase(); // converts to lowercase
        return alphaStringLower;
    }
    
    public static String streverse(String str) {
        // reverses the ordering of str
        int i;
        String reverse = "";
        for (i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }    
        return reverse;
    }
    
}