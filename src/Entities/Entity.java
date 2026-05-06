package Entities;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import Util.Input.AssetInput;

public abstract class Entity {
	
// ATRIBUTOS
	protected String nome;
	protected int vida;
	
	protected int worldPosX;
	protected int worldPosY;
	
	protected String nomeSprites;
	
// OBJETOS
	protected List<BufferedImage> Sprites;
	protected AssetInput assetInput;
	
	// Construtor
	public Entity(String nome, AssetInput assetInput) {
		
		// Atributos
		this.nome = nome;
		
		// lista de Sprites
		Sprites = new ArrayList<>();
		
		// AssetManager
		this.assetInput = assetInput;
		
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

	public int getWorldPosX() { return worldPosX; }
	public void setWorldPosX(int worldPosX) { this.worldPosX = worldPosX; }

	public int getWorldPosY() { return worldPosY; }
	public void setWorldPosY(int worldPosY) { this.worldPosY = worldPosY; }

	public String getNomeSprites() { return nomeSprites; }
	public void setNomeSprites(String nomeSprites) { this.nomeSprites = nomeSprites; }

	public List<BufferedImage> getSprites() { return Sprites; }
	public void setSprites(List<BufferedImage> sprites) { Sprites = sprites; }
	
}
