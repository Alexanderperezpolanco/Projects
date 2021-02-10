/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.util.Scanner;
/**
 *
 * @author Alexander
 */
public class TicTacToe {

    public static int[][] createBoard()
    {
      int board[][] = new int[][]{
            {0, 0, 0},
             {0, 0, 0},
             {0, 0, 0},
        };
     
        return board;
    }
    public static String currentPlayer(String Player)
    {
        int x = 0;
        int o = 0;
        if(Player == "x")
        {
        
            x++;
            System.out.println("current player X");
            
        }
        if(Player == "o")
        {
        
            o++;
            System.out.println("current player O");
        }
        
        if(x < o)
        {
            String X = "x";
            return X;
        
        }else 
        {
        
            String O = "o";
            return O;
        
        }
        
    
    
    }
    
    public static String changePlayer(String Current)
    {
        
        if(Current == "x")
        {
        
            Current = "o";
            System.out.println("current player: " + Current);
        
        }if(Current == "Y")
        {
            Current = "x";
            System.out.println("current player: " + Current);
         }
        
        return Current;
    }
    public static int[][] makeMove(int row, int col, int user,int board[][])
    {
    
        if(user == 1)
        {
        
            board[row][col] = 1;
        
        } if( user == 2)
        {
        
            board[row][col] = 2;
        
        }
        
        return board;
    
    }
    
    public static int spaceInUse(int[][] Board)
    {
        int count = 0;
        for(int i = 0; i < 3; i++)
        {
        
            for(int j = 0; i < 3; j++)
            {
        
             if(Board[i][j] != 0 )
                {
                
                    count++;
                
                }
        
            }
        
        }
    
        return count;
        
    }
    
    public static void main(String[] args) {
        /*int player;
        int move = 0;
        
        char [][]board = createBoard();
        
        Scanner in = new Scanner(System.in);
        System.out.println("select a player 1 for x or 2 for o: ");
        player = in.nextInt();
        
        System.out.println("Select where you want to move");
        move = in.nextInt();
        
        if(player == 2)
        {
            
         String numbers[] = makeMove(move).split(",");
         int row = Integer.parseInt(numbers[0]);
         int col = Integer.parseInt(numbers[1]);
         board[row][col] = 'O';
         
        }if(player == 1)
        {
        
         String numbers[] = makeMove(move).split(",");
         int row = Integer.parseInt(numbers[0]);
         int col = Integer.parseInt(numbers[1]);
         board[row][col] = 'X';
         
            
        }
        
        /*----------
        
        int board[][] = createBoard();
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0;j < 3; j++)
                {
                 
                    System.out.print(" " + board[i][j] + " " );
                
                }
        
            System.out.println();
        }
        
        
        
        String player = "x"; 
                
        currentPlayer(player);
        
        changePlayer(player);
        
        
        makeMove(0, 0, 2, board);
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0;j < 3; j++)
                {
                 
                    System.out.print(" " + board[i][j] + " " );
                
                }
        
            System.out.println();
        }
        
        
        spaceInUse(board);
        
        System.out.println("Spaces in use: " + spaceInUse(board));
----------*/
  
    }
    
}
