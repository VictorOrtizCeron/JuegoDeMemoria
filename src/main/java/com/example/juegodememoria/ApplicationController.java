package com.example.juegodememoria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ApplicationController {
    @FXML
    private Label titleLabel;
    @FXML
    private TextField namePlayer1;
    @FXML
    private TextField namePlayer2;
    @FXML
    private Button startButton;

    String name1;
    String name2;


    public void start(ActionEvent event){
        name1 = namePlayer1.getText();
        name2 = namePlayer2.getText();
        System.out.println(name1);
        System.out.println(name2);
    }
}