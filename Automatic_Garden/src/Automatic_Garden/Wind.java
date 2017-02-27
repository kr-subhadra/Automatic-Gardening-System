
package Automatic_Garden;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;

public class Wind {
   public static Random generator_Wind = new Random();
   public static TimerTask Timer_Wind;
    public static int wind = 0;
    
        public static void wind(){
        new Timer().schedule(
        Timer_Wind = new TimerTask() {
        @Override
        public void run() {
        wind = generator_Wind.nextInt(41);
        File_Logging.logger_Random_External_Occurrences.log(Level.INFO, "Checking Wind, once in 2 hours... And the Wind Speed is.. {0} miles/hour", wind);
        if (wind>30) {
           File_Logging.logger_Random_External_Occurrences.log(Level.WARNING, "Since the wind speed is more than 30 miles/hour, sprinkler won't be operated right now for another 2 hours, since the water might be carried away by the wind.."); 
        }
        }     
      }, 0, 1440000/12);
    }
}
