/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns;

/**
 *
 * @author gato
 */
public class Option {
	private String text;
	private double alianceEffect, armyEffect, resourceEffect, moneyEffect;
	private int nextDialogIdx;

	public Option(String text, double alianceEffect, double armyEffect, double moneyEffect, double resourceEffect, int nextDialogIdx) {
		this.text = text;
		this.alianceEffect = alianceEffect;
		this.armyEffect = armyEffect;
		this.moneyEffect = moneyEffect;
		this.resourceEffect = resourceEffect;
		this.nextDialogIdx = nextDialogIdx;
	}

	public Option(String text, int nextDialogIdx) {
		this.text = text;
		this.alianceEffect = 0;
		this.armyEffect = 0;
		this.resourceEffect = 0;
		this.nextDialogIdx = nextDialogIdx;
		this.moneyEffect = 0;
	}

	public String getText() {
		return text;
	}

	public double getAlianceEffect() {
		return alianceEffect;
	}

	public double getArmyEffect() {
		return armyEffect;
	}

	public double getResourceEffect() {
		return resourceEffect;
	}

	public double getMoneyEffect() {
		return moneyEffect;
	}

	public int getNextDialogIdx() {
		return nextDialogIdx;
	}

	public void setNextDialogIdx(int nextDialogIdx) {
		this.nextDialogIdx = nextDialogIdx;
	}
}
