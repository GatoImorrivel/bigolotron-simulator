/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns;

import com.usguri.reigns.characters.Netuno;
import com.usguri.reigns.characters.Person;
import com.usguri.reigns.characters.Goes;
import com.usguri.reigns.characters.Jose;
import com.usguri.reigns.characters.Kalani;
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
        characters.add(new Netuno());
        characters.add(new Goes());
        characters.add(new Jose());
        characters.add(new Kalani());
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
	for(Person enemy : c.getEnemies()) {
		enemy.changeAliance(selectedOption.getAlianceEffect() * -1);
	}
    }
}
