import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 8089;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ){
            System.out.println(in.readLine());
            out.println("Daria");

            System.out.println(in.readLine());
//            out.println("yes");
            out.println("no");

            System.out.println(in.readLine());


        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
