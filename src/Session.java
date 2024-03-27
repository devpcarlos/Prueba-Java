import java.util.List;

public class Session {
    private List<Talk> talks;
    private int startTime; // Hora de inicio en minutos

    public Session(List<Talk> talks, int startTime) {
        this.talks = talks;
        this.startTime = startTime;
    }

    public List<Talk> getTalks() {
        return talks;
    }

    public void setTalks(List<Talk> talks) {
        this.talks = talks;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
}