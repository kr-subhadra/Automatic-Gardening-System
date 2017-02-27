package Automatic_Garden;

import java.util.Random;
import java.util.logging.Level;

public class Water_System {
    public static Random generator = new Random();
    public static int rain = 0;
    
    public static void Rain() {  
        switch (rain) {
            case 1:
                File_Logging.logger_Random_External_Occurrences.log(Level.INFO, "//// It is light rain.. So decreasing sprinkler for the day for Delphinium by 1, Orchid by 2 and Larkspur by 2");
                Delphinium.SprinklerCount_Delphinium--;
                Orchid.SprinklerCount_Orchid=Orchid.SprinklerCount_Orchid-2;
                Larkspur.SprinklerCount_Larkspur=Larkspur.SprinklerCount_Larkspur-2;
                break;
            case 2:
                File_Logging.logger_Random_External_Occurrences.log(Level.INFO, "/////////// It is moderate rain.. So decreasing sprinkler for the day for Delphinium by 3, Orchid by 3 and Larkspur by 4");
                Delphinium.SprinklerCount_Delphinium=Delphinium.SprinklerCount_Delphinium-3;
                Orchid.SprinklerCount_Orchid=Orchid.SprinklerCount_Orchid-3;
                Larkspur.SprinklerCount_Larkspur=Larkspur.SprinklerCount_Larkspur-4;
                break;
            case 3:
                File_Logging.logger_Random_External_Occurrences.log(Level.WARNING, "////////////////////// It is heavy rain.. So switching off sprinkler for the day for Delphinium, Orchid and Larkspur"); 
                Delphinium.SprinklerCount_Delphinium=0;
                Orchid.SprinklerCount_Orchid=0;
                Larkspur.SprinklerCount_Larkspur=0;
                break;
            default:
                break;
        }
    }
    
    public static void Sprinkler_more(){  
        if(Flowers.daycount%5==0){
         File_Logging.logger_System_Events.log(Level.INFO, "Delphinium plant needs more water after 5 days... Increasing sprinkler for a day by 1 from previous value"); 
         Delphinium.more_water_Delphinium = Flowers.daycount/5;
         Delphinium.SprinklerCount_Delphinium=Delphinium.SprinklerCount_Delphinium + Delphinium.more_water_Delphinium;
        }       
        
         if(Flowers.daycount%7==0){
         File_Logging.logger_System_Events.log(Level.INFO, "Orchid plant needs more water after 7 days... Increasing sprinkler for a day by 1 from previous value"); 
         Orchid.more_water_Orchid = Flowers.daycount/7;
         Orchid.SprinklerCount_Orchid=Orchid.SprinklerCount_Orchid + Orchid.more_water_Orchid;
        }       
            
        if(Flowers.daycount%6==0){
         File_Logging.logger_System_Events.log(Level.INFO, "Larkspur plant needs more water after 4 days... Increasing sprinkler for a day by 1 from previous value"); 
         Larkspur.more_water_Larkspur = Flowers.daycount/4;
         Larkspur.SprinklerCount_Larkspur=Larkspur.SprinklerCount_Larkspur + Larkspur.more_water_Larkspur;
        } 
    }
     public static void Sprinkler() {
        File_Logging.logger_System_Events.log(Level.INFO, "Automatically sprinkling water {0} times today for Delphinium for 10 minutes each time", Delphinium.SprinklerCount_Delphinium);
        File_Logging.logger_System_Events.log(Level.INFO, "Automatically sprinkling water {0} times today for Orchid for 10 minutes each time", Orchid.SprinklerCount_Orchid);         
        File_Logging.logger_System_Events.log(Level.INFO, "Automatically sprinkling water {0} times today for Larkspur for 10 minutes each time", Larkspur.SprinklerCount_Larkspur);    
               
        FXMLDocumentController.count_Delphinium = Delphinium.SprinklerCount_Delphinium;
        FXMLDocumentController.count_Orchid = Orchid.SprinklerCount_Orchid;
        FXMLDocumentController.count_Larkspur = Larkspur.SprinklerCount_Larkspur;
    }   
    }
