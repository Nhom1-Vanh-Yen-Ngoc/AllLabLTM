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
public class AllAddressesOfMicrosoft {
public static void main (String[] args) {
try {
InetAddress[] addresses =
InetAddress.getAllByName("www.microsoft.com");
for (int i = 0; i < addresses.length; i++) {System.out.println(addresses[i]);
}
}
catch (UnknownHostException e) {
System.out.println("Could not find www.microsoft.com");
}
}
}
