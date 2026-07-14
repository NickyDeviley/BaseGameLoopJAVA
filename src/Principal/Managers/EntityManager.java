package Principal.Managers;

import java.awt.Graphics2D;
import java.util.List;

import Entities.Player.Player;
import Principal.Config;
import Principal.Commands.Command;
import Util.Input.AssetInput;
import Util.Input.KeyboardInput;

public class EntityManager {
	/**
		A classe EntityManager é responsável por gerenciar todas
		as entidades do jogo. Jogador, NPC, criatura, monstros e chefes,
		todas as entidades são instanciadas, gerenciadas e deletadas a 
		partir dessa classe.
	*/
	
	// Variáveis
	private int screenWidth;
	private int screenHeight;
	
	// Objeto jogador
	private Player Jogador;
	
	
	// Construtor
	public EntityManager(KeyboardInput keyboardI) {
		
		this.screenWidth = Config.SCREEN_WIDTH;
		this.screenHeight = Config.SCREEN_HEIGHT;
		
		this.Jogador = new Player(Config.nomeJogo, this.screenWidth, this.screenHeight, keyboardI);
		
	}
	
	// Calcula a lógica de todas as entidades
	public void updateLogic(List<Command> commands) {
		
	// DEBUG
		//System.out.println("Chamou o updateLogic!");
		//for (Command c : commands) { System.out.println(c); }
		
		this.Jogador.update(commands);
		
	}
	
	public void draw(Graphics2D g2) {
		
		this.Jogador.drawSprites(g2);
		
	}
	
// GETTERS & SETTERS
	public Player getPlayer() { return this.Jogador; }
	
}
