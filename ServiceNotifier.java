package WeatherAlert2;

import java.util.*;

public class ServiceNotifier extends Observable{
   private static List<Service> _services;
   
   public ServiceNotifier(){
   // Array of current services avaiable to users
      this._services = new ArrayList<>();
   }
   
   public void attach(Service pService){
      // Add service to current array
      if (!_services.contains(pService)){
            _services.add(pService);
      }
   }
   
   public void detach(Service pService){
      // Remove service and set message to None
      pService.update("None");
      _services.remove(pService);
   }
   
   public void notify(String message){
      // Update and notify all users with all services
      // For each service in array of services update users message
      List<Service> serviceLocal = null;
      serviceLocal = new ArrayList<>(this._services);
      for(Service pService : serviceLocal){
         pService.update(message);
      }
   }
   
   /* public static void main(String[] args){
   // Driver function
      ServiceNotifier notification = new ServiceNotifier();
      
      PhoneService phone = new PhoneService();
      smsService sms = new smsService();
      EmailService email = new EmailService();
      
      notification.attach(phone);
      notification.attach(sms);
      notification.attach(email);
      
      notification.notify("Weather alert works!");
   }*/
   
}