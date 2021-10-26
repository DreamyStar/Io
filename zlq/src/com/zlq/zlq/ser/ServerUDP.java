package com.zlq.zlq.ser;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerUDP {
    public static void main(String[] args) throws Exception {
        //建立服务器对象发布通信端口号
        DatagramSocket da = new DatagramSocket(14000);
        //通信
        byte[] b = new byte[1024];
        DatagramPacket date = new DatagramPacket(b, b.length);
        da.receive(date);//接收数据
        da.send(date);//转发给客户端
        System.out.println(new String(b).trim());

        da.close();
    }
}
