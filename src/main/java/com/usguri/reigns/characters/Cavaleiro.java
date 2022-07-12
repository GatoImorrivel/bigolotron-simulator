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
public class Cavaleiro extends Person {
	public Cavaleiro() {
		this.name = "Cavaleiro";
		this.minValueForAliance = 100;
		this.avatar = new Image("file:images/Person3.png");
		this.background = new Image("file:images/BG3.png");
		Option[] temp = {new Option("Oi", 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Anaje",
			"Elisabet Frogin",
			"Rei Arthur Praiano",
		};
		this.enemies = e;

		String[] a = {
			"Isabeu, a Guerreira das Nuvens"
		};
		this.alies = a;
		
		this.currentDialog = 0;
	}	
}
