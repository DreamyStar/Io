package com.zlq.zlq.ser;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        //创建客户端对象，与服务器建立连接
        Socket sk = new Socket("127.0.0.1", 1200);
        //通信
        OutputStream os = sk.getOutputStream();//发送数据
        InputStream in = sk.getInputStream();//读取数据

        os.write("代码很难！".getBytes());//发送数据

        byte[] b = new byte[20];
        int len = in.read(b);//接收数据放进数组里
        System.out.println(new String(b, 0, len));
        //释放资源
        sk.close();
    }
}
