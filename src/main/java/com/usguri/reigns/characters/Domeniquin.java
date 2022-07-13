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
public class Domeniquin extends Person {

	public Domeniquin() {
		this.name = "Domeniquin, o Conquistador da Prata";
		this.minValueForAliance = 110;
		this.avatar = new Image("file:images/Person10.png");
		this.background = new Image("file:images/BG10.png");
		Option[] options0 = {
			new Option("O que vocês vendem aqui?", 1),
			new Option("Não, eu só queria conhecer o reino.", 10, 0,0,0, 19),
		};
		Option[] options1 = {
			new Option("Vocês só vendem objetos de prata?", 2),
			new Option("Isso parece lindo!", 20, 0, 0, 0, 16),
			new Option("Essas coisas não valem nada!", -20, 0, 0, 0, 17),
		};
		Option[] options2 = {
			new Option("Por que não? Vocês não se dão bem?", 3),
			new Option("O reino dele realmente parece muito mais bonito.", -10, 0, 0, 0, 13),
		};
		Option[] options3 = {
			new Option("Você está com inveja porque as pessoas gostam mais do reino dele do que o seu!", -20, 0, 0, 0, 4),
			new Option("Eu pensei que vocês se ajudassem.", 6),
			new Option("Isso é horrivel. E você não faz nada?", 20, 0, 0, 0, 10),
		};
		Option[] options4 = {
			new Option("Deve ser coisa de família...", -10, 0, 0, 0, 5),
			new Option("Se você diz...", 9),
		};
		Option[] options5 = {new Option("Não é nada. Eu já deveria ir embora.", 5)};
		Option[] options6 = {
			new Option("Talvez vocês ddois devessem ceder um pouco.", 7),
			new Option("Ele parece mesmo ser bastante egocêntrico.",20,0,0,0, 8),
		};
		Option[] options7 = {
			new Option("Bom, para mim a sua opinião importa.", 20,0,0,0, 11),
			new Option("Talvez ele não seja tão ruim como você pensa...", -20,0,0,0, 12),
		};
		Option[] options8 = {
			new Option("Claro que são mais baratas, essas coisas são horriveis!", -20,0,0,0,14),
			new Option("É, talvez suas mercadorias tenham o seu valor também. Beleza não é tudo, não é mesmo?",20,0,0,0, 15),
		};
		Option[] options9 = {
			new Option("Desculpe, não foi a minha intenção.", 18),
			new Option("Não é minha culpa se seu reino usa sucata como mercadorias.", -20, 0, 0, 0, 14),
		};
		Option[] options10 = {new Option("Por que não?", 21)};
		Option[] options11 = {new Option("O reino dele realmente parece muito mais bonito.", -30, 0, 0, 0, 13)};
		Dialog[] d = {
			new Dialog("Olá. seja bem-vindo a Silvermine! Você gostaria de ver as nossas mercadorias?", options0),
			new Dialog("Nós temos de tudo! Armas de prata, moedas de prata, joias de prata, talheres de prata, ferramentas de prata...", options1),
			new Dialog("Na verdade sim. Se você quiser ver coisas de ouro terá que visitar o meu irmão, Domenico. Mas eu não faria isso se fosse você...", options2),
			new Dialog("É uma longa história. Ele sempre quis ser melhor do que eu em tudo. Essa mina de ouro é só mais uma prova disso.", options3),
			new Dialog("Eu? Com inveja do Domenico? Tenha dó! Ele não passa de uma criança mimada e carente de atenção!", options4),
			new Dialog("O que você quer dizer com isso?!", options5),
			new Dialog("É impossivel colaborar com ele. Tudo o que ele quer é chamar atenção.", options6),
			new Dialog("Isso não vai acontecer. Essa história é antiga demais para voltar atrás", temp),
			new Dialog("E é mesmo! Obrigado por notar isso.", temp),
			new Dialog("Enfim, você pode ir agora. Eu tenho coisas para fazer.", temp),
			new Dialog("O que eu posso fazer? Todos sempre escutam ele. Ninguém vai dar ouvidos para a minha opinião", temp),
			new Dialog("Muito obrigado! Isso significa muito para mim.", temp),
			new Dialog("Você é só mais um que caiu no jogo dele! Por favor, saia do meu reino.", temp),
			new Dialog("Não é bem assim. As coisas que produzimos aqui são otimas! Além de serem muito mais baratas.", temp),
			new Dialog("Se você veio aqui apenas para depreciar o meu reino, já pode ir embora, pode ir embora!", temp),
			new Dialog("Exatamente! Finalmente alguém que me entende. Muito obrigado!", temp),
			new Dialog("E é mesmo! É dificil encontrar alguém que saiba apreciar essas belezas como eu!", temp),
			new Dialog("Como ousa me insultar dessa forma!", temp),
			new Dialog("Apenas saia do meu reino. Não temos mais o que conversar.", temp),
			new Dialog("Oh, isso é ótimo! Nós não recebemos muitas visitas por aqui.", temp),
			new Dialog("É o que eu sempre digo, mas ninguém me escuta. É bom finalmente encontrar alguém que me entenda.", temp),
			new Dialog("Todos sempre preferiam visitar o reino do meu irmão, Domenio. Ele minera ouro e nós prata, é dificil competir.", temp),
		};
		this.dialogs = d;
		String[] e = {
			"Domenico, o Conquistador do Ouro"
		};
		this.enemies = e;

		String[] a = {};
		this.alies = a;

		this.currentDialog = 0;
	}
}
