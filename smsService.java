package WeatherAlert2;

import java.util.*;

public class smsService implements Service{
   String message;
   
   public void update(String message){
      // Notify users registered for SMS Service via SMS
      this.message = message;
      System.out.println("Notification received via SMS: " + message);
   }
   
   public String toString(){
   // method to check status of the SMS message
   String str = "PhoneService Message: " + message;
   return str;
   
   }
}