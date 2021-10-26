package com.zlq.zlq.DCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSendTread extends Thread{
    private Socket clientSocket;
    public ClientSendTread(Socket clientSocket){
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.nextLine().trim();
            try {
                OutputStream os = clientSocket.getOutputStream();
                os.write(str.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
