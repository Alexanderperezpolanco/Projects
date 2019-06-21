/*
 
Project that utilize recursion for win the game tower of Hanoi

*/
package towerofhanoi;

import java.util.Stack;

/**
 *
 * @author Alexander
 */
public class TowerOfHanoi {

    
    
    
    public static void main(String[] args) {
        
        String a = "a"; // declare string a
        String b = "b"; // declare string b
        String c = "c"; // declare string c
        int n = 3; // declare integer n 
        
        play(n, a, c , b); // call method play
        
    }
    
    public static void play(int n, String source, String target, String aux)
        {
           
            if(n == 0) // if n is equal to 0 
                {
                
                return;  
                
                }
            
            if(n > 0) // if n is bigger than 0  
                {
                
                    play(n - 1,source, aux, target); 
                    System.out.print("Move: " + n + " from: " + source +  " to: " + target + "\n");
                    play(n - 1, aux, target, source);
                
                }
            
            
        
        } 
    
    
    
}
