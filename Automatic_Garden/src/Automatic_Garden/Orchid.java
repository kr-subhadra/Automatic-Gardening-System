package Automatic_Garden;

import java.util.Random;
import java.util.logging.Level;

public class Orchid extends Flowers {
    
    public static int SprinklerCount_Orchid = 5, more_water_Orchid = 0;
    public static int Growth_of_Orchid = 0, Height_Orchid = 0;
    public static double Fertilizer_Orchid = 0;
    
    public static Random Growth_Orchid = new Random();
    public static void Grow_Orchid () {
       Growth_of_Orchid = Growth_Orchid.nextInt(3);
       Height_Orchid = Height_Orchid + Growth_of_Orchid;
       File_Logging.logger_Random_External_Occurrences.log(Level.INFO, "Checking Orchid growth once in 8 days and the growth is: {0}.. Now, the plant height is: {1} centimeters", new Object[]{Growth_of_Orchid, Height_Orchid});
       Fertilizer.Fertilize_Orchid();
    }
}
