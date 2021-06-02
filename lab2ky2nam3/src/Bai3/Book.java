/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;
    private Scanner scan;

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.scan = new Scanner(System.in);
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }
    
    public Book (){this.scan = new Scanner(System.in);
}

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", producer=" + producer + ", yearPublishing=" + yearPublishing + ", price=" + price + '}';
    }
    
     public void input() {
        System.out.print("\n Ten sach:");
            bookName=getScan().nextLine();
        System.out.print("\n Tac gia:");
            bookAuthor=getScan().nextLine();
         System.out.print("\n Nha xuat ban:");
            producer=getScan().nextLine();
        System.out.print("\n Nam phat hanh:");
            yearPublishing=getScan().nextInt();
        System.out.println("\n Gia ban:");
            price=getScan().nextFloat();
        
    }
    
    public void display()
 {
    System.out.print("\n Ten sach:"+bookName);
    System.out.print("\n Tac gia:"+bookAuthor);
    System.out.print("\n Nha xuat ban:"+producer);
    System.out.print("\n Nam phat hanh:"+ yearPublishing);
    System.out.print("\n Gia ban 1 san pham:"+price);
 }

    /**
     * @return the scan
     */
    public Scanner getScan() {
        return scan;
    }

    /**
     * @param scan the scan to set
     */
    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    
       
}