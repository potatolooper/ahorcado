/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Diego 
 */
public class ArrayWordGenerator implements WordGenerator{
    
     private String[] WORDLIST = new String[] {
         "palabra","bardo"
     };
    
     @Override
     public String generateWord() throws GenerateWordException{
         int value = new java.util.Random().nextInt(WORDLIST.length);
         String word=WORDLIST[value];
         return word;
     }
}
