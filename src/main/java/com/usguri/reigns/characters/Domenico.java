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
public class Domenico extends Person {
	public Domenico() {
		this.name = "Domenico, o Conquistador do Ouro";
		this.minValueForAliance = 110;
		this.avatar = new Image("file:images/Person9.png");
		this.background = new Image("file:images/BG9.png");
		Option[] temp = {new Option("Oi", 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Domeniquin, o Conquistador da Prata"
		};
		this.enemies = e;

		this.currentDialog = 0;
	}	
}
