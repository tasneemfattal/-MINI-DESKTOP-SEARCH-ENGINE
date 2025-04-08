/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tasni
 */
public class Tasnim_Kadir_LinkedListNode {

    String word;
    Tasnim_Kadir_LinkedListNode next;
    int fileFrequency;

    public Tasnim_Kadir_LinkedListNode(String word) {
        this.word = word;
        next = null;
        this.fileFrequency =1;// Her yeni düğümün frekansını başlangıçta 1 olarak ayarla
    }

    public void incrementFileFrequency() {
        this.fileFrequency++;

    }
    /*String fileName;
    LinkedListNode next;
    int fileFrequency;

    public LinkedListNode(String fileName) {
        this.fileName = fileName;
        next = null;
        this.fileFrequency = 1; // Her yeni dosya adı için başlangıçta frekans 1
    }*/

}
