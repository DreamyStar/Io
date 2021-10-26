package com.zlq.zlq.DCPA;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerSendReceiveThread extends Thread {
    public static List<Socket> socketList = new ArrayList<>();
    private Socket client;

    public ServerSendReceiveThread() {

    }

    public ServerSendReceiveThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        while (true) {
            try {
                InputStream in = client.getInputStream();
                byte[] by = new byte[1024];
                int len = in.read(by);
                for (Socket cle : socketList) {
                    OutputStream out = client.getOutputStream();
                    out.write(by, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
