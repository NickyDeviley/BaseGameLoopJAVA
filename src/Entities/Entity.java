package Entities;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import Entities.Behaviors.Direction;
import Util.Input.AssetInput;

public abstract class Entity {
	
// ATRIBUTOS
	protected String nome;
	protected int vida;
	protected int speed;
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
	

// GETTERS & SETTERS
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public int getVida() { return vida; }
	public void setVida(int vida) { this.vida = vida; }

	public int getSpeed() { return speed; }
	public void setSpeed(int speed) { this.speed = speed; }
	
	public Direction getDirection() { return this.direction; }
	public void setDirection(Direction direction) { this.direction = direction; }
	
	public int getWorldPosX() { return worldPosX; }
	public void setWorldPosX(int worldPosX) { this.worldPosX = worldPosX; }

	public int getWorldPosY() { return worldPosY; }
	public void setWorldPosY(int worldPosY) { this.worldPosY = worldPosY; }
	
	
}
