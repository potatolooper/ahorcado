/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class HangMan {

    private final int MAX_FAILS = 6;

    private HiddenWord hiddenWord;

    public HiddenWord getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(HiddenWord hiddenWord) {
        this.hiddenWord = hiddenWord;
    }
    ArrayList<Character> fails = new ArrayList();

    public HangMan(String word) {
        hiddenWord = new HiddenWord(word);
    }

    public ArrayList<Character> getFails() {

        return fails;
    }

    public String getStringFails() {
        String spaceword = fails.toString();

        return spaceword;
    }

    public String showHiddenWord() {

        return hiddenWord.Show();
    }

    public String showFullWord() {

        return hiddenWord.showFullWord();
    }

    public void tryChar(char c) {

        if (!hiddenWord.chekcChar(c)) {
            fails.add(c);
        }
    }

    public boolean maxFailsExceeded() {
        int count = fails.size();

        if (MAX_FAILS == count) {
            return true;
        }
        return false;
    }

    public boolean isGameOver() {
        if (hiddenWord.isVisible()) {
            System.out.println("Bien has acertado la palabra");
            return true;
        } else if (maxFailsExceeded()) {
            System.out.println("Que pena Jose se murio");
            return true;
        }
        return false;
    }

}
