package com.usguri.reigns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import com.usguri.reigns.characters.Character;
import javafx.scene.control.Button;

public class SecondaryController implements Initializable {

    @FXML
    private VBox root;
    
    @FXML
    public void initialize(URL url, ResourceBundle rs) {
        for (Character c : CharacterManager.getCharacters()) {
            Button btn = new Button();
            btn.setText(c.getName());
            root.getChildren().add(btn);
        }
    }
}