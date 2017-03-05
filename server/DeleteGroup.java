import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeleteGroup extends DAO{

	//Fields

	//Constructors
	//creates group on input name and inserts in database
	public DeleteGroup(String name){
		String sql = "DELETE FROM groups WHERE group_name = ?"
        try{
            Connection connection = super.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            executeInsert(connection, statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}