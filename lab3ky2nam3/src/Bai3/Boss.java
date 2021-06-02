/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Van Anh
 */
public class Boss extends Employee {

    private float luong;

    /**
     *
     * @return
     */
    @Override
    public float getLuong() {
        return luong;
    }

    public float earnings() {
        return luong = 4500;
    }

    public void hienthi() {
        System.out.println(" lương" +luong);
    }

}
