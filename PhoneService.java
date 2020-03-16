package WeatherAlert2;

import java.util.*;

public class PhoneService implements Service{
   
   String message;
   
   public void update(String message){
      this.message = message;
      System.out.println("Notification received via Phone: " + message);
   }
   
   public String toString(){
      String str = "PhoneService Message: " + message;
      return str;
   }
}