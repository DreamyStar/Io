package com.zlq.zlq.DCPA;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 1600);
            new ClientReceiveThread(clientSocket).start();
            new ClientSendThread(clientSocket).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
