package iub.gulshanmodelthana.m3_jannati_2330003;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class AssignPatrolTeam_model implements Serializable {
    private static final long serialVersionUID = 1L;
    private LocalDate date;
    private String patrolGoal, officer;

    public AssignPatrolTeam_model(LocalDate date, String patrolGoal, String officer) {
        this.date = date;
        this.patrolGoal = patrolGoal;
        this.officer = officer;
    }

    public static ArrayList<String> getOfficers() {
        ArrayList<String> officerList = new ArrayList<>();
        officerList.add("SI Sumon");
        officerList.add("SI Harun");
        return officerList;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPatrolGoal() {
        return patrolGoal;
    }

    public void setPatrolGoal(String patrolGoal) {
        this.patrolGoal = patrolGoal;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    @Override
    public String toString() {
        return "AssignPatrolTeam_model{" +
                "date=" + date +
                ", patrolGoal='" + patrolGoal + '\'' +
                ", officer='" + officer + '\'' +
                '}';
    }
}
