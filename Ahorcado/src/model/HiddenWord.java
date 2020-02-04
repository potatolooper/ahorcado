/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Diego Gonzalez
 */
public class HiddenWord {

    private char[] characters;
    private boolean[] hits;

    public HiddenWord(String word) {
        characters = word.toCharArray();
        hits = new boolean[characters.length];
    }

    public char[] getCharacters() {
        return characters;
    }

    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    public boolean[] getHits() {
        return hits;
    }

    public void setHits(boolean[] hits) {
        this.hits = hits;
    }

    public boolean chekcChar(char c) {
        boolean Exist = false;
        int number = 0;

        for (char i : characters) {

            if (i == c) {
                hits[number] = true;
                Exist = true;
            } 

            number++;
        }

        return Exist;
    }

    public String Show() {

        int number = 0;
        String hidden = "";
        for (boolean i : hits) {

            if (i) {
                hidden += "" + characters[number];

            } else {
                hidden += "-";
            }
            number++;
        }

        return hidden;

    }

    public String showFullWord() {

        String complete = "";
        for (char i : characters) {

            complete += i;
        }

        return complete;
    }

    public boolean isVisible() {
        int count = 0;

        for (boolean i : hits) {

            if (i) {
                count++;
            }
        }
        if (count == hits.length) {
            return true;
        }
        return false;
    }

}
