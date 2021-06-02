/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Van Anh
 */
public abstract class SinhVienPoly {
    private String hoTen;
    private String Nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String Nganh) {
        this.hoTen = hoTen;
        this.Nganh = Nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    
    
    public abstract Double getDiem();
    public String getHocLuc(){
        String hocLuc="";
        if (getDiem()<5) {
            hocLuc = "yếu";
        }else if (getDiem()<=6.9) {
            hocLuc = "trung bình";
        }else if (getDiem()<8.4) {
            hocLuc = "khá";
        }else
        {
            hocLuc = "giỏi";
        }
        return  hocLuc;
    }
    public void xuat(){
        System.out.println("Họ tên "+getHoTen());
        System.out.println("Ngành học "+getNganh());
        System.out.println("Diểm "+getDiem());
        System.out.println("Học lực "+getHocLuc());
    }
}
