package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DecimalFormat;

public class FoodOrderGUI extends  JFrame{
    private JPanel panelMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI f = new FoodOrderGUI();
        f.setTitle("Food Ordering System");
        f.setVisible(true);
        f.setContentPane(f.panelMain);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}



