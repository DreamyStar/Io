package com.zlq.zlq.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(8800);
            DatagramPacket packet = null;
            byte[] data = null;
            int count = 0;
            System.out.println("***服务器端启动，等待发送数据***");
            while (true){
                data = new byte[1024];
                packet = new DatagramPacket(data,data.length);
                socket.receive(packet);
                Thread thread = new Thread(new UDPThread(socket,packet));
                thread.start();
                count++;
                System.out.println("服务器端被连接过的次数："+count);
                InetAddress address = packet.getAddress();
                System.out.println("当前客户端的IP为"+address.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
