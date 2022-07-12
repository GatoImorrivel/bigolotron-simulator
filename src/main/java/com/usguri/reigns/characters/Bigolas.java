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
public class Bigolas extends Person {
	public Bigolas() {
		this.name = "Marcio Bigolin";
		this.minValueForAliance = 140;
		this.avatar = new Image("file:images/Person7.png");
		this.background = new Image("file:images/BG7.png");
		Option[] temp = {new Option("Oi", 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Sir Guilherme II"
		};
		this.enemies = e;

		String[] a = {};
		this.alies = a;

		this.currentDialog = 0;
	}	
}
