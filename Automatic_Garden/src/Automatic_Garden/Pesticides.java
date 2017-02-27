
package Automatic_Garden;

import java.util.Random;
import java.util.logging.Level;

public class Pesticides {
    public static Random generator2 = new Random();
    public static int pest = 0;
    
    public static void Pest(){
            pest = generator2.nextInt(2);
            if (pest==0) {
            File_Logging.logger_System_Events.log(Level.INFO, "Garden is safe from pests! Pesticide will not be switched on..");
            }
            else
            {
            File_Logging.logger_System_Events.log(Level.SEVERE, "Garden is affected by pests! Switching on pesticide..");
        }
    }
}
