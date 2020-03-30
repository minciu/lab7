/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minciu.laborator7;
import java.util.*;
/**
 *
 * @author user
 */
public class Player implements Runnable{
    private String nume;
    private List<Token> jetoane= new ArrayList<>();
    int blankNr = 0;
    int scor;
    private Board tabla;

    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * @return the jetoane
     */
    public List<Token> getJetoane() {
        return jetoane;
    }

    /**
     * @param jetoane the jetoane to set
     */
    public void setJetoane(List<Token> jetoane) {
        this.jetoane = jetoane;
    }

    /**
     * @return the tabla
     */
    public Board getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(Board tabla) {
        this.tabla = tabla;
    }
    
    Player(String nume, Board tabla){
        this.nume=nume;
        this.tabla=tabla;
    }
    public void run() {}
}
