import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Login extends DAO{

	//Fields

	//Constructors

	public Login(){
		super();
	}

	//Functions

	public String loginRequest(String loginMessage) throws SQLException{

		//Creates username and passwords as strings
		String[] messageParts = loginMessage.split(" ");
		String username = messageParts[1];
		String password = messageParts[2];

		Connection con = super.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from users where username = ? and password = ?"); 
		System.out.println("select * from users where username = ? and password = ?");
		ps.setString(1, username);
		ps.setString(2, password);
		QueryResult qr = super.executeQuery(con, ps);
		
		if (!qr.containsData()){
			System.out.println("no user/password found :(");
			return "failure";
		}else{
			System.out.println("user/pass found! :)");
			return "success";
		}
	}
}