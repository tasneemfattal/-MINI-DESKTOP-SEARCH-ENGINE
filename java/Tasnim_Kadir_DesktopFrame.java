
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author tasni
 */
public class Tasnim_Kadir_DesktopFrame extends javax.swing.JFrame {

    DefaultListModel list_file_model;
    Tasnim_Kadir_BinarySearchTree bst;

    /**
     * Creates new form Desktop
     */
    public Tasnim_Kadir_DesktopFrame(Tasnim_Kadir_BinarySearchTree passBst) {
        initComponents();
        list_file_model = new DefaultListModel<>();
        list_file.setModel(list_file_model);
        this.bst = passBst;

    }

    public void inOrder() {
        inOrderRec(bst.root);
    }

    private void inOrderRec(Tasnim_Kadir_TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            list_file_model.addElement(root.word + ": " + root.frequency);
            inOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(bst.root);
    }

    private void postOrderRec(Tasnim_Kadir_TreeNode root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);

            list_file_model.addElement(root.word + ": " + root.frequency);
        }
    }

    public void preOrder() {
        preOrderRec(bst.root);
    }

    private void preOrderRec(Tasnim_Kadir_TreeNode root) {
        if (root != null) {
            list_file_model.addElement(root.word + ": " + root.frequency);
            preOrderRec(root.left);
            preOrderRec(root.right);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt_word = new javax.swing.JTextField();
        btn_searchWord = new javax.swing.JButton();
        radiobtn_preorder = new javax.swing.JRadioButton();
        radiobtn_postorder = new javax.swing.JRadioButton();
        radiobtn_ınorder = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_file = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_wordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_word, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 470, 30));

        btn_searchWord.setBackground(new java.awt.Color(153, 204, 255));
        btn_searchWord.setForeground(new java.awt.Color(0, 102, 153));
        btn_searchWord.setText("Search word");
        btn_searchWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchWordActionPerformed(evt);
            }
        });
        jPanel1.add(btn_searchWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 110, 30));

        buttonGroup1.add(radiobtn_preorder);
        radiobtn_preorder.setForeground(new java.awt.Color(255, 255, 255));
        radiobtn_preorder.setText("Pre_order\n");
        radiobtn_preorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_preorderActionPerformed(evt);
            }
        });
        jPanel1.add(radiobtn_preorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 110, 40));

        buttonGroup1.add(radiobtn_postorder);
        radiobtn_postorder.setForeground(new java.awt.Color(255, 255, 255));
        radiobtn_postorder.setText("Post_order\n");
        radiobtn_postorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_postorderActionPerformed(evt);
            }
        });
        jPanel1.add(radiobtn_postorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 110, 40));

        buttonGroup1.add(radiobtn_ınorder);
        radiobtn_ınorder.setForeground(new java.awt.Color(255, 255, 255));
        radiobtn_ınorder.setText("IN_Order");
        radiobtn_ınorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_ınorderActionPerformed(evt);
            }
        });
        jPanel1.add(radiobtn_ınorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 110, 50));

        jScrollPane4.setViewportView(list_file);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 470, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_wordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_wordActionPerformed

    private void radiobtn_preorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_preorderActionPerformed
        // TODO add your handling code here:
        list_file_model.clear();
        preOrder();


    }//GEN-LAST:event_radiobtn_preorderActionPerformed

    private void radiobtn_postorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_postorderActionPerformed
        // TODO add your handling code here:
        list_file_model.clear();
        postOrder();
    }//GEN-LAST:event_radiobtn_postorderActionPerformed

    private void radiobtn_ınorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_ınorderActionPerformed
        // TODO add your handling code here:
        list_file_model.clear();
        inOrder();


    }//GEN-LAST:event_radiobtn_ınorderActionPerformed


    private void btn_searchWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchWordActionPerformed
        // TODO add your handling code here:
        list_file_model.clear();
        // Get the word to search for from the text field
        String searchWord = txt_word.getText().toLowerCase(); // Make the search case-insensitive

        // Search for the word in the binary search tree
        Tasnim_Kadir_TreeNode foundNode = bst.search(searchWord);

        // If the word is found
        if (foundNode != null) {
            // Get the linked list of files associated with the word
            Tasnim_Kadir_LinkedList fileLinkedList = foundNode.file;
            Tasnim_Kadir_LinkedListNode currentNode = fileLinkedList.head;

            // Iterate over all files associated with the word
            while (currentNode != null) {
                // Display the file name and the frequency of the word in that file
                list_file_model.addElement(currentNode.word + ": " + currentNode.fileFrequency);
                currentNode = currentNode.next;
            }
        } else {
            // If the word is not found, display a message
            list_file_model.addElement("Word not found.");
        }

    }//GEN-LAST:event_btn_searchWordActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_searchWord;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> list_file;
    private javax.swing.JRadioButton radiobtn_postorder;
    private javax.swing.JRadioButton radiobtn_preorder;
    private javax.swing.JRadioButton radiobtn_ınorder;
    private javax.swing.JTextField txt_word;
    // End of variables declaration//GEN-END:variables
}
