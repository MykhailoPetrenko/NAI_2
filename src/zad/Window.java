package zad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Window extends JFrame {
    JPanel jPanelLeft;
    JPanel jPanelRight;
    JPanel jPanelMidle;
    NumberButton b;
    JButton buttonFind;
    JTextArea jTextArea;
    double[] liczba= new double[24];
    public Window(){
        setSize(500,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,3,5,5));
        jPanelLeft = new JPanel(new GridLayout(6,4));

        for(int i=0; i<24; i++){
            b= new NumberButton();
            b.setBackground(Color.pink);
            b.setNumber(i);
            b.addItemListener(getButton());
            jPanelLeft.add(b);
        }

        jPanelLeft.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,5  ));
        jPanelMidle = new JPanel();

        jPanelRight = new JPanel(new BorderLayout());

        buttonFind = new JButton("Find");
        buttonFind.addActionListener(getVektor());
        jTextArea = new JTextArea();
        jTextArea.setEnabled(false);

        jPanelRight.setBackground(Color.LIGHT_GRAY);
        jPanelRight.add(buttonFind,BorderLayout.SOUTH);
        jPanelRight.add(jTextArea);

        getContentPane().add(jPanelLeft);
        getContentPane().add(jPanelRight);
        setVisible(true);
    }


    public ItemListener getButton() {
        return new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                NumberButton button = (NumberButton) e.getSource();
                if(!button.isSelected()) {
                    liczba[button.getNumber()] =0;
                }else{
                    liczba[button.getNumber()] =1;
                }
            }
        };
    }
    public String showLiczba(){
        StringBuilder str= new StringBuilder();
        for(int i=0; i<liczba.length; i++){
            str.append(liczba[i] + " ");
        }
        return str.toString();
    }
    public ActionListener getVektor() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0; i<liczba.length; i++)
                    System.out.print(liczba[i] +", ");
                System.out.println(); 
                jTextArea.setText(showLiczba());
                SiecNeuronowa.valiczanieWyniku(liczba);
            }
        };
    }
}
