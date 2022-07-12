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
public class Guilherme extends Person {
	public Guilherme() {
		this.name = "Sir Guilherme II";
		this.minValueForAliance = 130;
		this.avatar = new Image("file:images/Person8.png");
		this.background = new Image("file:images/BG8.png");
		Option[] temp = {new Option("Oi", 10, 10, 10, 10, true, 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Marcio Bigolin"
		};
		this.enemies = e;

		String[] a = {};
		this.alies = a;

		this.currentDialog = 0;
	}	
}
