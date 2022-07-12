/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.usguri.reigns;

import com.usguri.reigns.characters.Person;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author gato
 */
public class EndController implements Initializable {

	@FXML
	private Label resultLabel;

	@FXML
	private Label winnersLabel;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Aliance> enemyAliances = new ArrayList<>();
		Aliance playerAliance = new Aliance();
		playerAliance.addPlayer();


		for(Person p : CharacterManager.getCharacters()) {
			if(p.getAliance() >= p.getMinValueForAliance() && !playerAliance.isAlreadyInAliance(p)) {
				playerAliance.addNewMember(p);

				for(String name : p.getAlies()) {
					playerAliance.addNewMember(CharacterManager.getByName(name));
				}
			}
		}

		for(Person p : CharacterManager.getCharacters()) {
			if(p.getAliance() >= p.getMinValueForAliance() || playerAliance.isAlreadyInAliance(p))
				continue;

			Aliance a = new Aliance();
			for(String name : p.getAlies()) {
				if(p.getAlies().length == 0) {
					break;
				}
				a.addNewMember(CharacterManager.getByName(name));
			}
			enemyAliances.add(a);
		}

		for(Aliance a1 : enemyAliances) {
			for(Aliance a2 : enemyAliances) {
				if(a1.equals(a2))
					continue;

				if(a1.isWeakerThan(a2))
					enemyAliances.remove(a1);
			}
		}

		for(Aliance a1 : enemyAliances) {
			if(a1.isWeakerThan(playerAliance))
				enemyAliances.remove(a1);
		}

		if(enemyAliances.isEmpty()) {
			winnersLabel.setText(playerAliance.getParticipantsAsString());
			resultLabel.setText("Você ganhou a guerra!");
		} else {
			winnersLabel.setText(enemyAliances.get(0).getParticipantsAsString());
			resultLabel.setText("Você foi derrotado :(");
		}
			
	}	
}
