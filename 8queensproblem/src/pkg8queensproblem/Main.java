/*

This code solve the 8 queen problem that consist of placing 8 queens on a 8 x 8 chess board and each queen is not able
to attack any of the other 7. 

 */
package pkg8queensproblem;

/**
 *
 * @author Alexander
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    void printSolution(int chessBoard[][]) // print the solution of the problem.
    {
    
        for(int i = 0; i < 8; i++) // for loop for print the row of the row of the board
        {
        
            for(int j = 0; j < 8; j++) // for loop for print the colum of the board 
            {
            
             System.out.print(" " + chessBoard[i][j] + " "); //print the board value of the actual possition 0 for empty or 1 for queen; 
             
            }
            
            System.out.print("\n"); // new line
        
        }
    
    }
    
    boolean canPlace(int chessBoard[][], int row, int col) // check if there is a avaible place for the queen. 
        {
        
            int i; // variable for row 
            int j; // varibale for colum
            
            for(i = 0; i < col; i++) // check row on left side 
                {
                
                    if(chessBoard[row][i] == 1) // if there is a queen on the left side row 
                    {
                        
                        return false; // return false and stop the recursion 
                    
                    }
                }
                    
            for(i = row, j = col; i >=0 && j >= 0; i--, j--) // check for no queen on the upper row 
                {
                        
                    if(chessBoard[i][j] == 1) 
                    {
                                
                        return false;
                                    
                    }
                }
                            
            for(i = row, j = col; j>0 && i < 8; i++, j--) // check for no queen on the lower row 
                {
                
                    if(chessBoard[i][j] == 1) // if position is equal to 1 there is a queen 
                    {
                    
                        return false;
                    
                    }
                
                }
                return true;
        }
    
    boolean Solve() //This function solve the problem utilizing the solve8Queen function  
        {
            
                    int chessBoard[][] = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}}; // create the chess board table 
        
                    if(solve8Queen(chessBoard, 0)== false) // if possition is 0 no solution 
                    {
                    
                        System.out.print("No solution"); 
                        return false;
                        
                    }     
                        
            printSolution(chessBoard); // call the function printSolution for print the solution
            return true;
        }
    
    boolean solve8Queen(int chessBoard[][], int col) // recursive solution for the problem of the 8 queens 
        {
            
            if(col >= 8) // if( pos is such that there is nothing left to solve){
            {
                
                return true;
            
            }
            
            for(int i = 0; i < 8; i++) // foreach possible choice {
            {
            
                if(canPlace(chessBoard, i, col)) // if(valid(choice)){
                {
                    
                    chessBoard[i][col] = 1; // mark board at pos with choice;
                    
                    if(solve8Queen(chessBoard, col+1) == true) // if(solve(board, pos + 1) == true){
                    {
                    
                        return true;
                        
                    }
                
                    chessBoard[i][col] = 0; // clear any choices entered at pos on board;
                    
                }
            
            }
            
            return false; // backtrack 
            
        }
    
    public static void main(String[] args) {
        
    
    Main Solve = new Main();
    Solve.Solve();
        // TODO code application logic here
    }
}

