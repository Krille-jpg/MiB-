package MiB;


import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author calle
 */
public class Start {


    private static InfDB idb;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            String sökVäg = ("C:\\db\\MIBDB.fdb");
            idb = new InfDB(sökVäg);
            new InloggSidan(idb).setVisible(true);
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasen kunde inte kopplas");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());

        }
    }
}
