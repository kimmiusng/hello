package tcp;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
    static DataOutputStream dos = null;
    static DataInputStream dis = null;

    public static void main(String[] args) {
        Socket socket = new Socket();
        Scanner scanner = new Scanner(System.in);

        try {
            //Socket 생성과 동시에 localhost의 50001 Port로 연결 요청;
            socket.connect(new InetSocketAddress("192.168.0.5", 50001));
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());

            System.out.println("[클라이언트] 연결 성공");

            //데이터 보내기
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            System.out.print("사용자 아이디를 만들어주세요 : ");
            dos.writeUTF(scanner.next());

            // 서버로부터 데이터를 읽는 로직이 필요
            // 읽는것만 담당하는 스레드를 만들어 주어야함
            new Thread(() -> {
                try {
                    while (true) {
                        String message = dis.readUTF();
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();


            while (true) {
                System.out.print(">> ");
                dos.writeUTF(scanner.next());
                dos.flush();
            }

            //Socket 닫기
//            socket.close();
//            System.out.println("[클라이언트] 연결 끊음");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                dos.close();
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}