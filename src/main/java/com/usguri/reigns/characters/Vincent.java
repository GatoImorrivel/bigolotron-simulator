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
public class Vincent extends Person {
	public Vincent() {
		this.name = "Vincent Vangoat, o Maluco das Cabras";
		this.minValueForAliance = 90;
		this.avatar = new Image("file:images/Person2.png");
		this.background = new Image("file:images/BG2.png");
		Option[] temp = {new Option("Oi", 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Isabeu, a Guerreira das Nuvens"
		};
		this.enemies = e;

		String[] a = {
			"Sir Guilherme II"
		};
		this.alies = a;
		
		this.currentDialog = 0;
	}	
}
