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
public class OReillyByAddress {
public static void main (String[] args) {
try {
InetAddress address = InetAddress.getByName("204.148.40.9");
System.out.println(address);
}
catch (UnknownHostException e) {
System.out.println("Could not find 204.148.40.9");
}}
}