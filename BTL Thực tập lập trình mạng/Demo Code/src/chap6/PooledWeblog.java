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
import java.io.*;
import java.util.*;
public class PooledWeblog {
private BufferedReader in;
private BufferedWriter out;
private int numberOfThreads;
private List entries = Collections.synchronizedList(new
LinkedList( ));
private boolean finished = false;
private int test = 0;
public PooledWeblog(InputStream in, OutputStream out,
int numberOfThreads) {
this.in = new BufferedReader(new InputStreamReader(in));
this.out = new BufferedWriter(new OutputStreamWriter(out));
this.numberOfThreads = numberOfThreads;}
public boolean isFinished( ) {
return this.finished;
}
public int getNumberOfThreads( ) {
return numberOfThreads;
}
public void processLogFile( ) {
for (int i = 0; i < numberOfThreads; i++) {
Thread t = new LookupThread(entries, this);
t.start( );
}
try {
String entry = null;
while ((entry = in.readLine( )) != null) {
if (entries.size( ) > numberOfThreads) {
try {
Thread.sleep((long) (1000.0/numberOfThreads));
}
catch (InterruptedException e) {}
continue;
}
synchronized (entries) {
entries.add(0, entry);
entries.notifyAll( );
}
Thread.yield( );
} // end while
}
catch (IOException e) {
System.out.println("Exception: " + e);
}
this.finished = true;
// finish any threads that are still waiting
synchronized (entries) {
entries.notifyAll( );
}
}
public void log(String entry) throws IOException {
out.write(entry + System.getProperty("line.separator", "\r\n"));
out.flush( );
}
public static void main(String[] args) {
try {PooledWeblog tw = new PooledWeblog(new FileInputStream(args[0]),
System.out, 100);
tw.processLogFile( );
}
catch (FileNotFoundException e) {
System.err.println("Usage: java PooledWeblog logfile_name");
}
catch (ArrayIndexOutOfBoundsException e) {
System.err.println("Usage: java PooledWeblog logfile_name");
}
catch (Exception e) {
System.err.println(e);
e.printStackTrace( );
}
} // end main
}
