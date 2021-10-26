package com.zlq.zlq.DCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientReceiveThread extends Thread{
    private Socket clientSocket;
    public ClientReceiveThread(Socket clientSocket){
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        while (true){
            try {
                InputStream is = clientSocket.getInputStream();
                byte [] by = new byte[1024];
                int len = is.read(by);
                System.out.println(new String(by,0,len));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
