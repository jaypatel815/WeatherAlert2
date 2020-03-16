package WeatherAlert2;

import java.util.*;

public interface Service{
   public abstract void update(String message); //Updates the observer
   public abstract String toString();
}