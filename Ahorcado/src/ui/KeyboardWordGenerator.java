/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author a19diegogc
 */
public class KeyboardWordGenerator implements WordGenerator{
    Scanner scan = new Scanner(System.in);
    

    @Override
    public String generateWord() throws GenerateWordException {
        String vocal = null;
       if(System.console()==null){
           vocal= scan.nextLine();
         }else{
          vocal = Arrays.toString(System.console().readPassword());
       }
                
         
        return vocal;
        
    }
    
}
