import java.util.*;

//Status object has getters and setters
public class Status{
    private int status_code; //use -1, 0, 1 for bad, neutral, good
    private String time_of_last_checkin;
    
    public Status(String time){
        this.status_code= 1;    //just made the group
        this.time_of_last_checkin= //
    }
    
    public int getStatusCode(){
        return this.status_code;
    }
    
    public String getTimeOfLastCheckin(){
        return this.time_of_last_checkin;
    }
    
    public void setStatusCode(int x){
        this.status_code= x;
    }
    
    public void setTimeOfLastcheckin(String s){
        this.time_of_last_checkin= s;
    }
}

