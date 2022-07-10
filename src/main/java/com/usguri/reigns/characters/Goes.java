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
 * @author Gui
 */
public class Goes extends Person {
    public Goes() {
        this.name = "Goes";
        this.aliance = 500;
        this.army = 0;
        this.money = 0;
        this.resources = 0;
	this.background = new Image("file:images/BG1.png");
	this.avatar = new Image("file:images/Person1.png");
	Option[] options0 = {new Option("Roubar", -10, -10, -10, -10, 1), new Option("Presentear", 10, 10, 10, 10, 1)};
	Option[] options1 = {new Option("Eu tbm", 0), new Option("Creio que isso seja coisa de terrorista domestico", 0), new Option("Ok bb", 0)};
	Dialog[] dialog = {
		new Dialog("Oi", options0),
		new Dialog("Eu amo o Kalani Agostinho Rossi Alfaro", options1),
	};
	this.currentDialog = 0;
	this.dialogs = dialog;
    }
}
