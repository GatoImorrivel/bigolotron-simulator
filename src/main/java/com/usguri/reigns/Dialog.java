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
    private Option[] options;
    
    public Dialog(String content, Option[] options) {
        this.content = content;
	this.options = options;
    }

	public String getContent() {
		return content;
	}

	public Option[] getOptions() {
		return options;
	}
}
