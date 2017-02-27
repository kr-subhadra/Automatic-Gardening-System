
package Automatic_Garden;

import java.util.logging.Level;

public class Fertilizer { 
    public static void Fertilize_Delphinium() {
        switch (Delphinium.Growth_of_Delphinium) {
            case 0:
                File_Logging.logger_System_Events.log(Level.INFO, "Maintaining the same amount of Fertilizer,since Delphinium is not growing.. So, totally putting {0} lb fertilizer..", Delphinium.Fertilizer_Delphinium);
                break;
            case 1:
                Delphinium.Fertilizer_Delphinium = Delphinium.Fertilizer_Delphinium + 0.01;
                File_Logging.logger_System_Events.log(Level.INFO, "Increasing Fertilizer more by 0.01 lb, since Delphinium is not growing that much.. So, totally putting {0} lb fertilizer..", Delphinium.Fertilizer_Delphinium);
                break;
            case 2:
                Delphinium.Fertilizer_Delphinium = Delphinium.Fertilizer_Delphinium + 0.02;
                File_Logging.logger_System_Events.log(Level.INFO, "Increasing Fertilizer more by 0.02 lb, since Delphinium is growing as expected. So, totally putting {0} lb fertilizer..", Delphinium.Fertilizer_Delphinium);
                break;
            default:
                break;
        }
    }
    
    public static void Fertilize_Orchid() {
        switch (Orchid.Growth_of_Orchid) {
            case 0:
                File_Logging.logger_System_Events.log(Level.INFO, "Maintaining the same amount of Fertilizer, since Orchid is not growing.. So, totally putting {0} lb fertilizer..", Orchid.Fertilizer_Orchid);
                break;
            case 1:
                Orchid.Fertilizer_Orchid = Orchid.Fertilizer_Orchid + 0.01;
                File_Logging.logger_System_Events.log(Level.INFO, "Increasing Fertilizer more by 0.01 lb, since Orchid is not growing that much..  So, totally putting {0} lb fertilizer..", Orchid.Fertilizer_Orchid);
                break;
            case 2:
                Orchid.Fertilizer_Orchid = Orchid.Fertilizer_Orchid + 0.02;
                File_Logging.logger_System_Events.log(Level.INFO, "Increasing Fertilizer more by 0.02 lb, since Orchid is growing as expected.. So, totally putting {0} lb fertilizer..", Orchid.Fertilizer_Orchid);
                break;
            default:
                break;
        }     
    }
    
    public static void Fertilize_Larkspur() {
        switch (Larkspur.Growth_of_Larkspur) {
            case 0:
                File_Logging.logger_System_Events.log(Level.INFO, "Maintaining the same amount of Fertilizer, since Larkspur is not growing.. So, totally putting {0} lb fertilizer..", Larkspur.Fertilizer_Larkspur);
                break;
            case 1:
                Larkspur.Fertilizer_Larkspur = Larkspur.Fertilizer_Larkspur + 0.02;
                File_Logging.logger_System_Events.log(Level.INFO, "Increasing Fertilizer more by 0.02 lb, since Larkspur is not growing that much.. So, totally putting {0} lb fertilizer..", Larkspur.Fertilizer_Larkspur);
                break;
            case 2:
                Larkspur.Fertilizer_Larkspur = Larkspur.Fertilizer_Larkspur + 0.03;
                File_Logging.logger_System_Events.log(Level.INFO, "Increasing Fertilizer more by 0.03 lb, since Larkspur is growing as expected.. So, totally putting {0} lb fertilizer..", Larkspur.Fertilizer_Larkspur);
                break;
            default:
                break;
        }
    }
}
