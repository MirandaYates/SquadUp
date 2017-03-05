import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GPS extends DAO{
    
    //implicit constructor that does nothing and has no params
    
    
    ////////  getters       ////////
    public int getGPSCode(int u){
        String sql= "select coordinates from gps where user_id= ?";
        try{
            Connection connection= super.getConnection();
            PreparedStatement statement= connection.prepareStatement(sql);
            statement.setString(1, u);
            return executeQuery(connection, statement).getRow(0).get(0);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public int getGPSTime(int u){
        String sql= "select datetime from gps where user_id= ?";
        try{
            Connection connection= super.getConnection();
            PreparedStatement statement= connection.prepareStatement(sql);
            statement.setString(1, u);
            return executeQuery(connection, statement).getRow(0).get(0);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    //////////     setters    /////////
    public void setGPS(int u, int x){
        this.gps_code= x;
        String sql= "insert into gps (user_id, coordinates, datetime) values (?, ?, now())"
        try{
            Connection connection= super.getConnection();
            PreparedStatement statement= connection.prepareStatement(sql);
            statement.setString(1, u);
            statement.setString(2, x);
            executeInsert(connection, statement);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
