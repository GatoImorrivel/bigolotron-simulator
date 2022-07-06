/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns;

import com.usguri.reigns.characters.Netuno;
import com.usguri.reigns.characters.Character;
import com.usguri.reigns.characters.Goes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gui
 */
public class CharacterManager {
    private static final List<Character> characters = new ArrayList<>();
    private static CharacterManager instance = null;
    private static Character currentCharacter;
    
    private CharacterManager() {
        characters.add(new Netuno());
        characters.add(new Goes());
    }
    
    public static CharacterManager getInstance() {
        if(instance == null)
            instance = new CharacterManager();
        
        return instance;
    }
        
    public static Character getByName(String name) {
        for (int i = 0; i < 10; i++) {
            if(characters.get(i).getName().equals(name)) {
                return characters.get(i);
            }
        }
        
        return null;
    }
    
    public static List<Character> getCharacters() {
        return characters;
    }
    
    public static void setCurrentChar(int index) {
        currentCharacter = characters.get(index);
    }
    
    public static Character getCurrentChar() {
        return currentCharacter;
    }
}
