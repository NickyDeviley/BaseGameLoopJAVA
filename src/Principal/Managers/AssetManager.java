package Principal.Managers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Util.Input.AssetInput;
import Entities.Behaviors.PlayerState;
//import Tiles.Tile;

public class AssetManager {
	/**
		O AssetManager é responsável por gerenciar os
		assets de todo o jogo. Cada tile ou entidade
		precisa pedir acesso aos sprites nessa classe.
		
		Para as entidades, cada uma possuí seu próprio
		Map que contém listas de cada Sprite de animação.
		Então, o personagem está parado, andando, etc. Dentro
		do Map há uma lista com a animação específica
		para essa ação.
	*/

// MAPS
	// Jogador
	private BufferedImage playerSpriteSheet;

	// Inimigos
	
	// NPCs
	
	// Animais
	
	// Tiles
	private BufferedImage tilesSheet;

// Objetos
	private AssetInput assetI;

	// Construtor
	public AssetManager(AssetInput assetI) {
		
		// Carregando a spritesheet do jogador
		
		
		// Carregando os spritesheet do primeiro mapa
		this.assetI = assetI;
		//tilesSheet = assetI.tileSpriteSheet();
	}

// COMPORTAMENTOS
	
	
// GETTERS & SETTERS
	public BufferedImage getPlayerSpriteSheet() { return playerSpriteSheet; }
	//public void setPlayerSpriteSheet(BufferedImage playerSpriteSheet) { this.playerSpriteSheet = playerSpriteSheet; }
	public BufferedImage getTilesSheet() { return tilesSheet; }
	
}
