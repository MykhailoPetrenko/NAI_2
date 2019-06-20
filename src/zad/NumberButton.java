package zad;

import javax.swing.*;

public class NumberButton extends JToggleButton {
    int number = 0; 

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
