package Server;

import Service.BanqueService;
import jakarta.xml.ws.Endpoint;

import java.util.logging.ConsoleHandler;

public class ServerWS {
    public static void main(String[] args) {
        String URL="http://localhost:8084/";


        Endpoint.publish(URL,new BanqueService());
        System.out.println(URL);
    }
}