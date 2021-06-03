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
public class LookupThread extends Thread {
private List entries;
PooledWeblog log; // used for callbacks
public LookupThread(List entries, PooledWeblog log) {
this.entries = entries;
this.log = log;
}
public void run( ) {
String entry;
while (true) {
synchronized (entries) {
while (entries.size( ) == 0) {
if (log.isFinished( )) return;try {
entries.wait( );
}
catch (InterruptedException e) {
}
}
entry = (String) entries.remove(entries.size( )-1);
}
int index = entry.indexOf(' ', 0);
String remoteHost = entry.substring(0, index);
String theRest = entry.substring(index, entry.length( ));
try {
remoteHost =
InetAddress.getByName(remoteHost).getHostName( );
}
catch (Exception e) {
// remoteHost remains in dotted quad format
}
try {
log.log(remoteHost + theRest);
}
catch (IOException e) {
}
this.yield( );
}
}
}
