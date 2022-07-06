package com.usguri.reigns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import com.usguri.reigns.characters.Character;
import java.io.IOException;
import javafx.scene.control.Button;

public class SecondaryController implements Initializable {

    @FXML
    private VBox root;
    
    @FXML
    public void initialize(URL url, ResourceBundle rs) {
        for (Character c : CharacterManager.getCharacters()) {
            Button btn = new Button();
            btn.setText(c.getName());
            btn.setId(c.getName());
            btn.setOnAction(event -> {
                for(Character c1 : CharacterManager.getCharacters()) {
                    if(event.getSource().toString().contains(c1.getName())) {
                        CharacterManager.setCurrentChar(c1.getName());
			try {
			 App.setRoot("dialog");
			} catch (IOException e) {};
                    }
                }
            });
            root.getChildren().add(btn);
        }
    }
}