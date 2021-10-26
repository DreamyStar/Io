package com.zlq.zlq.ser;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class clientUDP {
    public static void main(String[] args) throws Exception {
        //创建客户端对象（无需建立连接）
        DatagramSocket st = new DatagramSocket();
        //通信
        byte[] by = "你好吗？".getBytes();
        DatagramPacket dat = new DatagramPacket(by, 0, by.length, new InetSocketAddress("127.0.0.1", 14000));
        st.send(dat);//发送数据

        byte[] byt = new byte[1024];
        DatagramPacket date = new DatagramPacket(byt, byt.length);
        st.receive(date);//接收服务器转发的数据
        System.out.println(new String(byt).trim());


        st.close();
    }
}
