package Automatic_Garden;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    //Sprinkler count by clicking
    public static int count_Delphinium = Delphinium.SprinklerCount_Delphinium;
    public static int count_Orchid = Orchid.SprinklerCount_Orchid;
    public static int count_Larkspur = Larkspur.SprinklerCount_Larkspur;
    public static int i=0, j=0, k=0; 
    //Fertilizer count by clicking
    public static double fertilizer_click_Delphinium = 0;
    public static double fertilizer_click_Orchid = 0;
    public static double fertilizer_click_Larkspur = 0;
    
    @FXML
    private Label label;
    
    @FXML
    public void Sprinkler1(ActionEvent event) {  
        if(Wind.wind>30){
            File_Logging.logger_Interactions.log(Level.WARNING, "Sprinkling water now is a waste because wind speed is greater than 30 miles/hour.. So, sprinkler for Delphinium won't be turned on right now..");
        }
        else if(i>=Delphinium.SprinklerCount_Delphinium){
            File_Logging.logger_Interactions.log(Level.WARNING, "Sprinkler for Delphinium: You cannot water more than this today..");
        } 
        else if (i<Delphinium.SprinklerCount_Delphinium) {
            i++; count_Delphinium--;
            File_Logging.logger_Interactions.log(Level.INFO, "Sprinkler for Delphinium: You are watering {0} times each for 10 minutes.. So, automatically sprinkling {1} times today", new Object[]{i, count_Delphinium});
        }       
    }
    
    @FXML
    public void Sprinkler2(ActionEvent event) {
        if(Wind.wind>30){
            File_Logging.logger_Interactions.log(Level.WARNING, "Sprinkling water now is a waste because wind speed is greater than 30 miles/hour.. So, sprinkler for Orchid won't be turned on right now..");
        }
        else if(j>=Orchid.SprinklerCount_Orchid){
            File_Logging.logger_Interactions.log(Level.WARNING, "Sprinkler for Orchid: You cannot water more than this today..");
        } 
        else if (j<Orchid.SprinklerCount_Orchid) {
            j++; count_Orchid--;
            File_Logging.logger_Interactions.log(Level.INFO, "Sprinkler for Orchid: You are watering {0} times each for 10 minutes.. So, automatically sprinkling {1} times today", new Object[]{j, count_Orchid});
        }  
    }
    
    @FXML
    public void Sprinkler3(ActionEvent event) {
        if(Wind.wind>30){
            File_Logging.logger_Interactions.log(Level.WARNING, "Sprinkling water now is a waste because wind speed is greater than 30 miles/hour.. So, sprinkler for Larkspur won't be turned on right now..");
        }
        else if(k>=Larkspur.SprinklerCount_Larkspur){
            File_Logging.logger_Interactions.log(Level.WARNING, "Sprinkler for Larkspur: You cannot water more than this today..");
        } 
        else if (k<Larkspur.SprinklerCount_Larkspur) {
            k++; count_Larkspur--;
            File_Logging.logger_Interactions.log(Level.INFO, "Sprinkler for Larkspur: You are watering {0} times each for 10 minutes.. So, automatically sprinkling {1} times today", new Object[]{k, count_Larkspur});
        }  
    } 
    
    @FXML
    public void Pest_ClickOn(ActionEvent event) {
            if (Pesticides.pest==0) {
            File_Logging.logger_Interactions.log(Level.WARNING, "Garden is safe from pests! You need not switch ON Pesticide..");
            }
            else
            {
            File_Logging.logger_Interactions.log(Level.INFO, "You turned ON pesticide!!");
        }
    } 
    
        @FXML
    public void Pest_ClickOff(ActionEvent event) {
            if (Pesticides.pest==0) {
            File_Logging.logger_Interactions.log(Level.INFO, "You switched OFF Pesticide..");
            }
            else
            {
            File_Logging.logger_Interactions.log(Level.SEVERE, "Garden is affected by pests! You cannot turn OFF pesticide!!");
        }
    } 
    
    @FXML
    public void Fertilizer_Click_Delphinium(){
        if (fertilizer_click_Delphinium < Delphinium.Fertilizer_Delphinium){
            fertilizer_click_Delphinium = fertilizer_click_Delphinium+0.01;
         File_Logging.logger_Interactions.log(Level.INFO, "You have put {0} lb fertilizer for Delphinium..", fertilizer_click_Delphinium);
    }
        else{
         File_Logging.logger_Interactions.log(Level.WARNING, "You have put the necessary fertilizer for Delphinium..");
    }
    }
    @FXML
    public void Fertilizer_Click_Orchid(){
        if (fertilizer_click_Orchid < Orchid.Fertilizer_Orchid){
            fertilizer_click_Orchid =fertilizer_click_Orchid+0.01;
         File_Logging.logger_Interactions.log(Level.INFO, "You have put {0} lb fertilizer for Orchid..", fertilizer_click_Orchid);
    }
        else{
         File_Logging.logger_Interactions.log(Level.WARNING, "You have put the necessary fertilizer for Orchid..");
    }
    } 
    @FXML
    public void Fertilizer_Click_Larkspur(){
        if (fertilizer_click_Larkspur < Larkspur.Fertilizer_Larkspur){
            fertilizer_click_Larkspur=fertilizer_click_Larkspur+0.01;
         File_Logging.logger_Interactions.log(Level.INFO, "You have put {0} lb fertilizer for Larkspur..", fertilizer_click_Larkspur);
    }
        else{
         File_Logging.logger_Interactions.log(Level.WARNING, "You have put the necessary fertilizer for Larkspur..");
    }
    }
    
    public void Heater_On_Delphinium() {
        if(Heating_System.heat_Delphinium==true) {
           File_Logging.logger_Interactions.log(Level.INFO, "You are switching ON the heater for Delphinium..");
        }
        else {
           File_Logging.logger_Interactions.log(Level.WARNING, "Heater is not needed for Delphinium as the temperature is above 22 degree Celsius..");
        }
        
    }
    public void Heater_Off_Delphinium() {
        if(Heating_System.heat_Delphinium==true) {
           File_Logging.logger_Interactions.log(Level.WARNING, "You cannot switch OFF heater for Delphinium as the temperature is less than 22 degree celsius..");
        }
        else {
           File_Logging.logger_Interactions.log(Level.INFO, "You are switching OFF the heater for Delphinium..");
        }
        
    }
    public void Heater_On_Orchid() {
        if(Heating_System.heat_Orchid==true) {
           File_Logging.logger_Interactions.log(Level.INFO, "You are switching ON the heater for Orchid..");
        }
        else {
        File_Logging.logger_Interactions.log(Level.WARNING, "Heater is not needed for Orchid as the temperature is above 20 degree Celsius..");
        }
        
    }
    public void Heater_Off_Orchid() {
        if(Heating_System.heat_Orchid==true) {
           File_Logging.logger_Interactions.log(Level.WARNING, "You cannot switch OFF heater for Orchid as the temperature is less than 20 degree celsius..");
        }
        else {
        File_Logging.logger_Interactions.log(Level.INFO, "You are switching OFF the heater for Orchid....");
        }
        
    }
    public void Heater_On_Larkspur() {
        if(Heating_System.heat_Larkspur==true) {
           File_Logging.logger_Interactions.log(Level.INFO, "You are switching ON the heater for Larkspur..");
        }
        else {
           File_Logging.logger_Interactions.log(Level.WARNING, "Heater is not needed for Larkspur as the temperature is above 18 degree Celsius..");
        }
        
    }
    
    public void Heater_Off_Larkspur() {
        if(Heating_System.heat_Larkspur==true) {
           File_Logging.logger_Interactions.log(Level.WARNING, "You cannot switch OFF heater for Larkspur as the temperature is less than 18 degree celsius..");
        }
        else {
           File_Logging.logger_Interactions.log(Level.INFO, "You are switching OFF the heater for Larkspur..");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

}
}
