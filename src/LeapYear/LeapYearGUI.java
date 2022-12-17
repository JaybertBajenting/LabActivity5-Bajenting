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
        LeapYearGUI l = new LeapYearGUI();
        l.setTitle("Leap Year Checker");
        l.setContentPane(l.panel1);
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
