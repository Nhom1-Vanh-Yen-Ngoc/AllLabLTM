/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

/**
 *
 * @author Van Anh
 * @param <T>
 */
public class Gen<T> {
    private T ob;
    Gen(T o)
    {
        ob = o;
    }
    T getObject()
    {
        System.out.println("Gen's getObject(): " );
        return getOb();
    }

    /**
     * @return the ob
     */
    public T getOb() {
        return ob;
    }

    /**
     * @param ob the ob to set
     */
    public void setOb(T ob) {
        this.ob = ob;
    }
}
