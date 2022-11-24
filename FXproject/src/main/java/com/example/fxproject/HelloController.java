package com.example.fxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController
{
    @FXML
    public TextField nameField;
    @FXML
    public Button helloButton;
    @FXML
    public Button byeButton;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Congrats, you have clicked the button :D !");
    }
    @FXML
    public void onButtonClick(ActionEvent e)
    {
        System.out.println((e.getSource()));
    }

    public void initialize()
    {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }
    public void handleKeyReleased()
    {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }
}