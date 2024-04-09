/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardgamewar;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 62par
 */
public class GroupOfCards {
     private ArrayList<Card> cards;
    private int size;
    private Player player;

    public GroupOfCards(int size, Player player) {
        this.size = size;
        cards = new ArrayList<>();
        this.player = player;
    }
    
    

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Player getOwner() {
        return player;
    }
}

