package com.zlq.zlq.ser;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class clientA {
    public static void main(String[] args) throws IOException {
        Socket et = new Socket("127.0.0.1",1300);
        OutputStream out = et.getOutputStream();
        InputStream in = et.getInputStream();

        out.write("太阳下".getBytes());

        byte[] by = new byte[20];
        int len = in.read(by);
        System.out.println(new String(by,0,len));

        et.close();
    }
}
