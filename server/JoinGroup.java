import java.sql.*;
import java.util.ArrayList;

public class JoinGroup extends DAO{

    //Fields
    
    //Constructors
    
    public JoinGroup(){
        super();
    }
    
    public String joinGroupRequest(String joinGroupMessage) throws SQLException{
        
        //joins the user to a group
        String[] messageParts= joinGroupMessage.split(" ");
        //join_group username groupname
        String username= messageParts[1];
        String groupname= messageParts[2];
        
        Connection con= super.getConnection();
        PreparedStatement ps= con.prepareStatement("insert into group_map (username, groupname) values (?,?)");
        ps.setInt(1, username);
        ps.setInt(2, groupname);
        QueryResult qr= super.executeQuery(con, ps);
        
        ArrayList <String>
        
    }
}
