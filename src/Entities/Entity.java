package Entities;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import Entities.Behaviors.Direction;

public abstract class Entity {
	/**
		Classe abstrata que é herdada por todas as entidades do jogo.
		As entidades são qualquer criatura, NPC e até o jogador, qualquer
		coisa que possua uma barra de vida e possa se movimentar.
	*/
	
	
// ATRIBUTOS
	protected String nome;
	protected int vida;
	protected int actualSpeed;
	protected Direction direction;
	
	protected int worldPosX;
	protected int worldPosY;
	
// OBJETOS
	
	// Construtor
	public Entity(String nome) {
		
		// Atributos
		this.nome = nome;
		this.direction = Direction.DOWN;
		
	}
	
// COMPORTAMENTOS
	
	
// COMPORTAMENTOS ABSTRATOS
	public abstract void drawSprites(Graphics2D g2);
	
// FUNCIONALIDADES
	public abstract void movement(Direction direction);

// GETTERS & SETTERS
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public int getVida() { return vida; }
	public void setVida(int vida) { this.vida = vida; }

	public int getActualSpeed() { return this.actualSpeed; }
	public void setActualSpeed(int newSpeed) { this.actualSpeed = newSpeed; }
	
	public Direction getDirection() { return this.direction; }
	public void setDirection(Direction direction) { this.direction = direction; }
	
	public int getWorldPosX() { return worldPosX; }
	public void setWorldPosX(int worldPosX) { this.worldPosX = worldPosX; }

	public int getWorldPosY() { return worldPosY; }
	public void setWorldPosY(int worldPosY) { this.worldPosY = worldPosY; }
	
	
}
