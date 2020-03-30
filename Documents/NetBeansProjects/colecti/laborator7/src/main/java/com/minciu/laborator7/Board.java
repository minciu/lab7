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
public class Board {
    List<Token> jetoane;
    Player castiga;
    Boolean isWinner = false;
    
    public Board(List<Token> jetoane) {
        this.jetoane = jetoane;
    }
    
    public void adaugaJetoane(Token jeton) {
        jetoane.add(jeton);
    }
}
