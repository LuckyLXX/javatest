package Socket.demo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ClassName:TCPClient
 * Package:Socket.demo2
 * Description:
 *
 * @Date:2019/9/28 19:11
 * @Author:857251389@qq.com
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //文件输入流
        FileInputStream fis = new FileInputStream("F:\\2.txt");
        //客户端套接字
        Socket socket = new Socket("127.0.0.1", 8888);
        //网络输出流
        OutputStream os = socket.getOutputStream();
        //网络输入流
        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];
        //从本地上传至服务器
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }

        socket.shutdownOutput();
        //接收服务器信息
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //关闭资源
        fis.close();
        socket.close();
    }
}
