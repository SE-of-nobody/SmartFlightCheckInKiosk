package com.coursework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SurnameController {

    @FXML
    private Label confirm3;

    @FXML
    private Label id_num;

    @FXML
    private TextField id_numField;

    @FXML
    private Button ok;

    @FXML
    private Label surname;

    @FXML
    private TextField surnameField;

    @FXML
    private AnchorPane way2;

    @FXML
    void ok(ActionEvent event) {
        String Surname = surnameField.getText();
        String IDnumber = id_numField.getText();
        System.out.println("Surname: " + Surname);
        System.out.println("ID Number: " + IDnumber);
    }

}

