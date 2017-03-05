import java.sql.SQLException;

public class SquadServer {

  public SquadServer() {

  }

  /*
   * we are puttin info into DB and pulling from DB (req_gps, req_status)
   */
  public void serviceRequest(String request) throws SQLException {
    String[] request_array = request.split(" ");

    String request_option = request_array[0];

    switch (request_option) {
    case "login":
      Login a = new Login();
      a.loginRequest(request);
      break;
    case "gps":
      // gps user_id long_coord lat_coord
      // insert gps coords into database
      break;

    case "status":
      // status user_id good/bad
      // insert status into database
      break;

    case "create_group":
      break;

    case "join_group":
      break;

    case "leave_group":
      break;

    case "delete_group":
      break;

    case "req_gps":
      // req_gps requested user_id
      // returns gps coords from DB
      break;

    case "req_status":
      // req_status
      // requests status update to all users
      // turns all 'good' users to 'unknown'
      break;

    }

  }
}
