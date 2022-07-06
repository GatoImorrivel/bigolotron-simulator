/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns;

/**
 *
 * @author Gui
 */
public class Dialog {
    private String content;
    private double alianceEffect;
    private double armyEffect;
    private double resourcesEffect;
    private double moneyEffect;
    
    public Dialog(String content, double alianceEffect, double armyEffect, double resourcesEffect, double moneyEffect) {
        this.content = content;
        this.alianceEffect = alianceEffect;
        this.armyEffect = armyEffect;
        this.resourcesEffect = resourcesEffect;
        this.moneyEffect = moneyEffect;
    }
}
