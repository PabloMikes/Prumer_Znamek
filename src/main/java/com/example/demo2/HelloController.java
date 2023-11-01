package com.example.demo2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private ListView text;

    @FXML
    private TextField nameField;

    @FXML
    private ChoiceBox subjectField;

    @FXML
    private TextField marksArrayField;

    @FXML
    private Button convert;

    String name;
    Object subject;
    String marks;
    ObservableList<String> zapis = FXCollections.observableArrayList();
    int id = 0;

    @FXML
    protected void onConvertClick() throws Exception {
        name = nameField.getText();
        marks = marksArrayField.getText();
        subject = subjectField.getSelectionModel().getSelectedItem();
        zapis.add(id + " " + name + " - " + subject + ": prumer " + Converter.prumerZnamek(marks));
        text.setItems(zapis);
        id++;
    }

    public void initialize(){
        if(subjectField.getItems().isEmpty()){
            subjectField.getItems().add("Matematika");
            subjectField.getItems().add("Cestina");
            subjectField.getItems().add("Anglictina");
            subjectField.getItems().add("Programko");
        }
    }
}