package com.zlq.zlq.DCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ser = new ServerSocket(1500);
            while (true){
                Socket client = ser.accept();
                ServerSendReceiveThread.socketList.add(client);
                new ServerSendReceiveThread(client).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
