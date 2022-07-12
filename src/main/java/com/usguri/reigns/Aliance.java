/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns;

import com.usguri.reigns.characters.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gato
 */
public class Aliance {
	private double totalArmy;
	private double totalMoney;
	private double totalResources;
	private List<Person> peopleInAliance = new ArrayList<>(); 

	public Aliance() {
		this.totalArmy = 0;
		this.totalMoney = 0;
		this.totalResources = 0;
	}

	public void addNewMember(Person p) {
		this.totalArmy += p.getArmy();
		this.totalMoney += p.getMoney();
		this.totalResources += p.getResources();
		this.peopleInAliance.add(p);
	}

	public void addPlayer() {
		this.totalArmy += Player.getArmy();
		this.totalMoney += Player.getMoney();
		this.totalResources += Player.getResources();
	}

	public List<Person> getPeopleInAliance() {
		return peopleInAliance;
	}

	public boolean isAlreadyInAliance(Person p) {
		for(Person p1 : peopleInAliance) {
			if(p.equals(p1))
				return true;
		}

		return false;
	}

	public boolean isWeakerThan(Aliance a) {
		int points = 0;
		if(a.getTotalArmy() > this.totalArmy)
			points++;
		if(a.getTotalMoney() > this.totalMoney)
			points++;
		if(a.getTotalResources() > this.totalResources)
			points++;

		if(points > 1)
			return true;
		else
			return false;
	}

	public double getTotalArmy() {
		return totalArmy;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public double getTotalResources() {
		return totalResources;
	}

	public String getParticipantsAsString() {
		String result = "";
		for (int i = 0; i < this.peopleInAliance.size(); i++) {
			if(i == this.peopleInAliance.size() - 1) {
				result += peopleInAliance.get(i).getName();
			} else {
				result += peopleInAliance.get(i).getName() + ",";
			} 
		}
		return result;
	}
}
