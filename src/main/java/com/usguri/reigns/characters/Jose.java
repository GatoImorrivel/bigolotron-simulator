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
public class Jose extends Character {
    public Jose() {
        this.name = "Jose";
        this.aliance = 0;
        this.army = 0;
        this.money = 0;
        this.resources = 0;
	this.background = new Image("https://images.alphacoders.com/113/1138740.png");
	this.avatar = new Image("https://png.pngtree.com/png-vector/20220220/ourlarge/pngtree-pixel-art-character-boy-waving-his-hand-png-image_4408611.png");
	Option[] options = {new Option("oi jose, n gosto de vc", -10, -10, -10, -10), new Option("oi jose, gosto de vc", 10, 10, 10, 10)};
	Dialog[] dialog = {
		new Dialog("Oi, sou o jose", options),
	};
	this.dialogs = dialog;
    }
}
