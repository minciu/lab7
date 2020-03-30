/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minciu.laborator7;

/**
 *
 * @author user
 */
public class Token {
    private int numar;
    private boolean blank;
    
  
    /**
     * @return the numar
     */
    public int getNumar() {
        return numar;
    }

    /**
     * @param numar the numar to set
     */
    public void setNumar(int numar) {
        this.numar = numar;
    }

    /**
     * @return the joker
     */
    public boolean isJoker() {
        return blank;
    }

    /**
     * @param joker the joker to set
     */
    public void setJoker(boolean blank) {
        this.blank = blank;
    }
    
    @Override
    public String toString() {
        return "joc.Token" +
                "numbarul este " + getNumar();
                
    }
    
}
