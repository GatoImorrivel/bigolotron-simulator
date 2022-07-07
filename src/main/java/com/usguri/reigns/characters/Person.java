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
public class Person {

	protected String name;
	protected Dialog[] dialogs = {};
	protected Person[] enemies = {};
	protected double negativityMultiplier = 1;
	protected Image background;
	protected Image avatar;
	protected double aliance = 0;
	protected double money = 0;
	protected double resources = 0;
	protected double army = 0;
	protected int currentDialog = 0;

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

	public Person[] getEnemies() {
		return enemies;
	}

	public void changeAliance(double changeAmount) {
		if (changeAmount < 0) {
			this.aliance += changeAmount * this.negativityMultiplier;
			return;
		}

		this.aliance += changeAmount;
	}

	public void changeArmy(double changeAmount) {
		if (changeAmount < 0) {
			this.army += changeAmount * this.negativityMultiplier;
			return;
		}

		this.army += changeAmount;
	}

	public void changeMoney(double changeAmount) {
		if (changeAmount < 0) {
			this.money += changeAmount * this.negativityMultiplier;
			return;
		}

		this.money += changeAmount;
	}

	public void changeResources(double changeAmount) {
		if (changeAmount < 0) {
			this.resources += changeAmount * this.negativityMultiplier;
			return;
		}

		this.resources += changeAmount;
	}
}
