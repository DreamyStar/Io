package com.zlq.zlq.DCPA;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSendThread extends Thread {
    private Socket client;

    public ClientSendThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine().trim();
            try {
                OutputStream os = client.getOutputStream();
                os.write(str.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
