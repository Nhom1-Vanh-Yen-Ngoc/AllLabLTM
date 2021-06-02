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
public class SinhVienBiz extends SinhVienPoly{
    private double diemMarketing;
    private double diemSales;
    
    public SinhVienBiz(String hoTen,double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public Double getDiem() {
        return  ((2*this.getDiemMarketing())+this.getDiemSales())/3;
    }

    @Override
    public String toString() {
        return "SinhVienBiz{" + "diemMarketing=" + getDiemMarketing() + ", diemSales=" + getDiemSales() + ", Hoten ="+getHoTen()+ " , Ngành ="+getNganh()+'}';
    }

    /**
     * @return the diemMarketing
     */
    public double getDiemMarketing() {
        return diemMarketing;
    }

    /**
     * @param diemMarketing the diemMarketing to set
     */
    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    /**
     * @return the diemSales
     */
    public double getDiemSales() {
        return diemSales;
    }

    /**
     * @param diemSales the diemSales to set
     */
    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
}
