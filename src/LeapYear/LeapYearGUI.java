package LeapYear;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;


    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int i = Integer.parseInt(tfYear.getText());

                    if(i % 4 == 0){

                        if(i % 100 == 0){
                            if(i % 400 == 0){
                                JOptionPane.showMessageDialog(btnCheckYear,"Leap Year");
                            }
                        }else{
                            JOptionPane.showMessageDialog(btnCheckYear,"Leap Year");
                        }

                    }else{
                        JOptionPane.showMessageDialog(btnCheckYear,"Not Leap Year");
                    }

                }catch(Exception f){
                    JOptionPane.showMessageDialog(btnCheckYear,"Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {

    }
}
