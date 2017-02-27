package Automatic_Garden;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Flowers extends Application {
public static TimerTask Timer2;
public static int daycount=0;

public static File_Logging FL;
public static Delphinium D;
public static Orchid O;
public static Larkspur L;

public static Water_System WS;
public static Pesticides P;
public static Fertilizer F;
public static Heating_System H;
public static Wind W;


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);    
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        FL = new File_Logging();
        D = new Delphinium();
        O = new Orchid();
        L = new Larkspur();
                
        WS = new Water_System();
        P = new Pesticides();
        F = new Fertilizer();
        H = new Heating_System();
        W = new Wind();
        
    new Timer().schedule(
    Timer2 = new TimerTask() {
    @Override
      public void run() {
        Water_System.rain = Water_System.generator.nextInt(4);
        daycount++; 
        FXMLDocumentController.i=0; FXMLDocumentController.j=0; FXMLDocumentController.k=0;
        Delphinium.SprinklerCount_Delphinium = 4 + Delphinium.more_water_Delphinium;
        Orchid.SprinklerCount_Orchid = 5 + Orchid.more_water_Orchid;
        Larkspur.SprinklerCount_Larkspur = 7 + Larkspur.more_water_Larkspur;
        File_Logging.logger_System_Events.log(Level.INFO, "********************* It is day {0}", daycount);
        File_Logging.logger_Interactions.log(Level.INFO, "********************* It is day {0}", daycount);
        File_Logging.logger_Random_External_Occurrences.log(Level.INFO, "********************* It is day {0}", daycount);
        
        //Watering System
        Water_System.Sprinkler_more();
        Water_System.Rain(); 
        Water_System.Sprinkler();
         
        //Checking for Pests
         if(daycount%4==0){
         File_Logging.logger_Random_External_Occurrences.log(Level.INFO, "Checking for pests once in 4 days............."); 
         Pesticides.Pest();
        } 
        
         //Fertilizer and checking plant growth
        if(daycount%9==0){
         Delphinium.Grow_Delphinium();
         FXMLDocumentController.fertilizer_click_Delphinium = 0;
        }      
        if(daycount%8==0){
         FXMLDocumentController.fertilizer_click_Orchid=0;
         Orchid.Grow_Orchid();
        }       
        if(daycount%7==0){
         Larkspur.Grow_Larkspur();
         FXMLDocumentController.fertilizer_click_Larkspur = 0;
        } 
      }
        
    }, 0, 1440000);
    
        //Heating System
        Heating_System.heater();
        //Wind
        Wind.wind();
        
        launch(args);  
    }
    
  }

