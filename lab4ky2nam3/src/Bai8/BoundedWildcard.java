/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Van Anh
 */
public class BoundedWildcard {
    public static double getAverage(List<? extends Number> numberList)
{
double total = 0.0;
total = numberList.stream().map(number -> number.doubleValue()).reduce(total, (accumulator, _item) -> accumulator + _item);
return total / numberList.size();
}
public static void main(String[] args)
{
List<Integer> IntegerList = new ArrayList<>();
IntegerList.add(3);
IntegerList.add(30);
IntegerList.add(300);
System.out.println(getAverage(IntegerList)); // KQ?
List<Double> doubleList = new ArrayList<>();
doubleList.add(3.0);
doubleList.add(33.0);
System.out.println(getAverage(doubleList));
}
}
