package Automatic_Garden;

import java.util.Random;
import java.util.logging.Level;

public class Larkspur extends Flowers {

public static int SprinklerCount_Larkspur = 7, more_water_Larkspur = 0;
    public static int Growth_of_Larkspur = 0, Height_Larkspur = 0;
    public static double Fertilizer_Larkspur = 0;
    
    public static Random Growth_Larkspur = new Random();
    public static void Grow_Larkspur() {
       Growth_of_Larkspur= Growth_Larkspur.nextInt(3);
       Height_Larkspur = Height_Larkspur + Growth_of_Larkspur;
       File_Logging.logger_Random_External_Occurrences.log(Level.INFO, "Checking Larkspur growth once in 7 days and the growth is: {0}.. Now, the plant height is: {1} centimeters", new Object[]{Growth_of_Larkspur, Height_Larkspur});
       Fertilizer.Fertilize_Larkspur();
}
}
