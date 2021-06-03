/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap6;

/**
 *
 * @author ADMIN
 */
import java.net.*;
public class ReverseTest {
public static void main (String[] args) {
try {
InetAddress ia = InetAddress.getByName("152.2.22.3");
System.out.println(ia.getHostName( ));
}
catch (Exception e) {
System.err.println(e);
}
}
}