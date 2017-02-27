package Automatic_Garden;

import java.util.Random;
import java.util.logging.Level;

public class Delphinium extends Flowers {
   // Flowers Delphinium = new Flowers(); 
    public static int SprinklerCount_Delphinium = 4, more_water_Delphinium = 0;
    public static int Growth_of_Delphinium = 0, Height_Delphinium=0;
    public static double Fertilizer_Delphinium = 0;
    
    public static Random Growth_Delphinium = new Random();
    public static void Grow_Delphinium () {
       Growth_of_Delphinium = Growth_Delphinium.nextInt(3);
       Height_Delphinium = Height_Delphinium + Growth_of_Delphinium;
       File_Logging.logger_Random_External_Occurrences.log(Level.INFO, "Checking Delphinium growth once in 9 days and the growth is: {0}.. Now, the plant height is: {1} centimeters", new Object[]{Growth_of_Delphinium, Height_Delphinium});
       Fertilizer.Fertilize_Delphinium();
    }   
}
