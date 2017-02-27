package Automatic_Garden;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;

class Heating_System
{
 public static TimerTask Timer4;
 public static int temperature=0;
 public static boolean heat_Delphinium = false, heat_Orchid = false, heat_Larkspur = false;
 public static Random generator1 = new Random();

 public static void heater()
 {  
    new Timer().schedule(
    Timer4 = new TimerTask() {
    @Override
        public void run() {
        temperature = generator1.nextInt(20)+14;
        File_Logging.logger_Random_External_Occurrences.log(Level.INFO, "Checking garden temperature once in 3 hours.. And the temperature is {0} degree celsius.", temperature);
        if(temperature<22 && heat_Delphinium==false){
           File_Logging.logger_System_Events.log(Level.INFO, "Switching ON heater for Delphinium as the temperature is below 22 degree Celsius..");
           heat_Delphinium = true;
        }
        if(temperature<22 && heat_Delphinium==true){
           File_Logging.logger_System_Events.log(Level.INFO, "Maintaining the heater ON for Delphinium as the temperature is below 22 degree Celsius..");
        }
        if ((temperature>=22 && heat_Delphinium==true)){
        File_Logging.logger_System_Events.log(Level.INFO, "Switching OFF heater for Delphinium as the temperature is above 22 degree Celsius..");
        heat_Delphinium = false;
        }
        if ((temperature>=22 && heat_Delphinium==false)){
        File_Logging.logger_System_Events.log(Level.INFO, "Maintaining the heater OFF for Delphinium as the temperature is above 22 degree Celsius..");
        }
   
        if(temperature<20 && heat_Orchid==false){
        File_Logging.logger_System_Events.log(Level.INFO, "Switching ON heater for Orchid as the temperature is below 20 degree Celsius..");
        heat_Orchid = true;
        }
        if(temperature<20 && heat_Orchid==true){
        File_Logging.logger_System_Events.log(Level.INFO, "Maintaining heater ON for Orchid as the temperature is below 20 degree Celsius..");
        }
        if(temperature>=20 && heat_Orchid==true) {
        File_Logging.logger_System_Events.log(Level.INFO, "Switching OFF heater for Orchid as the temperature is above 20 degree Celsius..");
        heat_Orchid = false;
        }
        if(temperature>=20 && heat_Orchid==false) {
        File_Logging.logger_System_Events.log(Level.INFO, "Maintaining the heater OFF for Orchid as the temperature is above 20 degree Celsius..");
        }
   
        if(temperature<18 && heat_Larkspur == false){
        File_Logging.logger_System_Events.log(Level.INFO, "Switching ON heater for Larkspur as the temperature is below 18 degree Celsius..");
        heat_Larkspur = true;
        }
        if(temperature<18 && heat_Larkspur == true){
        File_Logging.logger_System_Events.log(Level.INFO, "Maintaining the heater ON for Larkspur as the temperature is below 18 degree Celsius..");
        }
        if(temperature>=18 && heat_Larkspur == true) {
        File_Logging.logger_System_Events.log(Level.INFO, "Switching OFF heater for Larkspur as the temperature is above 18 degree Celsius..");
        heat_Larkspur = false;
        }
        if(temperature>=18 && heat_Larkspur == false) {
        File_Logging.logger_System_Events.log(Level.INFO, "Maintaining the heater OFF for Larkspur as the temperature is above 18 degree Celsius..");
        }
      }
        
    }, 0, 1440000/8);
   
}
}
