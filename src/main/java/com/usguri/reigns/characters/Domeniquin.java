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
public class Domeniquin extends Person {
	public Domeniquin() {
		this.name = "Domeniquin, o Conquistador da Prata";
		this.minValueForAliance = 110;
		this.avatar = new Image("file:images/Person10.png");
		this.background = new Image("file:images/BG10.png");
		Option[] temp = {new Option("Oi", 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Domenico, o Conquistador do Ouro"
		};
		this.enemies = e;

		this.currentDialog = 0;
	}	
}
