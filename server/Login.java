public class Login extends DAO{

	//Fields

	//Constructors

	public Login(){
		super();
	}

	//Functions

	public String Login(String loginMessage){

		//Creates username and passwords as strings
		String[] messageParts = loginMessage.split(" ");
		String username = messageParts[1];
		String password = messageParts[2];

		Connection con = super.getConnection();
		PreparedStatement ps = con.preparedStatement(""); //TODO ~~~~~~~~~~~~~~~~~~~~~~
		QueryResult qr = super.executeQuery(con, ps);

		ArrayList <String> usernameList = qr.getRow(1);
		if (!userList.contains(username)){
			return "Login Failed Username";
		}
		if (!qr.get(2).get(qr.get(1).indexOf(username)).equals(password)){
			return "Login Failed Password";
		}
		return "Login Successful " + qr.get(0).get(qr.get(1).indexOf(username));
	}
}