package iub.gulshanmodelthana.m3_jannati_2330003;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class TrainingRecords_module implements Serializable {
    public static final long serialVersionUID = 1L;
    
    private String ID, topic, goal, officer;
    private LocalDate date;
    private boolean doneStatus;

    public TrainingRecords_module(String ID, String topic, String goal, String officer, LocalDate date, boolean doneStatus) {
        this.ID = ID;
        this.topic = topic;
        this.goal = goal;
        this.officer = officer;
        this.date = date;
        this.doneStatus = doneStatus;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isDoneStatus() {
        return doneStatus;
    }

    public void setDoneStatus(boolean doneStatus) {
        this.doneStatus = doneStatus;
    }

    @Override
    public String toString() {
        return "TrainingRecords_module{" +
                "ID='" + ID + '\'' +
                ", topic='" + topic + '\'' +
                ", goal='" + goal + '\'' +
                ", date=" + date +
                ", doneStatus=" + doneStatus +
                '}';
    }

    public static ArrayList<TrainingRecords_module> getAllRecords() {
        ArrayList<TrainingRecords_module> TrainList = new ArrayList<>();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String path = "data/TrainingRecord.bin";
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            TrainingRecords_module temp = null;
            try{
                while (true) {
                    temp = (TrainingRecords_module) ois.readObject();
                    TrainList.add(temp);
                }
            }
            catch (IOException | ClassNotFoundException e){
                System.out.println(e.toString());
            }
            System.out.println("End of file\n");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try { if (ois != null) ois.close(); }
            catch (IOException ignored) {}
        }
        return TrainList;
    }
}
