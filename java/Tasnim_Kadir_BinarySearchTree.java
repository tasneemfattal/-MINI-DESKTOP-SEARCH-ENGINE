/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tasni
 */
public class Tasnim_Kadir_BinarySearchTree {

    Tasnim_Kadir_TreeNode root;

    public Tasnim_Kadir_BinarySearchTree() {
        root = null;
    }

    public void insert(String word, String fileName) {
        root = insertRec(root, word, fileName);
    }

    public Tasnim_Kadir_TreeNode insertRec(Tasnim_Kadir_TreeNode root, String word, String fileName) {
        if (root == null) {
            root = new Tasnim_Kadir_TreeNode(word, fileName);
            return root;
        }

        if (word.compareTo(root.word) < 0) {
            root.left = insertRec(root.left, word, fileName);
        } else if (word.compareTo(root.word) > 0) {
            root.right = insertRec(root.right, word, fileName);
        } else {
            root.frequency++;

            // Kelime zaten ağaçta bulunuyor, dosya adını ekleyin
            if (!root.file.contains(fileName)) {
                root.file.insert(fileName);

            }

        }

        return root;
    }

    public Tasnim_Kadir_TreeNode search(String word) {
        Tasnim_Kadir_TreeNode current = root;

        // Ağaç dolaşılırken
        while (current != null) {
            // Aranan kelime, mevcut düğümdeki kelimeyle eşleşirse, düğümü döndür
            if (word.equals(current.word)) {
                return current;
            } // Aranan kelime, mevcut düğümdeki kelimeyle büyükse, sağ alt ağaca git
            else if (word.compareTo(current.word) > 0) {
                current = current.right;
            } // Aranan kelime, mevcut düğümdeki kelimeyle küçükse, sol alt ağaca git
            else {
                current = current.left;
            }
        }

        // Aranan kelime ağaçta bulunamazsa null döndür
        return null;
    }

}
