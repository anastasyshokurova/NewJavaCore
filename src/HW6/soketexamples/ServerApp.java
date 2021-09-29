package HW6.soketexamples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Сервер запущен. Ожидает запроса от клиента...");
        Socket socket = serverSocket.accept();
        System.out.println("Клиент подключился к серверу!");

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        while (true) {
            String clientRequest = dataInputStream.readUTF();

            if(clientRequest.equals("end")) break;

            System.out.println("Запрос клиента: " + clientRequest);
            dataOutputStream.writeUTF(clientRequest);
        }
    }
}