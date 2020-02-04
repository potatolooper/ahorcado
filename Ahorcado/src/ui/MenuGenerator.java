/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.HangMan;
import java.util.Scanner;

/**
 *
 * @author a19diegogc
 */
public class MenuGenerator {
      Scanner scanner = new Scanner(System.in);
    HangMan hangMan;

    private String showInitMenu() throws GenerateWordException {
        System.out.println("Elije el modo de juego");
        System.out.println(" 1 Palabra aleatoria");
        System.out.println(" 2 Palabra por ordenador(no mayusculas)");
        int lobby = scanner.nextInt();
        scanner.nextLine();
        switch(lobby){
            case 1:
               ArrayWordGenerator array = new ArrayWordGenerator();
                 return array.generateWord();
              
            case 2:
                System.out.println("Introduce la palabra:");
                KeyboardWordGenerator keyboard = new KeyboardWordGenerator();
                 return keyboard.generateWord();
        }
                     
              return "Error 404";
          
    }

    private void showGameMenu() {
        
        while (!hangMan.isGameOver()) {
            System.out.println(hangMan.getHiddenWord().Show());
            System.out.println("Introduce letra");
            hangMan.tryChar(scanner.nextLine().charAt(0));
        }

    }
    
    private boolean showExitMenu(){
        System.out.println("Quieres salir del juego?(true or false)");
        boolean exit=scanner.nextBoolean();
        scanner.nextLine();
        return exit;
               
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MenuGenerator menuGenerator = new MenuGenerator();
        
        do {
            try {
                menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
                menuGenerator.showGameMenu();
            } catch (GenerateWordException ex) {
                if(ex.isVisible()){
                    System.out.println(ex.getMessage());
                }
            }
        } while (!menuGenerator.showExitMenu());

    }

}

