/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander
 */
public class TicTacToeTest {
    
    public TicTacToeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createBoard method, of class TicTacToe.
     */
    @Test
    public void testCreateBoard() {
        System.out.println("createBoard");
        int[][] expResult = null;
        int[][] result = TicTacToe.createBoard();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of currentPlayer method, of class TicTacToe.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("currentPlayer");
        String Player = "x";
        String expResult = "x";
        String result = TicTacToe.currentPlayer(Player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePlayer method, of class TicTacToe.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("changePlayer");
        String Current = "y";
        String expResult = "x";
        String result = TicTacToe.changePlayer(Current);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeMove method, of class TicTacToe.
     */
    @Test
    public void testMakeMove() {
        System.out.println("makeMove");
        int row = 0;
        int col = 0;
        int user = 2;
        int[][] board = null;
        int[][] expResult = null;
        int[][] result = TicTacToe.makeMove(row, col, user, board);
        assertArrayEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spaceInUse method, of class TicTacToe.
     */
    @Test
    public void testSpaceInUse() {
        System.out.println("spaceInUse");
        int[][] Board = null;
        int expResult = 0;
        int result = TicTacToe.spaceInUse(Board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TicTacToe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TicTacToe.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
