/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;
import java.util.Collections;

/*
 *
 * @author Van Anh
 */
public class DanhSachSinhvien {

    private final ArrayList<Sinhvien> dsSv = new ArrayList<Sinhvien>();
    
    public void sort() {
        Collections.sort(dsSv);
    }
    
    public boolean ktTrungma(String masv) {
        return dsSv.stream().anyMatch(sv -> (sv.getMasv().equalsIgnoreCase(masv)));
    }

    public boolean addSinhvien(Sinhvien sv) {
        if (ktTrungma(sv.getMasv())) {
            return false;
        }
        return dsSv.add(sv);
    }

    public Sinhvien findSinhvien1(String masv) {
        for (Sinhvien sv : dsSv) {
            if (sv.getMasv().equalsIgnoreCase(masv)) {
                return sv;
            }
        }
        return null;
    }

    public int findSinhvien2(String masv) {
        for (int i = 0; i < dsSv.size(); i++) {
            if (dsSv.get(i).getMasv().equalsIgnoreCase(masv)) {
                return i;
            }
        }
        return -1;
    }

    public Sinhvien updateSinhvien(int index, Sinhvien sv) {
        return dsSv.set(index, sv);
    }

    public void removeSinhvien(String masv) {
        Sinhvien sv = findSinhvien1(masv);
        dsSv.remove(sv);
    }

    @Override
    public String toString() {
        return dsSv.toString();
    }
}
