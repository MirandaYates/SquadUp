
public class SquadServer {
	
	
	public SquadServer(){
		
	}
	
	public void serviceRequest(String request){
		String [] request_array = request.split(" ");
		
		String request_option = request_array[0];

		switch(request_option) {
			case "gps":
				//gps user_id long_coord lat_coord
				//insert gps coords into database
				break;
				
			case "status":
				//status user_id good/bad
				//insert status into database
				break;
			
			case "create_group":
				break;
			
			case "join_group":
				break;
			
			case "leave_group":
				break;
			
			case "delete_group":
				break;
		}
	
	}
}
