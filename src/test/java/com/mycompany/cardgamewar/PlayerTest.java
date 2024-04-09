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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getName method, of class Player.
     
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
    public void testGetNameGood() {
        System.out.println("getName good");
        Player instance = new Player("Alice");
        boolean expResult = true;
         boolean result = instance.getName().equals("Alice"); 
        assertEquals(expResult, result, "Name should match");
    }
    @Test
    public void testGetNameBad() {
        System.out.println("getName bad");
        Player instance = new Player("Alice");
        boolean expResult = false; // Change expected result to false
    boolean result = instance.getName().equals("123"); 
    assertEquals(expResult, result, "Name should not match");
    }

    
    @Test
    public void testGetNameBoundary() {
    System.out.println("getName boundary");
    Player instance = new Player("Alice");
    boolean expResult = false; // Change expected result to false
    boolean result = instance.getName().equals(" "); // Check if name equals " "
    assertEquals(expResult, result, "Name should not match");
}
    

     
    

    /**
     * Test of getScore method, of class Player.
     */
   @Test
public void testGetScoreGood() {
    System.out.println("getScore good");
    Player instance = new Player("Alice");
    int expResult = 0; // Assuming initial score is 0
    int result = instance.getScore();
    assertEquals(expResult, result, "Initial score should be 0");
}

@Test
public void testGetScoreBad() {
    System.out.println("getScore bad");
    Player instance = new Player("Alice");
    int expResult = -1; // Invalid score value
    int result = instance.getScore();
    assertNotEquals(expResult, result, "Score should not be negative");
}

@Test
public void testGetScoreBoundary() {
    System.out.println("getScore boundary");
    Player instance = new Player("Alice");

    // Simulate the player reaching the maximum score
    for (int i = instance.getScore(); i < Integer.MAX_VALUE; i++) {
        instance.incrementScore();
    }

    int expResult = Integer.MAX_VALUE; // Maximum score value
    int result = instance.getScore();
    assertEquals(expResult, result, "Score should be at maximum boundary");
}

    /**
     * Test of incrementScore method, of class Player.
     */
 @Test
    public void testIncrementScoreGood() {
        System.out.println("incrementScore good");
        Player instance = new Player("Alice");
        instance.incrementScore();
        assertEquals(1, instance.getScore(), "Score should be incremented by 1");
    }

@Test
public void testIncrementScoreBoundary() {
    System.out.println("incrementScore boundary");
    Player instance = new Player("Bob");

    // Increment the score until it reaches Integer.MAX_VALUE - 1
    while (instance.getScore() < Integer.MAX_VALUE - 1) {
        instance.incrementScore();
    }

    // Increment one more time to reach the maximum value
    instance.incrementScore();

    assertEquals(Integer.MAX_VALUE, instance.getScore(), "Score should be at maximum boundary");
}

@Test
public void testIncrementScoreBad() {
    System.out.println("incrementScore bad");
    Player instance = new Player("Charlie");

    // Set score to just before overflow
    for (int i = instance.getScore(); i < Integer.MAX_VALUE - 1; i++) {
        instance.incrementScore();
    }

    assertEquals(Integer.MAX_VALUE - 1, instance.getScore(), "Score should be just before overflow");

    // Now try to increment beyond the limit, it should not throw an exception but remain at the maximum value
    instance.incrementScore();
    assertEquals(Integer.MAX_VALUE, instance.getScore(), "Score should remain at maximum value");
}
    /**
     * Test of resetScore method, of class Player.
     */
 @Test
public void testResetScoreGood() {
    System.out.println("resetScore good");
    Player instance = new Player("David");
    instance.incrementScore(); // Increment the score first
    instance.resetScore(); // Reset the score to zero
    assertEquals(0, instance.getScore(), "Score should be reset to zero");
}

@Test
public void testResetScoreBad() {
    System.out.println("resetScore bad");
    Player instance = null;
    assertThrows(NullPointerException.class, () -> instance.resetScore());
    // Attempting to reset the score on a null instance should throw a NullPointerException
}

@Test
public void testResetScoreBoundary() {
    System.out.println("resetScore boundary");
    Player instance = new Player("Emma");
    // Set the score to a specific value by incrementing multiple times
    for (int i = 0; i < 100; i++) {
        instance.incrementScore();
    }
    instance.resetScore(); // Reset the score after reaching a boundary
    assertEquals(0, instance.getScore(), "Score should be reset to zero at boundary");
}
    
}
