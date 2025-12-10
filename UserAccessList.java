import java.time.LocalDateTime;

public class UserAccessList {
    private String userId;
    private LocalDateTime  timeStamp;
    private String ipAddress;
    private String resourceId;
    private String action;


    @Override
    public String toString() {
        return " [userId=" + userId + ", timeStamp=" + timeStamp + ", resourceId=" + resourceId
                + ", action=" + action + ", ipAddress=" + ipAddress + "]";
    }
   
    
    public UserAccessList(String userId, LocalDateTime timeStamp, String resourceId, String action, String ipAddress) {
        this.userId = userId;
        this.timeStamp = timeStamp;
        this.resourceId = resourceId;
        this.action = action;
        this.ipAddress = ipAddress;
    }


    public String getUserId() {
        return userId;
    }


    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }


    public String getIpAddress() {
        return ipAddress;
    }


    public String getResourceId() {
        return resourceId;
    }


    public String getAction() {
        return action;
    }
   
   
}
