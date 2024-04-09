/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cardgamewar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 62par
 */
public class CardGameWarTest {
    
    public CardGameWarTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of play method, of class CardGameWar.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        CardGameWar instance = new CardGameWar();
       // instance.play();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of declareWinner method, of class CardGameWar.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        CardGameWar instance = new CardGameWar();
       // instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of displayPlayerScores method, of class CardGameWar.
     */
    @Test
    public void testDisplayPlayerScores() {
        System.out.println("displayPlayerScores");
        CardGameWar instance = new CardGameWar();
        //instance.displayPlayerScores();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addPlayer method, of class CardGameWar.
     
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        Player player = null;
        CardGameWar instance = new CardGameWar();
        instance.addPlayer(player);
        // TODO review the generated test code and remove the default call to fail.
       
    }*/
     @Test
    public void testAddPlayerGood() {
        System.out.println("addPlayer good");
        Player player = new Player("Alice"); // Create a player instance
        CardGameWar instance = new CardGameWar();
        instance.addPlayer(player);
        assertEquals(1, instance.getPlayers().size(), "Player should be added successfully");
    }

      @Test
public void testAddPlayerBad() {
    System.out.println("addPlayer bad");
    Player player = null; // Null player instance
    CardGameWar instance = new CardGameWar();

    // Use assertThrows to check for IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> instance.addPlayer(player),
            "Adding a null player should throw IllegalArgumentException");
}

   @Test
    public void testAddPlayerBoundary() {
        System.out.println("addPlayer boundary");
        CardGameWar instance = new CardGameWar();
        for (int i = 0; i < 10; i++) { // Limiting to a reasonable boundary
            Player player = new Player("Player" + i);
            instance.addPlayer(player);
        }
        assertEquals(10, instance.getPlayers().size(), "Player addition should handle boundary correctly");
    }


    /**
     * Test of main method, of class CardGameWar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
       // CardGameWar.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
