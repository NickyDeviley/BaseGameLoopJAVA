package Entities.Player;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

import Entities.Entity;
import Entities.Behaviors.Atingivel;
import Entities.Behaviors.Direction;
import Entities.Behaviors.PlayerState;
import Entities.Player.States.IdleState;
import Entities.Player.States.States;
import Entities.Player.States.WalkState;
import Principal.Config;
import Principal.Commands.Command;
import Util.Input.KeyboardInput;

public class Player extends Entity implements Atingivel {
	/**
		Classe que representa o jogador.
	*/
	
	// Variáveis
	private int screenPosX;
	private int screenPosY;
	
	// Objetos
	private KeyboardInput keyboardI;
	private PlayerState state;
	
	// Construtor
	public Player(String nome, int screenWidth, int screenHeight, KeyboardInput keyboardI) {
		super(nome);
		
		// Variáveis
		this.speed = 1;
		
		// Referênciando os objetos
		this.keyboardI = keyboardI;
		
		// Calculando a posição do jogador na tela
		this.screenPosX = (screenWidth / 2) - (Config.TILE_SIZE / 2);
		this.screenPosY = (screenHeight / 2) - (Config.TILE_SIZE / 2);
		
		this.worldPosX = 0;
		this.worldPosY = 0;
		
		// Inicia o jogador em IDLE
		this.state = IdleState.idleS;
		
	}

// COMPORTAMENTOS
	public void update(List<Command> input) {
		List<Command> commands = input;
		
		/// Delega o controle dos comandos para o estado atual
		this.state.handleCommands(this, commands);
		
		// Atualiza a lógica interna do estado
		this.state.update(this);
		
	// DEBUG
		//System.out.println("State: " + this.state.getStateName());
		//System.out.println("WorldPosX: " + this.worldPosX + " WorldPosY: " + this.worldPosY);
		//System.out.println(this.direction);
		
	}
	
// MÉTODOS SOBRESCRITOS
	@Override
	public void recebeDano(int danoRecebido) {
		
	}

	@Override
	public void drawSprites(Graphics2D g2) {
		
		g2.setColor(Color.WHITE);
		g2.fillRect(screenPosX, screenPosY, Config.TILE_SIZE, Config.TILE_SIZE);
		//g2.drawImage(null, null, screenPosX, screenPosY);
		
	}

	@Override
	public void movement(Direction direction) {
		
		// Se o estado atual do jogador não é se mover
		// o estado atual é atualizado.
		if (!(this.getState() instanceof WalkState)) {
			this.setState(WalkState.walkS);
		}
		
		//player.setWorldPosY(player.getWorldPosY() + player.getSpeed());
		//player.setScreenPosY(player.getScreenPosY() + player.getSpeed());
		
		//player.setWorldPosX(player.getWorldPosX() + (this.direction.x * player.getSpeed()));
		//player.setWorldPosY(player.getWorldPosY() + (this.direction.y * player.getSpeed()));
		
		// Direciona a posição do jogador para o lado em que ele está se movimentando
		// E então move ele naquela direção.
		this.setDirection(direction);
		this.setScreenPosX(this.getScreenPosX() + (direction.x * this.getSpeed()));
		this.setScreenPosY(this.getScreenPosY() + (direction.y * this.getSpeed()));
		
		
	}

	
// GETTERS & SETTERS
	public PlayerState getState() { return state; }
	public void setState(PlayerState state) { this.state = state; }
	
	public States getStateName() { return this.state.getStateName(); }

	public int getScreenPosX() { return screenPosX; }
	public void setScreenPosX(int screenPosX) { this.screenPosX = screenPosX; }

	public int getScreenPosY() { return screenPosY; }
	public void setScreenPosY(int screenPosY) { this.screenPosY = screenPosY; }
	
	
	
}
