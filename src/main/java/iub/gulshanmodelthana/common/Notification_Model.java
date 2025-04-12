package iub.gulshanmodelthana.common;

import java.time.LocalDate;
import java.time.LocalTime;

public class Notification_Model {
   private String notification;
   private String type;
   private LocalTime time;
   private LocalDate date;

   public Notification_Model() {
   }

   public Notification_Model(String notification, String type, LocalTime time, LocalDate date) {
      this.notification = notification;
      this.type = type;
      this.time = time;
      this.date = date;
   }

   public String getNotification() {
      return notification;
   }

   public void setNotification(String notification) {
      this.notification = notification;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public LocalTime getTime() {
      return time;
   }

   public void setTime(LocalTime time) {
      this.time = time;
   }

   public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }
}
