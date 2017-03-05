import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class SquadService {
  public static void main(String[] args){

    ServerSocket ss = null;
    SquadServer squad_server = new SquadServer();

    try {
      ss = new ServerSocket(1313);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Socket s = null;
    SocketReader socket_reader = null;
    SocketWriter socket_writer = null;
    String request = null;
    
    System.out.println("Service Started.");
    while (true) {
      try {
        s = ss.accept();
        System.out.println("Connection Made.");
      } catch (IOException e) {
        e.printStackTrace();
      }

      socket_reader = new SocketReader(s);
      socket_writer = new SocketWriter(s);

      socket_writer.write("OK");
      request = socket_reader.read();

      System.out.println("request found: " + request);
      String result = squad_server.serviceRequest(request);
      socket_writer.write(result);

    }
  }
}
