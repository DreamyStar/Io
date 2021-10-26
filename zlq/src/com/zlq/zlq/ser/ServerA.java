package com.zlq.zlq.ser;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerA {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1300);
        System.out.println("启动服务器");
        Socket oc = ss.accept();//连接
        InputStream in = oc.getInputStream();
        OutputStream out = oc.getOutputStream();
        byte[] p = new byte[30];
        int len = in.read(p);
        System.out.println(new String(p,0,len));
        out.write("雨中".getBytes());
        ss.close();
        oc.close();
    }
}
