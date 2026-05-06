package Entities.Player;

import java.awt.Graphics2D;

import Entities.Entity;
import Entities.Behaviors.Atingivel;
import Entities.Behaviors.PlayerState;
import Entities.Player.States.IdleState;
import Principal.Config;
import Util.Input.AssetInput;
import Util.Input.KeyboardInput;

public class Player extends Entity implements Atingivel {

	// Variáveis
	private int screenPosX;
	private int screenPosY;
	
	// Objetos
	private PlayerState state;
	private KeyboardInput keyboardI;
	
	// Construtor
	public Player(String nome, int screenWidth, int screenHeight, AssetInput assetInput, KeyboardInput keyboardI) {
		super(nome, assetInput);
		
		// Referênciando os objetos
		this.keyboardI = keyboardI;
		
		// Calculando a posição do jogador na tela
		this.screenPosX = (screenWidth / 2) - (Config.TILE_SIZE / 2);
		this.screenPosY = (screenHeight / 2) - (Config.TILE_SIZE / 2);
		
		// Declarando o caminho dos Sprites e carregando eles
		this.nomeSprites = "PLACEHOLDERJogador";
		assetInput.carregarSpritesPlayer(this.nomeSprites, Config.TILE_SIZE, Config.TILE_SIZE);
		this.Sprites = assetInput.getPlayerSprites();
		
		// Inicia o movimento do protagonista parado
		this.state = new IdleState();
		
	}

// COMPORTAMENTOS
	public void update() {
		this.state.handleInput(this, this.keyboardI);
		this.state.update(this);
	}
	
// MÉTODOS SOBRESCRITOS
	@Override
	public void recebeDano(int danoRecebido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawSprites(Graphics2D g2) {
		// TODO Auto-generated method stub
		
		g2.drawImage(Sprites.get(0), null, screenPosX, screenPosY);
		
	}

// GETTERS & SETTERS
	public PlayerState getState() { return state; }
	public void setState(PlayerState state) { this.state = state; }

}
