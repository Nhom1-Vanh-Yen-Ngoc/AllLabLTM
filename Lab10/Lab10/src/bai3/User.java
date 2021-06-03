/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.net.InetAddress;

/**
 *
 * @author Van Anh
 */
class User {
    
    private InetAddress address;
    private int port;

    public User(InetAddress address, int port) {
        super();
        this.address = address;
        this.port = port;
    }

    public InetAddress getAddress() {
        return address;
    }

    public void setAddress(InetAddress address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    
}
