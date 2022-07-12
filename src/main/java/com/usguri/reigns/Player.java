/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns;

/**
 *
 * @author gato
 */
public class Player {

	private static double money;
	private static double resources;
	private static double army;
	private static Player instance = null;

	private Player() {
		money = 1000;
		resources = 100;
		army = 100;
	}

	public static Player getInstance() {
		if (instance == null) {
			instance = new Player();
		}

		return instance;
	}

	public static double getMoney() {
		return money;
	}

	public static double getResources() {
		return resources;
	}

	public static double getArmy() {
		return army;
	}

	public static void changeArmy(double amount) {
		army += amount;
	}

	public static void changeMoney(double amount) {
		money += amount;
	}

	public static void changeResources(double amount) {
		resources += amount;
	}
}
