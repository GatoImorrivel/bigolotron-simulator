/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns.characters;

import com.usguri.reigns.Dialog;
import com.usguri.reigns.Option;
import javafx.scene.image.Image;

/**
 *
 * @author gato
 */
public class Elisabet extends Person {
	public Elisabet() {
		this.name = "Elisabet Frogin";
		this.minValueForAliance = 80;
		this.avatar = new Image("file:images/Person5.png");
		this.background = new Image("file:images/BG5.png");
		Option[] temp = {new Option("Oi", 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Isabeu, a Guerreira das Nuvens",
			"Cavaleiro",
		};
		this.enemies = e;

		this.currentDialog = 0;
	}	
}
