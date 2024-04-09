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
public class CardTest {
    
    public CardTest() {
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
     * Test of getRank method, of class Card.
     */
   
    @Test
    public void testGetRank_Good() {
        System.out.println("testGetRank_Good");
        Card instance = new Card(5) {
            @Override
            public String toString() {
                return "Rank: " + getRank();
            }
        };
        int expResult = 5;
        int result = instance.getRank();
        assertEquals(expResult, result);
    }
    
    @Test
public void testGetRank_Bad() {
    System.out.println("testGetRank_Bad");
    assertThrows(IllegalArgumentException.class, () -> new CardImpl(-1)); // Bad scenario: trying to create a CardImpl with an invalid rank
    assertThrows(IllegalArgumentException.class, () -> new CardImpl(14)); // Bad scenario: trying to create a CardImpl with an invalid rank
}

    @Test
    public void testGetRank_Boundary() {
        System.out.println("testGetRank_Boundary");
        Card instance1 = new CardImpl(0); // Boundary scenario: minimum valid rank
        Card instance2 = new CardImpl(13); // Boundary scenario: maximum valid rank
        int expResult1 = 0;
        int expResult2 = 13;
        int result1 = instance1.getRank();
        int result2 = instance2.getRank();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of toString method, of class Card.
     */
@Test
public void testToString() {
    System.out.println("testToString");
    Card instance = new CardImpl(5); // Good scenario: valid rank
    String expResult = "Rank: 5"; // Expected string representation
    String result = instance.toString();
    assertEquals(expResult, result);
}


  public class CardImpl extends Card {
    public CardImpl(int rank) {
        super(rank);
        if (rank < 0 || rank > 13) {
            throw new IllegalArgumentException("Rank must be between 0 and 13");
        }
    }

    @Override
    public String toString() {
        return "Rank: " + getRank();
    }
}
    
}
