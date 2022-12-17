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

    FoodOrderGUI(){

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    double total = 0;

                    if(cPizza.isSelected()) total += 100;
                    if(cBurger.isSelected()) total += 80;
                    if(cFries.isSelected()) total += 65;
                    if(cSoftDrinks.isSelected()) total += 55;
                    if(cTea.isSelected())total += 50;
                    if(cSundae.isSelected()) total += 40;



                    if(rb5.isSelected()) total = total - total * 0.05;
                    if(rb10.isSelected()) total = total - total * 0.10;
                    if(rb15.isSelected()) total = total - total * 0.15;

                    DecimalFormat df = new DecimalFormat(".00");

                    JOptionPane.showMessageDialog(btnOrder,"The total price is " + df.format(total));

                }catch (Exception f){
                    JOptionPane.showMessageDialog(btnOrder,"Invalid Input");
                }
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderGUI f = new FoodOrderGUI();
        f.setTitle("Food Ordering System");
        f.setVisible(true);
        f.setContentPane(f.panelMain);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}



