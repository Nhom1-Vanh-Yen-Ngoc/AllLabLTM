/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class Product {

    private String tenHangHoa;
    private String nhaSanXuat;
    private float giaBan;
    private Scanner scan;

    public Product() {this.scan = new Scanner(System.in);
}
    
    public Product(String tenHangHoa, String nhaSanXuat, float giaBan) {
        this.scan = new Scanner(System.in);
        this.tenHangHoa = tenHangHoa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }


    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void nhap() {
        System.out.print("\n Ten hang hoa:");
        tenHangHoa=getScan().nextLine();
         System.out.print("\n Nha san xuat:");
        nhaSanXuat=getScan().nextLine();
         System.out.print("\n Gia ban:");
        giaBan=getScan().nextFloat();
    }
    
    public void hienthi()
 {
    System.out.print("\n Ten hang hoa:"+tenHangHoa);
    System.out.print("\n Nha san xuat:"+nhaSanXuat);
    System.out.print("\n Gia ban:"+giaBan);
 }

    
    @Override
    public String toString() {
        return "Product{" + "tenHangHoa=" + tenHangHoa + ", nhaSanXuat=" + nhaSanXuat + ", giaBan=" + giaBan + '}';
    }

    public void sort(Product[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].giaBan > b[j].giaBan) {
                    Product tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
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