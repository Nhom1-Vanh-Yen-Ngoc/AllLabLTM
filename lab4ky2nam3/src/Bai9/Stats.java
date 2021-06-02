/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

/**
 *
 * @author Van Anh
 */
class Stats<T extends Number> {
    private T[] nums;
    Stats(T[] o)
    {
        nums=o;
    }
    double average()
    {
        double sum=0.0;
        for (T num : getNums()) {
            sum += num.doubleValue();
        }
        return sum/getNums().length;
    }

    /**
     * @return the nums
     */
    public T[] getNums() {
        return nums;
    }

    /**
     * @param nums the nums to set
     */
    public void setNums(T[] nums) {
        this.nums = nums;
    }
}
