package org.test.Test;

import java.io.OutputStream;

public class TCPclientDemo {
    public static void main(Strinh[] args) {
        //1.打开TCP连接
        String ip = "";
        int port =554;
        Socket sck = new Socket(ip,port);

        //2.传输内容
        String content = "这是一个Java模拟客户端 - 10002";
        byte[] bstream = content.getBytes("GBK");
        OutputStream os = sck.getOutputStream();
        os.write(bstream);

        //3,关闭TCP连接
        sck.close();
    }
}
