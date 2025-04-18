package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalTime;

public class ItSystemMonitor_Model {
    private String performance;
    private LocalTime uptime;

    public ItSystemMonitor_Model(String performance, LocalTime uptime) {
        this.performance = performance;
        this.uptime = uptime;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public LocalTime getUptime() {
        return uptime;
    }

    public void setUptime(LocalTime uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "ItSystemMonitor_Model{" +
                "performance='" + performance + '\'' +
                ", uptime=" + uptime +
                '}';
    }
}
