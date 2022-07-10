package com.usguri.reigns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import com.usguri.reigns.characters.Person;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController implements Initializable {

    @FXML
    private VBox charBox;

    @FXML
    private Label dayCounter;
    
    @FXML
    public void initialize(URL url, ResourceBundle rs) {
	this.dayCounter.setText(DayManager.getCurrentDayAsString());
        for (Person c : CharacterManager.getCharacters()) {
            Button btn = new Button();
            btn.setText(c.getName());
            btn.setId(c.getName());
            btn.setOnAction(event -> {
                for(Person c1 : CharacterManager.getCharacters()) {
                    if(event.getSource().toString().contains(c1.getName())) {
                        CharacterManager.setCurrentChar(c1.getName());
			App.changeScene("dialog");
                    }
                }
            });
            charBox.getChildren().add(btn);
        }
    }
}