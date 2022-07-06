/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns.characters;

import com.usguri.reigns.Dialog;

/**
 *
 * @author Gui
 */
public class Netuno extends Character {
    public Netuno() {
        this.name = "Netuno";
        this.aliance = 0;
        this.army = 0;
        this.money = 0;
        this.resources = 0;
        Dialog[] dialogs = {new Dialog("TESTE", 0,0,0,0)};
        this.dialogs = dialogs;
    }
}
