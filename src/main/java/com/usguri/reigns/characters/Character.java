/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns.characters;

import com.usguri.reigns.Dialog;
import javafx.scene.image.Image;

/**
 *
 * @author Gui
 */
public class Character {
    protected String name;
    protected Dialog[] dialogs;
    protected Image background;
    protected Image avatar;
    protected double aliance;
    protected double money;
    protected double resources;
    protected double army;
    protected int currentDialog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dialog[] getDialogs() {
        return dialogs;
    }

    public void setDialogs(Dialog[] dialogs) {
        this.dialogs = dialogs;
    }

    public double getAliance() {
        return aliance;
    }

    public void setAliance(double aliance) {
        this.aliance = aliance;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getResources() {
        return resources;
    }

    public void setResources(double resources) {
        this.resources = resources;
    }

    public double getArmy() {
        return army;
    }

    public void setArmy(double army) {
        this.army = army;
    }

	public Image getBackground() {
		return background;
	}

	public Image getAvatar() {
		return avatar;
	}

	public int getCurrentDialog() {
		return currentDialog;
	}

	public void setCurrentDialog(int currentDialog) {
		this.currentDialog = currentDialog;
	}

}
