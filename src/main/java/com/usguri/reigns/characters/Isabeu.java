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
public class Isabeu extends Person {

	public Isabeu() {
		this.name = "Isabeu, a Guerreira das Nuvens";
		this.minValueForAliance = 110;
		this.avatar = new Image("file:images/Person1.png");
		this.background = new Image("file:images/BG1.png");
		Option[] options0 = {new Option("Meu reino veio em paz", 10, 0, 0, 0, 1), new Option("Seu governo é mediocre", -10, 0, 0, 0, 12)};
		Option[] options1 = {new Option("Conversar", 2)};
		Option[] options2 = {new Option("Conversar", 3)};
		Option[] options3 = {new Option("Eu só cliquei no menu", 4), new Option("Na verdade foi bem rápido", 5)};
		Option[] options4 = {new Option("Conversar", 6)};
		Option[] options5 = {new Option("Conversar", 6)};
		Option[] options6 = {new Option("Conversar", 7)};
		Option[] options7 = {new Option("Conversar", 8)};
		Option[] options8 = {new Option("Conversar", 9)};
		Option[] options9 = {new Option("Doar recursos", 30, 0, 0, 0, 10), new Option("Entendo, infelizmente não posso ajudar", 5, 0, 0, 0, 11), new Option("Ótimo, agora posso expalhar isso", -10, 0, 0, 0, 12)};
		Option[] options10 = {new Option("Conversar", 13)};
		Option[] options11 = {new Option("Conversar", 13)};
		Option[] options12 = {};
		Option[] options13 = {new Option("Conversar", 14)};
		Option[] options14 = {new Option("Conversar", 15)};
		Option[] options15 = {new Option("Conversar", 16)};
		Option[] options16 = {new Option("Conversar", 17)};
		Option[] options17 = {new Option("Conversar", 18)};
		Option[] options18 = {new Option("Conversar", 19)};
		Option[] options19 = {new Option("Sim, é claro", 30, 0, 0, 0, 20), new Option("Que absurdo!", -5, 0, 0, 0, 21)};
		Option[] options20 = {new Option("Conversar", 22)};
		Option[] options21 = {new Option("Conversar", 22)};
		Option[] options22 = {new Option("Conversar", 23)};
		Option[] options23 = {new Option("Conversar", 24)};
		Option[] options24 = {new Option("Conversar", 25)};
		Option[] options25 = {new Option("Conversar", 26)};
		Option[] options26 = {new Option("Certo, nisso reino odeia bruxas", 40, 0, 0, 0, 27), new Option("Acho que ela não é uma bruxa", -10, 0, 0, 0, 26)};
		Option[] options27 = {new Option("Conversar", 28)};
		Option[] options28 = {new Option("Conversar", 29)};
		Option[] options29 = {new Option("Conversar", 30)};
		Option[] options30 = {new Option("Conversar", 31)};
		Option[] options31 = {new Option("Doar recursos", 60, 0, 0, 0, 32), new Option("Não posso doar nada, mas estarei ao seu lado", 30, 0, 0, 0, 33)};
		Option[] options32 = {};
		Option[] options33 = {};
		Dialog[] dialog = {
			new Dialog("Quem ousa importunar meu reino?", options0),
			new Dialog("Ótimo, não quero mais problemas", options1),
			new Dialog("Meu nome é Isabeu, sou a lider do Reino das Nuvens", options2),
			new Dialog("Você deve ter vindo de muito distante para cá não é?", options3),
			new Dialog("'Clicar no menu?... Oh, você deve ter achado um mapa para cá", options4),
			new Dialog("Oh, estranho, nosso reino é de difícil acesso por habitarmos uma montanha", options5),
			new Dialog("É muito difícil gerenciar um reino em um lugar tão isolado", options6),
			new Dialog("A vantagem é que temos uma ótima visão estratégica contra nossos inimigos", options7),
			new Dialog("A desvantagem é que possuimos poucos recursos aqui ", options8),
			new Dialog("Estaria disposto a doar alguns? ", options9),
			new Dialog("Nossa eterna gratidão! ", options10),
			new Dialog("Tudo bem, sem problemas... ", options11),
			new Dialog("Seu bastardo! Não fale mais comigo seu porco imundo!", options12),
			new Dialog("Você já ouviu falar sobre 'Vicent Vangoat'?", options13),
			new Dialog("Então você já deve ter reparado em seus fascinios doentios por cabras", options14),
			new Dialog("Ele é um homem louco com fascinio por cabras", options15),
			new Dialog("Não consigo entender por que há tanta gente que apoia este maluco", options16),
			new Dialog("E por que justo cabras? São animais tão nojentos...", options17),
			new Dialog("Seu único propósito são para serem ordenhados e depois devorados no jantar", options18),
			new Dialog("Não concorda?", options19),
			new Dialog("Haha! é claro que concorda.", options20),
			new Dialog("Eu não consigo lhe entender... Mas ok", options21),
			new Dialog("Aliás, outra pessoa que recomendo evitar é 'Elisabet Frogin'", options22),
			new Dialog("... Até seu sobrenome é despresível...", options23),
			new Dialog(".Ela é uma terrível bruxa que conversa com sapos", options24),
			new Dialog("Antigamente ela era uma cidadã do meu reino, antes de ser banida", options25),
			new Dialog("Caso ver ela, não fale com ela ok?", options26),
			new Dialog("Gostei de você haha", options27),
			new Dialog("É claro que ela é! Ela conversa é asquerosa e conversa com sapos!", options28),
			new Dialog("A guerra está próxima, eu posso sentir", options29),
			new Dialog("Precisamos de mais recursos para nos preparar", options30),
			new Dialog("Você irá nos ajudar?", options31),
			new Dialog("Obrigado, vamos ajudar vocês no que for possível", options32),
			new Dialog("Obrigado, vamos avaliar a proposta", options33),
		};
		
		this.dialogs = dialog;
		String[] e = {
			"Vincent Vangoat, o Maluco das Cabras"
		};
		this.enemies = e;

		String[] a = {
			"Cavaleiro"
		};
		this.alies = a;

		this.currentDialog = 0;
	}
}
