/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.IOException;
import java.net.*;
import java.util.*;

/**
 *
 * @author Van Anh
 */
public class ChatUDPServer {

    private static int port = 23;//Mở cổng 23
    private static byte[] inBuf = new byte[2048];
    private static DatagramSocket socket;
    private static ArrayList<User> inUsers = new ArrayList<User>();


    public static void main(String[] args) {
        try {
            setSocket(new DatagramSocket(getPort()));
            System.out.println("Server started at port " + getPort());
            DatagramPacket inPacket = new DatagramPacket(getInBuf(), getInBuf().length);
            while (true) {
                try {
                    getSocket().receive(inPacket);
                    boolean firstJoin = true;
                    User user = new User(inPacket.getAddress(), inPacket.getPort());
                    System.out.println("User port: " + user.getPort());
                    for (User u : getInUsers()) {
                        if (u.getPort() == user.getPort() && u.getAddress().equals(user.getAddress())) {
                            firstJoin = false;
                        }
                    }
                    System.out.println("inPackets length: " + getInUsers().size());
                    String inMsg = new String(inPacket.getData(), 0, inPacket.getLength());
                    //gửi tín hiệu tới phòng chat
                    StringTokenizer st = new StringTokenizer(inMsg, "\t");
                    String senderName = st.nextToken();
                    String msg = st.nextToken();
                    if (msg.equals("~leave")) {
                    // Người dùng rời phòng chat
                        for (User u : getInUsers()) {
                            if (u.getAddress().equals(user.getAddress()) && u.getPort() == user.getPort()) {
                                user = u;
                            }
                        }
                        getInUsers().remove(user);
                        sendMsg(senderName + " left the room!\n");
                    } else {
                        if (firstJoin) {
                            getInUsers().add(user);
                            sendMsg(senderName + " has joined the room!\n");
                            firstJoin = false;
                        } else {
                            String outMsg = senderName + ": " + msg + "\n";
                            System.out.println(outMsg);
                            sendMsg(outMsg);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    private static void sendMsg(String outMsg) {
        DatagramPacket outPacket = new DatagramPacket(outMsg.getBytes(), outMsg.length(), null, 0);
        for (User user : getInUsers()) {
            outPacket.setAddress(user.getAddress());
            outPacket.setPort(user.getPort());
            if (getSocket() != null) {
                try {
                    getSocket().send(outPacket);
                    System.out.println("Sent to chatroom: "
                            + outPacket.getAddress().toString() + " " + outPacket.getPort() + "\n"
                            + new String(outPacket.getData(), 0, outPacket.getLength()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * @return the port
     */
    public static int getPort() {
        return port;
    }

    /**
     * @param aPort the port to set
     */
    public static void setPort(int aPort) {
        port = aPort;
    }

    /**
     * @return the inBuf
     */
    public static byte[] getInBuf() {
        return inBuf;
    }

    /**
     * @param aInBuf the inBuf to set
     */
    public static void setInBuf(byte[] aInBuf) {
        inBuf = aInBuf;
    }

    /**
     * @return the socket
     */
    public static DatagramSocket getSocket() {
        return socket;
    }

    /**
     * @param aSocket the socket to set
     */
    public static void setSocket(DatagramSocket aSocket) {
        socket = aSocket;
    }

    /**
     * @return the inUsers
     */
    public static ArrayList<User> getInUsers() {
        return inUsers;
    }

    /**
     * @param aInUsers the inUsers to set
     */
    public static void setInUsers(ArrayList<User> aInUsers) {
        inUsers = aInUsers;
    }
}
