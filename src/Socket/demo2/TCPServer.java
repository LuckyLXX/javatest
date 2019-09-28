package Socket.demo2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * ClassName:TCPServer
 * Package:Socket.demo2
 * Description:
 *
 * @Date:2019/9/28 19:23
 * @Author:857251389@qq.com
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Socket socket = serverSocket.accept();
                        String filename = "lxx" + System.currentTimeMillis() + new Random().nextInt(99999) + ".txt";
                        FileOutputStream fos = new FileOutputStream("F:\\dir\\" + filename);

                        InputStream is = socket.getInputStream();

                        OutputStream os = socket.getOutputStream();

                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        os.write("上传成功".getBytes());
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }

        //serverSocket.close();

    }
}

