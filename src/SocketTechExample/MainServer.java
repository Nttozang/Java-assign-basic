package SocketTechExample;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

    public static void main(String[] args) {

        try {
            int port = 8080;

            //สร้าง ServerSocket ที่พอร์ต 8080 เพื่อรอการเชื่อมต่อจาก Client
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running...");

            //ใช้ while ช่วยให้ server ทำงานได้ตลอดเวลา
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Client connected...");

                // สร้าง InputStream สำหรับรับข้อมูลจาก Client
                InputStream inputStream = socket.getInputStream();

                //BufferedReader และ InputStreamReader ใช้สำหรับอ่านข้อมูลในรูปแบบของ String
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                // สร้าง OutPuttStream สำหรับส่งข้อมูล server to Client
                OutputStream outputStream = socket.getOutputStream();

                //สร้าง PrintWriter เพื่อเขียนข้อมูลในรูปแบบข้อความ
                PrintWriter printWriter = new PrintWriter(outputStream,true);
                printWriter.println("Message received from sever");

                // อ่านข้อมูลจาก Client
                String message = bufferedReader.readLine();
                System.out.println(STR."Received from client: \{message}");

                // ปิดการเชื่อมต่อ
                socket.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
