package HW6.soketexamples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Socket socket = new Socket("local host", 1234);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream= new DataInputStream(socket.getInputStream());

            while(true){
                System.out.println("Введите запрос ");
                String request = scanner.nextLine();
                dataOutputStream.writeUTF(request);
                if (request.equals("end")) break;
                System.out.println ("Ответ сервера:" + dataInputStream.readUTF());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
