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
public class Arthur extends Person {
	public Arthur() {
		this.name = "Rei Arthur Praiano";	
		this.minValueForAliance = 80;
		this.avatar = new Image("file:images/Person6.png");
		this.background = new Image("file:images/BG6.png");
		Option[] temp = {new Option("Oi", 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Cavaleiro"
		};
		this.enemies = e;

		String[] a = {
			"Elisabet Frogin",
			"Anaje"
		};
		this.alies = a;

		this.currentDialog = 0;
	}	
}
