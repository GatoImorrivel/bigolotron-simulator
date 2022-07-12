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
public class Anaje extends Person {
	public Anaje() {
		this.name = "Anaje";	
		this.minValueForAliance = 80;
		this.aliance = 0;
		this.army = 0;
		this.money = 0;
		this.resources = 0;
		this.avatar = new Image("file:images/Person4.png");
		this.background = new Image("file:images/BG4.png");
		Option[] temp = {new Option("Oi", 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Cavaleiro"
		};
		this.enemies = e;

		String[] a = {
			"Elisabet Frogin",
			"Rei Arthur Praiano"
		};
		this.alies = a; 

		this.currentDialog = 0;
	}	
}
