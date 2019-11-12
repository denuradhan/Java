/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12;

/**
 *
 * @author Denuradhan
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm extends JFrame{
    private static final int FRAME_WIDTH = 600, FRAME_HEIGHT = 200;
    private JLabel aLabel, bLabel, cLabel;
    private JTextField aField, bField;
    private JButton button, button2;
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
    }
    
    private void createTextField() {
        aLabel = new JLabel("Nilai A : ");
        bLabel = new JLabel("Nilai B : ");
        cLabel = new JLabel("Nilai C : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButton(){
        button = new JButton("Perkalian");
        button2 = new JButton("Penjumlahan");
        class AddInterestListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil Perkalian : "+c);
            }
             
        }
        class AddInterestListener2 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a+b;
                cLabel.setText("Hasil Penjumlahan : "+c);
            }
        }
        ActionListener listener = new AddInterestListener();
        ActionListener listener2 = new AddInterestListener2();
        button.addActionListener(listener);
        button2.addActionListener(listener2);
        
    }
    
    
    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(button2);
        panel.add(cLabel);
        add(panel);
    }
    
    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
