/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.Date;

/**
 *
 * @author Van Anh
 */

public class Sinhvien implements Comparable<Sinhvien>{

    private String Masv;
    private String Tensv;
    private Date Namsinh;
    private String Diachi;
    private final String Lop;

    
    public Sinhvien(String Masv, String Tensv, Date Namsinh, String Diachi, String Lop) {
        this.Masv = Masv;
        this.Tensv = Tensv;
        this.Namsinh = Namsinh;
        this.Diachi = Diachi;
        this.Lop = Lop;
    }

    Sinhvien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public Date getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(Date Namsinh) {
        this.Namsinh = Namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    @Override
    public int compareTo(Sinhvien o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}