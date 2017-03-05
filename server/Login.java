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
		PreparedStatement ps = con.prepareStatement(""); //TODO ~~~~~~~~~~~~~~~~~~~~~~
		QueryResult qr = super.executeQuery(con, ps);

		ArrayList <String> userNameList = qr.getRow(1);
		if (!userNameList.contains(username)){
			return "Login Failed Username";
		}
		if (!qr.getRow(2).get(qr.getRow(1).indexOf(username)).equals(password)){
			return "Login Failed Password";
		}
		return "Login Successful " + qr.getRow(0).get(qr.getRow(1).indexOf(username));
	}
}