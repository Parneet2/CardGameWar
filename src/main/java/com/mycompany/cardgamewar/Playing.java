/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardgamewar;

/**
 *
 * @author 62par
 */
public class Playing extends Card {
    private String suit;

    public Playing(int rank, String suit) {
        super(rank);
        this.suit = suit;
    }

    @Override
    public String toString() {
        String rankString;

        if (getRank() >= 2 && getRank() <= 10) {
            rankString = String.valueOf(getRank());
        } else {
            switch (getRank()) {
                case 11:
                    rankString = "Jack";
                    break;
                case 12:
                    rankString = "Queen";
                    break;
                case 13:
                    rankString = "King";
                    break;
                case 14:
                    rankString = "Ace";
                    break;
                default:
                    rankString = "Unknown";
            }
        }

        return rankString + " of " + suit;
    }
    
}
