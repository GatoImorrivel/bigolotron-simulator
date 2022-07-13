/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usguri.reigns.characters;

import com.usguri.reigns.Dialog;
import com.usguri.reigns.Option;
import javafx.scene.image.Image;

/**
 *
 * @author gato
 */
public class Vincent extends Person {

	public Vincent() {
		this.name = "Vincent Vangoat, o Maluco das Cabras";
		this.minValueForAliance = 90;
		this.avatar = new Image("file:images/Person2.png");
		this.background = new Image("file:images/BG2.png");
		Option[] options0 = {new Option("Amigo", 10, 0, 0, 0, 1), new Option("Inimigo", -20, 0, 0, 0, 2)};
		Option[] options1 = {new Option("Conversar", 3)};
		Option[] options2 = {};
		Option[] options3 = {new Option("Cabras são daora", 15, 0, 0, 0, 4), new Option("Não sei", 5, 0, 0, 0, 5), new Option("Não, só gosto na janta", -30, 0, 0, 0, 2)};
		Option[] options4 = {new Option("Conversar", 6)};
		Option[] options5 = {new Option("Conversar", 6)};
		Option[] options6 = {new Option("Conversar", 7)};
		Option[] options7 = {new Option("Conversar", 8)};
		Option[] options8 = {new Option("Conversar", 9)};
		Option[] options9 = {new Option("Sim", 10, 0, 0, 0, 10), new Option("Não", -30, 0, 0, 0, 2)};
		Option[] options10 = {new Option("Conversar", 11)};
		Option[] options11 = {new Option("Conversar", 12)};
		Option[] options12 = {new Option("Conversar", 13)};
		Option[] options13 = {new Option("Conversar", 14)};
		Option[] options14 = {new Option("Conversar", 15)};
		Option[] options15 = {new Option("Doar 20 de Exercito", 30, 0, 20, 0, true, 16), new Option("Infelizmente não posso", 5, 0, 0, 0, 18)};
		Option[] options16 = {new Option("Conversar", 18)};
		Option[] options17 = {new Option("Conversar", 18)};
		Option[] options18 = {new Option("Conversar", 19)};
		Option[] options19 = {new Option("Conversar", 20)};
		Option[] options20 = {new Option("Conversar", 21)};
		Option[] options21 = {new Option("Conversar", 22)};
		Option[] options22 = {new Option("Conversar", 23)};
		Option[] options23 = {new Option("Conversar", 24)};
		Option[] options24 = {new Option("Conversar", 25)};
		Option[] options25 = {new Option("Conversar", 26)};
		Option[] options26 = {new Option("Conversar", 27)};
		Option[] options27 = {new Option("Conversar", 28)};
		Option[] options28 = {new Option("Doar 10 de Recursos", 30, 0, 0, 10, true, 29), new Option("Desculpe, não tenho agora", 5, 0, 0, 0, 30)};
		Option[] options29 = {new Option("Conversar", 31)};
		Option[] options30 = {new Option("Conversar", 31)};
		Option[] options31 = {new Option("Conversar", 32)};
		Option[] options32 = {new Option("Conversar", 33)};
		Option[] options33 = {new Option("Conversar", 33)};

		Dialog[] dialog = {
			new Dialog("Beeéhh! Ei, você! Amigo ou Inimigo?", options0),
			new Dialog("Bom! Ótimo!", options1),
			new Dialog("Sai daqui ou eu te dou uma chifrada!", options2),
			new Dialog("Você gosta de cabras?", options3),
			new Dialog("Ótimo! Ótimo! Cabras são maravilhosas", options4),
			new Dialog("Apartir de hoje você gosta de cabras!", options5),
			new Dialog("Cabras são perfeitas", options6),
			new Dialog("Cabras são divinas!", options7),
			new Dialog("Todos louvamos cabras aqui!", options8),
			new Dialog("Você concorda né?", options9),
			new Dialog("Beéhh! Ótimo!", options10),
			new Dialog("Já ouviu falar da malvada Isabeu?", options11),
			new Dialog("Ela não gosta de cabras, ela odeia cabras!", options12),
			new Dialog("Nosso reino precisa acabar com essa tirania!", options13),
			new Dialog("Mas pra isso, preciso de mais gente armada, mais exercito", options14),
			new Dialog("Você pode mandar mais algumas pessoas pro nosso reino para nos ajudar?", options15),
			new Dialog("Beeéhh! Muito obrigado!", options16),
			new Dialog("Beeéhh! Tudo bem!", options17),
			new Dialog("Sabe... Todo mundo acha que eu sou um veio loco", options18),
			new Dialog("Por isso não tem muita gente morando aqui", options19),
			new Dialog("Só por que eu enchergo beleza, perfeição e divindade nesses animais", options20),
			new Dialog("Eles tem seu jeito único de agir, de fazer sons, e isso é lindo", options21),
			new Dialog("Mas as pessoas estão ocupadas demais com suas conquista pra ver isso", options22),
			new Dialog("Tão ocupadas demais com suas vidas repetitivas e chatas", options23),
			new Dialog("Enfim, é meió se preparar", options24),
			new Dialog("Falta pouquin pra guerra... ", options25),
			new Dialog("Já que eles querer fazer isso eu não posso ficar parado", options26),
			new Dialog("Temo que se prepara!", options27),
			new Dialog("Você tem alguns recursos pra doar pra gente?", options28),
			new Dialog("Brigado!", options29),
			new Dialog("Beéhh! Tudo bem!", options30),
			new Dialog("Você já ouviu falar do reino DêEsiTes", options31),
			new Dialog("Eles são uma turminha do balacobaco que mora aqui perto", options32),
			new Dialog("Você deveria ver eles!", options33),
		};
		this.dialogs = dialog;
		String[] e = {
			"Isabeu, a Guerreira das Nuvens"
		};
		this.enemies = e;

		String[] a = {
			"Sir Guilherme II"
		};
		this.alies = a;

		this.currentDialog = 0;
	}
}
