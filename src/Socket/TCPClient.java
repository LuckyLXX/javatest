package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ClassName:ClientSocket
 * Package:Socket
 * Description:
 *
 * @Date:2019/9/27 22:44
 * @Author:857251389@qq.com
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);

        OutputStream os = socket.getOutputStream();

        os.write("你好".getBytes());

        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];

        int len = is.read(bytes);

        System.out.println(new String(bytes,0,len));
//        socket.close();

    }
}
