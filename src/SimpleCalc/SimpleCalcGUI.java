package SimpleCalc;
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JTextField result;

    public SimpleCalcGUI() {


        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    int a = Integer.parseInt(tfNumber1.getText());
                    int b = Integer.parseInt(tfNumber2.getText());
                    int total = 0;

                    String op = cbOperations.getSelectedItem().toString();

                    switch(op){
                        case "+":
                            total = a + b;
                            result.setText(Integer.toString(total));
                            break;
                        case "-":
                            total = a-b;
                            result.setText(Integer.toString(total));
                            break;
                        case "*":
                            total = a * b;
                            result.setText(Integer.toString(total));
                            break;
                        case "/":
                            total = a/b;
                            result.setText(Integer.toString(total));
                            break;

                    }


                }catch(Exception f){
                    JOptionPane.showMessageDialog(btnCompute,"Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI c = new SimpleCalcGUI();
        c.setTitle("Sample Calculator");
        c.setVisible(true);
        c.setContentPane(c.panel1);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
