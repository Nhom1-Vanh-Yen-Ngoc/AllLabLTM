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

public class PieceWorker extends Employee {

    private float soluongsanpham;
    private float luong;

    @Override
    public float earnings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong san pham");
        setSoluongsanpham(Float.parseFloat(sc.nextLine()));
        return luong = (float) ((getSoluongsanpham() * 0.5)/5);
    }

    @Override
    public void hienthi() {
        System.out.println("lương là "+getLuong());
    }

    /**
     * @return the soluongsanpham
     */
    public float getSoluongsanpham() {
        return soluongsanpham;
    }

    /**
     * @param soluongsanpham the soluongsanpham to set
     */
    public void setSoluongsanpham(float soluongsanpham) {
        this.soluongsanpham = soluongsanpham;
    }

    /**
     * @return the luong
     */
    public float getLuong() {
        return luong;
    }

    /**
     * @param luong the luong to set
     */
    public void setLuong(float luong) {
        this.luong = luong;
    }

}
