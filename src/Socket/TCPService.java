package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:TCPService
 * Package:Socket
 * Description:
 *
 * @Date:2019/9/28 10:54
 * @Author:857251389@qq.com
 */
public class TCPService {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        Socket accept = serverSocket.accept();

        OutputStream os = accept.getOutputStream();
        InputStream is = accept.getInputStream();

        os.write("你好这里是服务器".getBytes());

        byte[] bytes = new byte[1024];

        int len = is.read(bytes);

        System.out.println(new String(bytes,0,len));
//        serverSocket.close();
//        accept.close();

    }
}
