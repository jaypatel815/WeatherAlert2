package WeatherAlert2;

import java.util.*;

public class EmailService implements Service{
   
   String message;
   
   public void update(String message){
      
      /* This opens a file that contains all the users registered for email notification.
      Notify the clients via our email service. */
      
      this.message = message;
      System.out.println("Notification received via Email: " + message);
   }
   
   public String toString(){
   
   // Print the status of the email message
   String str = "EmailService Message: " + message;
   return str;
   
   }
}