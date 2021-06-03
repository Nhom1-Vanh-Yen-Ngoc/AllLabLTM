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
import java.io.*;
import java.util.*;
import com.macfaq.io.SafeBufferedReader.*;
public class Weblog {
public static void main(String[] args) {
Date start = new Date( );
try {
FileInputStream fin = new FileInputStream(args[0]);
Reader in = new InputStreamReader(fin);
SafeBufferedReader bin = new SafeBufferedReader(in);
String entry = null;
while ((entry = bin.readLine( )) != null) {
// separate out the IP address
int index = entry.indexOf(' ', 0);String ip = entry.substring(0, index);
String theRest = entry.substring(index, entry.length( ));
// find the host name and print it out
try {
InetAddress address = InetAddress.getByName(ip);
System.out.println(address.getHostName( ) + theRest);
}
catch (UnknownHostException e) {
System.out.println(entry);
}
} // end while
}
catch (IOException e) {
System.out.println("Exception: " + e);
}
Date end = new Date( );
long elapsedTime = (end.getTime()-start.getTime( ))/1000;
System.out.println("Elapsed time: " + elapsedTime + " seconds");
} // end main
}