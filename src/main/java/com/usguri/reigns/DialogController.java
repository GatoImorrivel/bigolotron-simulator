/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.usguri.reigns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import com.usguri.reigns.characters.Person;
import java.io.IOException;

/**
 * FXML Controller class
 *
 * @author gato
 */
public class DialogController implements Initializable {

	@FXML
	private ImageView avatarImage;

	@FXML
	private ImageView backgroundImage;

	@FXML
	private Label dialogLabel;

	@FXML
	private VBox optionBox;

	@FXML
	private Label alianceLabel;

	@FXML
	private Label armyLabel;

	@FXML
	private Label moneyLabel;

	@FXML
	private Label resourcesLabel;
	
	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		int currentDialog = CharacterManager.getCurrentChar().getCurrentDialog();
		this.avatarImage.setImage(CharacterManager.getCurrentChar().getAvatar());
		this.backgroundImage.setImage(CharacterManager.getCurrentChar().getBackground());
		this.dialogLabel.setText(CharacterManager.getCurrentChar().getDialogs()[currentDialog].getContent());
		this.alianceLabel.setText("" + CharacterManager.getCurrentChar().getAliance());
		this.armyLabel.setText("" + CharacterManager.getCurrentChar().getArmy());
		this.moneyLabel.setText("" + CharacterManager.getCurrentChar().getMoney());
		this.resourcesLabel.setText("" + CharacterManager.getCurrentChar().getResources());

		for(Option o : CharacterManager.getCurrentChar().getDialogs()[currentDialog].getOptions()) {
			Button btn = new Button(o.getText());
			btn.setOnAction(event -> {
				Person current = CharacterManager.getCurrentChar();
				Option[] options = current.getDialogs()[current.getCurrentDialog()].getOptions();
				for(Option o1 : options) {
                    			if(event.getSource().toString().contains(o1.getText())) {
						System.out.println("Entered: " + o1.getText());
						CharacterManager.calculateRelations(current, o1);
						current.setCurrentDialog(o1.getNextDialogIdx());
						App.reload();
					}
				}
			});
			this.optionBox.getChildren().add(btn);
		}
	}	

	@FXML
	public void handleVoltar() {
		App.changeScene("secondary");
	}
}
