/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import Bai4.SinhVienPoly;

/**
 *
 * @author Van Anh
 */
public class sinhVienIT extends SinhVienPoly{

    private double diemJava;
    private double diemHTML;
    private double diemCSS;


    public sinhVienIT( String hoTen,double diemJava, double diemHTML, double diemCSS) {
        super(hoTen, "it");
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }
    
    public sinhVienIT() {
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }

    @Override
    public Double getDiem() {
        return ((2*this.getDiemJava())+this.getDiemHTML()+this.getDiemCSS())/4;
    }

    @Override
    public String toString() {
        return "sinhVienIT{" + "diemJava=" + getDiemJava() + ", diemHTML=" + getDiemHTML() + ", diemCSS=" + getDiemCSS() + ",hoTen = "+getHoTen()+'}';
    }

 
}
