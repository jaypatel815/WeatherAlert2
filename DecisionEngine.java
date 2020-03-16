package WeatherAlert2;

import java.util.*;
import java.lang.*;

public class DecisionEngine{
   // Create a engine
   public static DecisionEngine engine = new DecisionEngine();
   
   public DecisionEngine(){}
   
   public static DecisionEngine getInstance(){
      return engine;
   }
   
   public static String weatherInfo(){
      // Get weather data and return status of message
      String weatherMessage;
      String weather1, weather2, weather3;
      String weatherInfo;
      
      weather1 = "Severe";
      weather2 = "Delay";
      weather3 = "Normal";
      
      weatherInfo = weather2;
      
      if("Severe".equals(weatherInfo)){
         weatherMessage = "Due to inclement weather, there will be no school.";
         }
      else if("Delay".equals(weatherInfo)){
         weatherMessage = "There will be a 2 hour delay.";
         }
      else{
         weatherMessage = "Schools will be running normally.";
         }
      
      return weatherMessage;
   }
   
   public static void main(String [] args){
      // Create a service object
      PhoneService phone = new PhoneService();
      smsService sms = new smsService();
      EmailService email = new EmailService();
    
      // Create a notifer object  
      ServiceNotifier notification = new ServiceNotifier();
      
      String message;
      DecisionEngine decision = DecisionEngine.getInstance();
      
      // Attach each service to the ServiceNotifier
      notification.attach(phone);
      notification.attach(sms);
      notification.attach(email);
      
      message = decision.weatherInfo();
      
      notification.notify(message);
      
      System.out.println("----------");
      
      // Check the status of the service objects
      System.out.println(phone);
      System.out.println(sms);
      System.out.println(email);
      
      System.out.println("----------");
   
      // Detach a service
      notification.detach(phone);
      
      // Check the status of the service objects again
      System.out.println(phone);
      System.out.println(sms);
      System.out.println(email);
      
      System.out.println("----------");
      
   }
}