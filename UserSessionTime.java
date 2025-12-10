import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//find the total session time of a user in seconds
public class UserSessionTime {


    public static List<UserSessionAnalysis> calculateUserSessionTime(List<UserAccessList> userAccessList){
        List<UserSessionAnalysis> userSession=null;
        //userAccessList group based on userId
        System.out.println("userAccessList:"+userAccessList);
        Map<String,List<UserAccessList>> sortedUserList = userAccessList.stream()
                                        .sorted(Comparator.comparing(UserAccessList::getTimeStamp))
                                        .collect(Collectors.groupingBy(UserAccessList::getUserId));
         System.out.println("sorteduserList:"+sortedUserList);

        List<UserSessionAnalysis> userSessions = new ArrayList<>();
        for(Map.Entry<String, List<UserAccessList>> entry : sortedUserList.entrySet()) {

            String userId = entry.getKey();
            List<UserAccessList> accesses = entry.getValue();
            LocalDateTime startTime = accesses.get(0).getTimeStamp();
            LocalDateTime endTime = accesses.get(accesses.size() - 1).getTimeStamp();
            Duration duration = Duration.between(startTime, endTime);
            UserSessionAnalysis session = new UserSessionAnalysis(userId, startTime, endTime, duration);
            userSessions.add(session);

        }

           



         return userSessions;

        

    }



public static void main(String[] args) {
   // Example usage with sample data
        List<UserAccessList> logs = new ArrayList<>();
    logs.add(new UserAccessList("Anju", LocalDateTime.now(), "192.168.1.1", "res6", "action6"));
    logs.add(new UserAccessList("Anju", LocalDateTime.now(), "192.168.1.1", "res6", "action6"));

    logs.add(new UserAccessList("Vinu", LocalDateTime.now().minusMinutes(20), "192.168.1.2", "res5", "action5")); 
    logs.add(new UserAccessList("Hazel", LocalDateTime.now().minusMinutes(5), "192.168.1.2", "res5", "action5")); 
    logs.add(new UserAccessList("Eliza", LocalDateTime.now().minusMinutes(11), "192.168.1.2", "res5", "action5")); 
        List<UserSessionAnalysis> userSessions = calculateUserSessionTime(logs);
         System.out.println("usersessions"+userSessions);
        for (UserSessionAnalysis session : userSessions) {
            System.out.println("usersessions"+session);
        }
}
}