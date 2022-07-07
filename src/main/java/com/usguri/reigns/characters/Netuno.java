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
public class Netuno extends Character {
    public Netuno() {
        this.name = "Netuno";
        this.aliance = 0;
        this.army = 0;
        this.money = 0;
        this.resources = 0;
	this.background = new Image("https://i.pinimg.com/originals/fd/8f/8d/fd8f8da060afe72035e078e5fe661452.png");
	this.avatar = new Image("https://cdn.domestika.org/c_fit,dpr_auto,f_auto,t_base_params,w_820/v1616647805/content-items/007/472/321/vikinga%2520dos%2520sin%2520borde-original.png?1616647805");
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
