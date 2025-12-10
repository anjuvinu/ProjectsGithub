import java.time.Duration;
import java.time.LocalDateTime;

public class UserSessionAnalysis {
    private String userId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Duration duration;
    
    public UserSessionAnalysis(String userId, LocalDateTime startTime, LocalDateTime endTime, Duration duration) {
        this.userId = userId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = Duration.between(startTime, endTime);
    }

    @Override
    public String toString() {
        return "UserSessionAnalysis [userId=" + userId + ", startTime=" + startTime + ", endTime=" + endTime
                + ", duration=" + duration + "]";
    }

    

}
