/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minciu.laborator7;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/**
 *
 * @author user
 */
public class Game {
    Board tabla;
    List<Player> jucatori;
    List<Token> jetoane;
    
   
    public Game( int jeton, int jetonMaxim,int nrJucatori, int n) {
       
        tabla = new Board(jetoane);
        jucatori = new ArrayList<>();
        alegeJetoane(jeton, jetonMaxim);
        for (int i = 0; i < nrJucatori; ++i) {
            //jucatori.add(Player(String.format("joc.Player %d", i + 1), tabla, n));
            
        }
    }
    
    public void alegeJetoane(int nrJetoane,int jetonMaxim){
         jetoane = new ArrayList<>();
          List<Integer> valoriPosibile= new ArrayList<>();
              for (Integer i = 0; i < jetonMaxim; i++){
                     valoriPosibile.add(i);}
        Collections.shuffle(valoriPosibile);
        
        int nrBlank=2;
        for (int i = 0; i < nrJetoane - nrBlank; ++i) {
          //  jetoane.add(Token(valoriPosibile.get(i)));
        }
    }
    
}
