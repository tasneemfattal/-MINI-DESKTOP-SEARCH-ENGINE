/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tasni
 */
public class Tasnim_Kadir_TreeNode {

    String word;
    int frequency;
    Tasnim_Kadir_TreeNode left;
    Tasnim_Kadir_TreeNode right;
    Tasnim_Kadir_LinkedList file;
    

    public Tasnim_Kadir_TreeNode(String word,String fileName) {
        this.word = word;
        this.frequency = 1;
        left = right = null;
        this.file= new Tasnim_Kadir_LinkedList();
        this.file.insert(fileName);
    }
    
    
 
   
}
