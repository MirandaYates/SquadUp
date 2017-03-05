//User Object
//accessor methods for: name, id, status, gps
//mutator method for: status, gps

public class User extendsDAO{
	private int id;
	private String name;
	private Status status =new Status(0);
	private String gps = null;

	public User(String username){
		this.name = username;
		String sql = "select username, password from users where username = ?";
		try{
			Connection connection = super.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			this.id = executeQuery(connection, statement).get(0).get(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int getID(){ return id; }
	public String getName(){ return name; }
	public int getStatus(){	return status.getStatusCode(); }
	public String getGPS(){	return gps.getGPSCode(); }

	//sets status to 's'
	public setStatus(s){ status.setStatusCode(s) }
	//sets gps to 's'
	public setGPS(s){ status.setGPS(s) }
}