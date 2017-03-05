import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SquadService {
	public static void main(String[] args) {
		
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
		
		while(true){
			try {
				s = ss.accept();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			socket_reader = new SocketReader(s);
			socket_writer = new SocketWriter(s); 
			
			socket_writer.write("OK");
			request = socket_reader.read();
			
			//handle request
			squad_server.serviceRequest(request);
			
			//send response
            
		}
	}
}
