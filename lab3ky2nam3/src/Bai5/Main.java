/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;
import Bai4.SinhVienPoly;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class Main {

    private static ArrayList<SinhVienPoly> arr = new ArrayList<SinhVienPoly>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         int chon;
        do {            
           menu();
            System.out.println("mời chọn chức năng ");
            chon = Integer.parseInt(getSc().nextLine());
            switch(chon) {
                case 1 -> nhap();
                case 2 -> xuat();
                case 3 -> sxtheodiem();
                case 4 -> hocsinhgioi();
                case 5 -> {
                 }
            }
            
        } while (chon<=5);
    }

    public static void menu() {
        System.out.println("mời nhập lựa chọn");
        System.out.println("1. nhập danh sách sinh viên");
        System.out.println("2. xuất danh sách nsinh viên");
        System.out.println("3. xuất danh ssachs học sinh giỏi");
        System.out.println("4. sắp xép sinh viên theo điểm");
        System.out.println("5. thoát");
    }

    public static void nhap() {
        System.out.println("mời nhập số lượng sinh viên ");
        int soluong = getSc().nextInt();
        for (int i = 0; i < soluong; i++) {
            System.out.println("mời chọn 1 hoặc 2 để thêm "
                    + "1. thêm sinh viên it"
                    + "2. thêm sinh viên biz");
            int chon = getSc().nextInt();
            getSc().nextLine();
            switch (chon) {
                case 1 ->                     {
                        String hoTen;
                        double diemJava, diemHTML, diemCSS;
                        System.out.println("mời nhập họ tên sinh viên");
                        hoTen = getSc().nextLine();
                        System.out.println("mời nhập java");
                        diemJava = getSc().nextDouble();
                        System.out.println("mời nhập html");
                        diemHTML = getSc().nextDouble();
                        System.out.println("mời nhập diểm css");
                        diemCSS = getSc().nextDouble();
                        SinhVienPoly sv = new sinhVienIT(hoTen, diemJava, diemHTML, diemCSS);
                        getArr().add(sv);
                    }
                case 2 ->                     {
                        String hoTen;
                        double diemMarketing, diemSales;
                        System.out.println("mời nhập họ tên sinh viên");
                        hoTen = getSc().nextLine();
                        System.out.println("mời nhập diemMarketing");
                        diemMarketing = getSc().nextDouble();
                        System.out.println("mời nhập diemSales");
                        diemSales = getSc().nextDouble();
                        SinhVienPoly biz = new SinhVienBiz(hoTen, diemMarketing, diemSales);
                        getArr().add(biz);
                    }
                default -> System.out.println("lựa chọn không hợp lệ");
            }
        }
    }

    public static void xuat() {
        for(SinhVienPoly sv : getArr()){
            System.out.println(sv.toString());
        }
    }

    public static void hocsinhgioi() {
        for(SinhVienPoly sv : getArr()){
            if (sv.getHocLuc().equalsIgnoreCase("giỏi")) {
                System.out.println(sv.toString());
            }else{
                System.out.println("không có hs giỏi");
            }
        }
    }

    public static void sxtheodiem() {
        Comparator<SinhVienPoly> com = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return o2.getDiem().compareTo(o1.getDiem());
            }
    
        };
        Collections.sort(getArr(),com);
        xuat();
    }

    /**
     * @return the arr
     */
    public static ArrayList<SinhVienPoly> getArr() {
        return arr;
    }

    /**
     * @param aArr the arr to set
     */
    public static void setArr(ArrayList<SinhVienPoly> aArr) {
        arr = aArr;
    }

    /**
     * @return the sc
     */
    public static Scanner getSc() {
        return sc;
    }

    /**
     * @param aSc the sc to set
     */
    public static void setSc(Scanner aSc) {
        sc = aSc;
    }
}
