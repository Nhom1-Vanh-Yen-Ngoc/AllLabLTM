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
public class AddressTests {
public static int getVersion(InetAddress ia) {
byte[] address = ia.getAddress( );
if (address.length == 4) return 4;
else if (address.length == 16) return 6;
else return -1;}
public static char getClass(InetAddress ia) {
byte[] address = ia.getAddress( );
if (address.length != 4) {
throw new IllegalArgumentException("No IPv6 addresses!");
}
int firstByte = address[0];
if ((firstByte & 0x80) == 0) return 'A';
else if ((firstByte & 0xC0) == 0x80) return 'B';
else if ((firstByte & 0xE0) == 0xC0) return 'C';
else if ((firstByte & 0xF0) == 0xE0) return 'D';
else if ((firstByte & 0xF8) == 0xF0) return 'E';
else return 'F';
}
}
