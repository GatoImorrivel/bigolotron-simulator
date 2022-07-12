/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.usguri.reigns;

import com.usguri.reigns.characters.Person;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
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

		for (Person p : CharacterManager.getCharacters()) {
			if (p.getAliance() >= p.getMinValueForAliance() && !playerAliance.isAlreadyInAliance(p)) {
				playerAliance.addNewMember(p);

				for (String name : p.getAlies()) {
					playerAliance.addNewMember(CharacterManager.getByName(name));
				}
			}
		}

		for (Person p : CharacterManager.getCharacters()) {
			if (!playerAliance.isAlreadyInAliance(p)) {
				Aliance a = new Aliance();
				for (String name : p.getAlies()) {
					if (p.getAlies().length == 0) {
						break;
					}
					a.addNewMember(CharacterManager.getByName(name));
				}
				enemyAliances.add(a);
			}
		}

		for (int i = 0; i < enemyAliances.size(); i++) {
			for (int j = 0; j < enemyAliances.size(); j++) {
				boolean isWeaker = enemyAliances.get(i).isWeakerThan(enemyAliances.get(j));
				if (!isWeaker) {
					Collections.swap(enemyAliances, i, j);
				}
			}
		}

		boolean playerLost = false;
		for (Aliance a1 : enemyAliances) {
			if (!a1.isWeakerThan(playerAliance)) {
				playerLost = true;
			}
		}

		if (!playerLost) {
			winnersLabel.setText("Você, " + playerAliance.getParticipantsAsString());
			resultLabel.setText("Você ganhou a guerra!");
		} else {
			winnersLabel.setText(enemyAliances.get(0).getParticipantsAsString());
			resultLabel.setText("Você foi derrotado :(");
		}

	}
}
