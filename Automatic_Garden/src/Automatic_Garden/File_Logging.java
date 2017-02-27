package Automatic_Garden;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class File_Logging {
    static final Logger logger_System_Events = Logger.getLogger("System Events");
    static final Logger logger_Interactions = Logger.getLogger("Interactions");
    static final Logger logger_Random_External_Occurrences = Logger.getLogger("Random External Occurrences");
    
    public File_Logging() {
        FileHandler file_handler1;
        FileHandler file_handler2;
        FileHandler file_handler3;
        
        try {
            file_handler1 = new FileHandler("/Automatic_Garden/build/classes/System Events Only.csv",true);
            file_handler2 = new FileHandler("/Automatic_Garden/build/classes/Interactions Only.csv",true);
            file_handler3 = new FileHandler("/Automatic_Garden/build/classes/Random External Occurrences.csv",true);
                        
            logger_System_Events.addHandler(file_handler1);
            logger_Interactions.addHandler(file_handler2);
            logger_Random_External_Occurrences.addHandler(file_handler3);
            
            SimpleFormatter formatter1 = new SimpleFormatter();
            SimpleFormatter formatter2 = new SimpleFormatter();
            SimpleFormatter formatter3 = new SimpleFormatter();
            
            file_handler1.setFormatter(formatter1);
            file_handler2.setFormatter(formatter2);
            file_handler3.setFormatter(formatter3); 
            
            logger_System_Events.log(Level.INFO, "-----------------------------------Start-----------------------------------------");
            logger_Interactions.log(Level.INFO, "-----------------------------------Start-----------------------------------------");
            logger_Random_External_Occurrences.log(Level.INFO, "-----------------------------------Start-----------------------------------------");
            } 
        catch (SecurityException | IOException e) {
            logger_System_Events.log(Level.SEVERE, e.toString());
            logger_Interactions.log(Level.SEVERE, e.toString());
            logger_Random_External_Occurrences.log(Level.SEVERE, e.toString());
        }    
    } 
}