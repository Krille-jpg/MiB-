package MiB;


import javax.swing.JOptionPane;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calle
 */
public class Validering {

    
    //Validering för att säkuerställa att textfält inte är tomt
    
    public static boolean tomtTextFält(JTextField textRuta){
        boolean resultat = true;
        if (textRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Vänligen fyll i ett värde");
            textRuta.requestFocus();
            resultat = false;
        }
        return resultat;
    }
    //Validering för att säkerställa att flera textfält inte är tomma. 
    public static boolean tommaTextFält(JTextField ... textrutor){
        boolean resultat = true;
        for (JTextField text : textrutor){
            if (text.getText().isEmpty()){
                resultat = false;
            }
            if (!resultat){
                JOptionPane.showMessageDialog(null, "Vänligen fyll i samtliga fält!");
            }
        }
        return resultat;
    }
            
    public static boolean kollaHeltal (JTextField textRuta){
        boolean resultat = true;
        try{
            String sträng = textRuta.getText();
            Integer.parseInt(sträng);
            textRuta.requestFocus();
       
        }   catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal");
            resultat = false;
        }
        return resultat;
    }

}
