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
public class OReillyByName {
public static void main (String[] args) {
try {
InetAddress address = InetAddress.getByName("www.oreilly.com");
System.out.println(address);
}
catch (UnknownHostException e) {
System.out.println("Could not find www.oreilly.com");
}
}
}