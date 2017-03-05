import java.sql.*;
import java.util.ArrayList;

public class JoinGroup extends DAO{

    //Fields
    
    //Constructors
    
    public JoinGroup(){
        super();
    }
    
    public String joinGroupREquest(String joinGroupMessage) throws SQLException{
        
        //joins the user to a group
        String[] messageParts= joinGroupMessage.split(" ");
        //join_group username groupname
        String username= messageParts[1];
        String groupname= messageParts[2];
        
        Connection con= super.getConnection();
        PreparedStatement ps= con.prepareStatement("");
        QueryResult qr= super.executeQuery(con, ps);
        
        ArrayList <String>
        
    }
}
