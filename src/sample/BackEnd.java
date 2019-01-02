package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class BackEnd {
    public Label pressedButtons;
    private String buttonPresses = "- ";

    public void pressedBlue(javafx.event.ActionEvent actionEvent)
    {
        buttonPresses += "B -";
        pressedButtons.setText(buttonPresses);
    }
    public void pressedYellow(ActionEvent actionEvent)
    {
        buttonPresses += "Y -";
        pressedButtons.setText(buttonPresses);
    }
    public void pressedGreen(ActionEvent actionEvent)
    {
        buttonPresses += "G -";
        pressedButtons.setText(buttonPresses);
    }
    public void pressedRed(ActionEvent actionEvent)
    {
        buttonPresses += "R -";
        pressedButtons.setText(buttonPresses);
    }
}
