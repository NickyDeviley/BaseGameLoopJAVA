package Entities.Player;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

import Entities.Entity;
import Entities.Behaviors.Atingivel;
import Entities.Behaviors.Direction;
import Entities.Behaviors.PlayerState;
import Entities.Player.States.IdleState;
import Entities.Player.States.RunState;
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
	private int walkingS;
	private int runningS;
	
	private boolean isRunning;
	
	// Objetos
	private PlayerState state;
	
	// Construtor
	public Player(String nome, int screenWidth, int screenHeight) {
		super(nome);
		
		// Variáveis
		this.walkingS = 2;
		this.runningS = 5;
		
		this.isRunning = false;
		
		this.actualSpeed = walkingS;
		

		
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
		this.setIsRunning(false);
		
		List<Command> commands = input;				// Recebe os inputs
		
		this.state.handleCommands(this, commands);	// Delega o controle dos comandos para o estado atual
		//this.state.update(this);					// Atualiza a lógica interna do estado
		
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
		
		// Movimentando o jogador pelo mundo
		this.setWorldPosX(this.getWorldPosX() + (direction.x * this.getActualSpeed()));
		this.setWorldPosY(this.getWorldPosY() + (direction.y * this.getActualSpeed()));
		
		// Movimentando o jogador pela tela
		//this.setScreenPosX(this.getScreenPosX() + (direction.x * this.getSpeed()));
		//this.setScreenPosY(this.getScreenPosY() + (direction.y * this.getSpeed()));
		
		this.setDirection(direction);
		
	}

	
// GETTERS & SETTERS
	public PlayerState getState() { return state; }
	public void setState(PlayerState state) { this.state = state; }
	
	public States getStateName() { return this.state.getStateName(); }
	
	public int getWalkingSpeed() { return this.walkingS; }
	public int getRunningSpeed() { return this.runningS; }
	
	public boolean getIsRunning() { return this.isRunning; }
	public void setIsRunning(boolean isRunning) { this.isRunning = isRunning; }
	
	public int getScreenPosX() { return screenPosX; }
	public void setScreenPosX(int screenPosX) { this.screenPosX = screenPosX; }

	public int getScreenPosY() { return screenPosY; }
	public void setScreenPosY(int screenPosY) { this.screenPosY = screenPosY; }
	
	
	
}
