
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author tasni
 */
public class Tasnim_Kadir_FirstFrame extends javax.swing.JFrame {

    Tasnim_Kadir_BinarySearchTree bst = new Tasnim_Kadir_BinarySearchTree();
    Tasnim_Kadir_LinkedList linkedList = new Tasnim_Kadir_LinkedList();
    ArrayList<String> commonWords;

    /**
     * Creates new form Tasnim_Kadir_FirstFrame
     */
    public Tasnim_Kadir_FirstFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_SelectİgnoreFile = new javax.swing.JButton();
        btn_ChooserFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_SelectİgnoreFile.setBackground(new java.awt.Color(153, 204, 255));
        btn_SelectİgnoreFile.setForeground(new java.awt.Color(0, 102, 153));
        btn_SelectİgnoreFile.setText("Select ignore file");
        btn_SelectİgnoreFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectİgnoreFileActionPerformed(evt);
            }
        });
        jPanel1.add(btn_SelectİgnoreFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 140, 90));

        btn_ChooserFile.setBackground(new java.awt.Color(153, 204, 255));
        btn_ChooserFile.setForeground(new java.awt.Color(0, 102, 153));
        btn_ChooserFile.setText("Chooser file");
        btn_ChooserFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChooserFileActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ChooserFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 140, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 File[] selectedFiles;
    private void btn_SelectİgnoreFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectİgnoreFileActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
        // Dosya seçici diyaloğunu başlat
        JFileChooser fileChooser = new JFileChooser();

        // Kullanıcı dosyaları seçtiğinde
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            // Seçilen dosyaları al
            File selectedFile = fileChooser.getSelectedFile();
            commonWords = loadCommonWords(selectedFile.getAbsolutePath());

            // Dosya seçimi tamamlandı mesajını göster
            JOptionPane.showMessageDialog(this, "Ignore list file selected successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);

        } else {
            // Kullanıcı bir dosya seçmediği durumda bir uyarı göster
            JOptionPane.showMessageDialog(this, "Please select an ignore list file!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_SelectİgnoreFileActionPerformed

    private void btn_ChooserFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChooserFileActionPerformed
        // TODO add your handling code here:

        // Dosya seçici diyaloğunu başlat
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true); // Birden fazla dosya seçilmesine izin vermek için
        bst = new Tasnim_Kadir_BinarySearchTree();
        // Kullanıcı dosyaları seçtiğinde
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            // Seçilen dosyaları al
            selectedFiles = fileChooser.getSelectedFiles();

            // Her seçilen dosya için
            for (File file : selectedFiles) {
                // Dosyayı seçilen dosyalar listesine ekle
                processDocument(file.getAbsolutePath(), bst, linkedList, commonWords);
            }

            // Dosya seçimi tamamlandı mesajını göster
            JOptionPane.showMessageDialog(this, " Files selected successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);

        } else {
            // Kullanıcı bir dosya seçmediği durumda bir uyarı göster
            JOptionPane.showMessageDialog(this, "Please select an file!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        // Yeni bir JFrame oluşturup görünür yapın
        Tasnim_Kadir_DesktopFrame frame2 = new Tasnim_Kadir_DesktopFrame(bst);
        frame2.setVisible(true);

        // Şuanki JFrame'i gizle
        this.setVisible(false);

    }//GEN-LAST:event_btn_ChooserFileActionPerformed

   /* private String processDocumentAndGetContent(String documentPath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(documentPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Her satırı oku ve içeriğe ekle
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Oluşturulan içeriği döndür
        return content.toString();
    }*/

    private static void processDocument(String documentPath, Tasnim_Kadir_BinarySearchTree bst, Tasnim_Kadir_LinkedList linkedList, ArrayList<String> commonWords) {

        try (BufferedReader br = new BufferedReader(new FileReader(documentPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println("Okunan satır: " + line); // Okunan her satırı göster
                line = line.replaceAll("\\<.*?\\>", ""); // HTML etiketlerini kaldır
                //System.out.println("İşlenmiş satır: " + line); // İşlenmiş satırı göster
                String word = "";
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isLetter(c)) {
                        word += Character.toLowerCase(c);
                    } else {
                        if (!word.isEmpty() && !commonWords.contains(word) && !isNumberBetweenOneAndTwenty(word)) {
                            bst.insert(word, documentPath);
                            //System.out.println("Ağaca eklendi: " + word); // Ağaca eklenen kelimeyi göster
                        }
                        word = "";
                    }
                }
                if (!word.isEmpty() && !commonWords.contains(word) && !isNumberBetweenOneAndTwenty(word)) {
                    bst.insert(word, documentPath);
                    // System.out.println("Ağaca eklendi: " + word); // Ağaca eklenen kelimeyi göster
                }
            }
            if (!linkedList.contains(documentPath)) {
                linkedList.insert(documentPath);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static ArrayList<String> loadCommonWords(String filename) {
        ArrayList<String> commonWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    commonWords.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return commonWords;

    }

    private static boolean isNumberBetweenOneAndTwenty(String word) {
        // Check if the word is a number between 1 and 20
        try {
            int number = Integer.parseInt(word);
            return number >= 1 && number <= 20;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tasnim_Kadir_FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tasnim_Kadir_FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tasnim_Kadir_FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tasnim_Kadir_FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tasnim_Kadir_FirstFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChooserFile;
    private javax.swing.JButton btn_SelectİgnoreFile;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
