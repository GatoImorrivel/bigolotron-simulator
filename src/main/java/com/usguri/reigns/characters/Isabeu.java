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
public class Isabeu extends Person {
	public Isabeu() {
		this.name = "Isabeu, a Guerreira das Nuvens";
		this.minValueForAliance = 110;
		this.avatar = new Image("file:images/Person1.png");
		this.background = new Image("file:images/BG1.png");
		Option[] temp = {new Option("Oi", 0)};
		Dialog[] d = {new Dialog("Temp", temp)};	
		this.dialogs = d;
		String[] e = {
			"Vincent Vangoat, o Maluco das Cabras"
		};
		this.enemies = e;

		String[] a = {
			"Cavaleiro"
		};
		this.alies = a;
		
		this.currentDialog = 0;
	}	
}
