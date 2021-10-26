package com.zlq.zlq.DCP;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("127.0.0.1",1500);
            new ClientReceiveThread(clientSocket).start();
            new ClientSendTread(clientSocket).start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
