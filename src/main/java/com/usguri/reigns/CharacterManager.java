/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns;

import com.usguri.reigns.characters.Anaje;
import com.usguri.reigns.characters.Arthur;
import com.usguri.reigns.characters.Bigolas;
import com.usguri.reigns.characters.Cavaleiro;
import com.usguri.reigns.characters.Domenico;
import com.usguri.reigns.characters.Domeniquin;
import com.usguri.reigns.characters.Elisabet;
import com.usguri.reigns.characters.Guilherme;
import com.usguri.reigns.characters.Isabeu;
import com.usguri.reigns.characters.Person;
import com.usguri.reigns.characters.Vincent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gui
 */
public class CharacterManager {
    private static final List<Person> characters = new ArrayList<>();
    private static CharacterManager instance = null;
    private static Person currentCharacter;
    
    private CharacterManager() {
	    characters.add(new Anaje());
	    characters.add(new Arthur());
	    characters.add(new Bigolas());
	    characters.add(new Cavaleiro());
	    characters.add(new Domenico());
	    characters.add(new Domeniquin());
	    characters.add(new Elisabet());
	    characters.add(new Guilherme());
	    characters.add(new Isabeu());
	    characters.add(new Vincent());
    }
    
    public static CharacterManager getInstance() {
        if(instance == null)
            instance = new CharacterManager();
        
        return instance;
    }
        
    public static Person getByName(String name) {
        for (int i = 0; i < 10; i++) {
            if(characters.get(i).getName().equals(name)) {
                return characters.get(i);
            }
        }
        
        return null;
    }
    
    public static List<Person> getCharacters() {
        return characters;
    }
    
    public static void setCurrentChar(int index) {
        currentCharacter = characters.get(index);
    }
    
    public static void setCurrentChar(String name) {
        currentCharacter = CharacterManager.getByName(name);
    }
    
    public static Person getCurrentChar() {
        return currentCharacter;
    }

    public static void calculateRelations(Person c, Option selectedOption) {
	c.changeAliance(selectedOption.getAlianceEffect());
	c.changeArmy(selectedOption.getArmyEffect());
	c.changeMoney(selectedOption.getMoneyEffect());
	c.changeResources(selectedOption.getResourceEffect());
	for(String enemyName : c.getEnemies()) {
		Person enemy = CharacterManager.getByName(enemyName);
		enemy.changeAliance(selectedOption.getAlianceEffect() * -1);
	}
	if(selectedOption.isAffectPlayer()) {
		Player.changeArmy(selectedOption.getArmyEffect() * -1);
		Player.changeMoney(selectedOption.getMoneyEffect() * -1);
		Player.changeResources(selectedOption.getResourceEffect() * -1);
	}
	DayManager.incrementAction();
    }
}
