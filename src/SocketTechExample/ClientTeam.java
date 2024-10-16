package SocketTechExample;

import java.io.*;
import java.net.Socket;

public class ClientTeam {

    public static void main(String[] args) {


        try {
            //เชื่อมต่อไปยัง Server ที่ localhost และพอร์ต 8080
            Socket client = new Socket("localhost",8080);
            System.out.println("Connected to the server");

            InputStream inputStream = client.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = client.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);
            printWriter.println("Hello, Server!");

            String response = bufferedReader.readLine();
            System.out.println(STR."Received from server: \{response}");


            // ปิดการเชื่อมต่อ
            client.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
