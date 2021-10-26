package com.zlq.zlq.ser;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //建立服务器，发布与服务器通信的端口号
        ServerSocket se = new ServerSocket(1200);
        System.out.println("服务器启动");
        //服务器等待连接请求，无请求无连接，返回与客户端与之对应的通信套字节
        Socket st = se.accept();
        System.out.println("连接接成功");
        //通信
        InputStream in = st.getInputStream();//读取信息
        OutputStream out = st.getOutputStream();//发送信息

        byte[] by = new byte[20];
        int len = in.read(by);//读取数据放进数组里面
        System.out.println(new String(by, 0, len));

        out.write("张李旗".getBytes());//发送数据
        //释放资源
        se.close();
        st.close();

    }
}
