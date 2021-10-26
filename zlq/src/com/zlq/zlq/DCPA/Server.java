package com.zlq.zlq.DCPA;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1600);
            while (true) {
                Socket cle = server.accept();
                ServerSendReceiveThread.socketList.add(cle);
                new ServerSendReceiveThread(cle).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
