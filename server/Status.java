import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Status object has getters and setters
public class Status extends DAO{
    private int status_code; //use -1, 0, 1 for bad, neutral, good
    
    public int getStatusCode(int u){
        String sql = "select status from status where user_id = ?";
        try{
            Connection connection = super.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, u);
            return executeQuery(connection, statement).getRow(0).get(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String getStatusTime(int u){
        String sql = "select datetime from status where user_id = ?";
        try{
            Connection connection = super.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, u);
            return executeQuery(connection, statement).getRow(0).get(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void setStatusCode(int u, int x){
        this.status_code= x;
        String sql = "insert into status (user_id, status, datetime) values (?, ?, now())"
        try{
            Connection connection = super.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, u);
            statement.setString(2, x);
            executeInsert(connection, statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

