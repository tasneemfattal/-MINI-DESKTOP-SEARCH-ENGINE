
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tasni
 */
public class Tasnim_Kadir_LinkedList {

    Tasnim_Kadir_LinkedListNode head;
    Tasnim_Kadir_LinkedListNode tail;

    public Tasnim_Kadir_LinkedList() {
        head = tail = null;
    }

     public void insert(String word) {
        Tasnim_Kadir_LinkedListNode newNode = new Tasnim_Kadir_LinkedListNode(word);
        if (head == null) {
            head = tail = newNode;
            //newNode.fileFrequency();
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        newNode.fileFrequency++;// Her yeni düğüm eklendiğinde fileFrequency değerini artır

    }
  
    public boolean contains(String word) {
        // Bağlı listedeki düğümleri gezme işlemi için bir 'current' değişkeni oluşturulur ve bu değişken başlangıçta listenin başı olan 'head' düğümüne atanır.
        Tasnim_Kadir_LinkedListNode current = head;

        // 'current' değişkeni 'null' olmadığı sürece döngü devam eder.
        while (current != null) {
            // Her bir düğümdeki kelime, parametre olarak verilen kelime ile karşılaştırılır.
            if (current.word.equals(word)) {
                // Eğer eşitlerse, yani listedeki kelime parametre olarak verilen kelimeye eşitse, metot 'true' döner ve işlem sonlanır.
                return true;
            }
            // 'current' değişkeni bir sonraki düğüme ('next' referansıyla) ilerletilir. Bu şekilde bağlı liste boyunca dolaşılır.
            current = current.next;
        }
        // Eğer döngü içinde eşleşme bulunamazsa, yani listenin sonuna kadar dolaşıldığında eşleşme bulunamazsa, metot 'false' döner.
        return false;

    }
}
