/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timelab3;

/**
 *
 * @author Alexander
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TimeLab3 {

    /* Remove all duplicate items from the given LinkedList     *
     *
     * Example input:
     * [1,4,6,3,1,3,4,5]
     * will be changed to
     * [1,4,6,3,5]
     * although
     * [3,5,6,4,1] or any permutation is also valid!
     *
     * You may create and use any additional data structures
     * (in fact I recommend it for the best score)
     *
     * Scoring based on runtime complexity
     * O(n) - 50 points
     * O(n^2) - 40 points
     * O(n^3) or worse - 30 points
     *
     * Remember to use the for each
     * No, you CANNOT use head or tail or nodes in this solution.
     */
    public static <E> void removeDuplicates(LinkedList<E> list) {

            
        HashSet<E> set = new HashSet<>();
        list.clear();
        list.addAll(set);
        System.out.println(list);
	
	}

	
	
	
	

    /* Create a method that, given the root of a binary search tree,
     * finds the smallest item in the tree that is larger than the root.
     *
     * My solution wasn't recursive
     *
     * 25 points
     */
    public static <E>  E smallestLarger(TreeNode root){
    
        while(root != null)
        {
            
            System.out.println("null");
        
        } 
        
        Integer val = root.item.compareTo(root);
        Integer valLeft = root.item.compareTo(root.left);
        Integer valRight = root.item.compareTo(root.right);
        
        if(val < valLeft)
        {
        
           Integer valLeftL = valLeft;
           if(valLeft != root.item)
           val = valLeftL;
           
        }if(valRight < val)
        {
        
            Integer valRightR = valRight;
            if(valRight != root.item){
            val = valRightR;
            }
        }
        
        return (E) val; 
        
    }




    /* Write a method that determines if the given root of a tree or subtree
     * is a binary search tree
     *
     * You will need to use .compareTo() on the items.
     *
     * 25 points
     */
    public static <E> boolean isBST(TreeNode root) {
        
        if(root != null)
        {
        
            if(root.item.compareTo(root.left) <= 0)
            {
            
                return false;
            
            }if(root.item.compareTo(root.right) >= 0 )
            {
                
                return false;
                
            }
            
            return isBST(root.right);
        
        }
        
        return isBST(root.left) && isBST(root.right);
           
        }
        
        
    
    }







    // useful for writing your trees
    class TreeNode<T extends Comparable<T>> {
        T item;
        TreeNode left;
        TreeNode right;
    }


