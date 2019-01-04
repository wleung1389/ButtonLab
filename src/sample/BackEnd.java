package sample;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BackEnd {
    public Label pressedButtons;
    public Button blue;
    public Button yellow;
    public Button green;
    public Button red;
    private String buttonPresses = "- ";
    private int timeLeft;

    public void pressedBlue(javafx.event.ActionEvent actionEvent)
    {
        blue.setMouseTransparent(true);
        blue.setStyle("-fx-background-color:rgb(0,0,200); -fx-padding:10 20 10 10;");
        buttonPresses += "B -";
        pressedButtons.setText(buttonPresses);
        pressedButtons.setPrefWidth(100);
        pressedButtons.setWrapText(true);
        timeLeft = 500;
        AnimationTimer a = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if(timeLeft > 0)
                {
                    timeLeft -= 20;
                }
                else
                {
                    blue.setStyle("-fx-background-color:rgb(0,0,82); -fx-padding:10 20 10 10;");
                    blue.setMouseTransparent(false);
                    stop();
                }
            }
        };
        a.start();

    }
    public void pressedYellow(ActionEvent actionEvent)
    {
        yellow.setMouseTransparent(true);
        yellow.setStyle("-fx-background-color:rgb(247,255,3); -fx-padding:10 20 10 10;");
        buttonPresses += "Y -";
        pressedButtons.setText(buttonPresses);
        pressedButtons.setPrefWidth(100);
        pressedButtons.setWrapText(true);
        timeLeft = 500;
        AnimationTimer a = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if(timeLeft > 0)
                {
                    timeLeft -= 20;
                }
                else
                {
                    yellow.setStyle("-fx-background-color:rgb(184,189,49); -fx-padding:10 20 10 10;");
                    yellow.setMouseTransparent(false);
                    stop();
                }
            }
        };
        a.start();
    }
    public void pressedGreen(ActionEvent actionEvent)
    {
        green.setMouseTransparent(true);
        green.setStyle("-fx-background-color:rgb(0,255,102); -fx-padding:10 20 10 10;");
        buttonPresses += "G -";
        pressedButtons.setText(buttonPresses);
        pressedButtons.setPrefWidth(100);
        pressedButtons.setWrapText(true);
        timeLeft = 500;
        AnimationTimer a = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if(timeLeft > 0)
                {
                    timeLeft -= 20;
                }
                else
                {
                    green.setStyle("-fx-background-color:rgb(0,82,0); -fx-padding:10 20 10 10;");
                    green.setMouseTransparent(false);
                    stop();
                }
            }
        };
        a.start();
    }
    public void pressedRed(ActionEvent actionEvent)
    {
        red.setMouseTransparent(true);
        red.setStyle("-fx-background-color:rgb(255,0,4); -fx-padding:10 20 10 10;");
        buttonPresses += "R -";
        pressedButtons.setText(buttonPresses);
        pressedButtons.setPrefWidth(100);
        pressedButtons.setWrapText(true);
        timeLeft = 500;
        AnimationTimer a = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if(timeLeft > 0)
                {
                    timeLeft -= 20;
                }
                else
                {
                    red.setStyle("-fx-background-color:rgb(82,0,0); -fx-padding:10 20 10 10;");
                    red.setMouseTransparent(false);
                    stop();
                }
            }
        };
        a.start();
    }
}
