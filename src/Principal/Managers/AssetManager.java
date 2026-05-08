package Principal.Managers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Util.Input.AssetInput;
import Entities.Behaviors.PlayerState;
import Tiles.Tile;

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
	private Map<PlayerState, List<BufferedImage>> playerAnimations = new HashMap<>();

	// Inimigos
	
	// NPCs
	
	// Animais
	
	// Tiles
	//private Map<> Tiles = new HashMap();
	private List<BufferedImage> tiles = new ArrayList<>();

// Objetos
	private AssetInput assetI;

	// Construtor
	public AssetManager() {
		
		this.assetI = new AssetInput();
		this.tiles = this.assetI.carregarTiles();
		//this.assetI.carregarSpritesEntities(null, null);
		
	}
	
	
// GETTERS & SETTERS
	public Map<PlayerState, List<BufferedImage>> getPlayerAnimations() { return this.playerAnimations; }
	public List<BufferedImage> getTiles() { return this.tiles; }
	
}
