/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns;

/**
 *
 * @author gato
 */
public class DayManager {

    private static DayManager instance = null;
    private static int daysPassed;
    private static int actionsPerDay;
    private static int daysToWar;
    private static int actions;
    
    private DayManager() {
	this.daysPassed = 0;
	this.actions = 0;
	this.actionsPerDay = 10;
	this.daysToWar = 10;
    }
    
    public static DayManager getInstance() {
        if(instance == null)
            instance = new DayManager();
        
        return instance;
    }

    public static void incrementAction() {
	if(actions >= actionsPerDay) {
		actions = 0;
		daysPassed++;
		checkForWar();
		return;
	}

	actions++;
    }

    private static void checkForWar() {
	if(daysPassed < daysToWar)
		return;

	App.changeScene("end");
    }

    public static String getCurrentDayAsString() {
    	return "Day:" + (daysPassed + 1);
    }

}
