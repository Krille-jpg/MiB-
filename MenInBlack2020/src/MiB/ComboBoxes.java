/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiB;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author calle
 */
public class ComboBoxes {

    private InfDB idb;

    public ComboBoxes(InfDB idb) {
        this.idb = idb;

    }
    
    public void fyllUtrustning(JComboBox combobox) {
        
        try{
            //SQL fråga för att filtrera benämningen på utrustningen från db
            String fråga = ("SELECT BENAMNING FROM UTRUSTNING");
            
            //Skapar Arraylist av typen String för att lagra utrustning
            ArrayList<String> utrustningar = idb.fetchColumn(fråga);
            //Itererar genom ArrayListen 
            for (String utr : utrustningar){
                combobox.addItem(utr);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Utrustningen hittades inte!");
            System.out.println("Internt felmeddelande: " + e.getMessage());
            }
    }
    public void fyllOmråde(JComboBox combobox){
       
        try{ 
            String fraga = ("SELECT BENAMNING FROM OMRADE");
            
            ArrayList<String> områden = idb.fetchColumn(fraga);
            
            for (String omr : områden){
                combobox.addItem(omr);
            }
         
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Utrustningen hittades inte!");
            System.out.println("Internt felmeddelande: " + e.getMessage());
            }
        }
        
    }



