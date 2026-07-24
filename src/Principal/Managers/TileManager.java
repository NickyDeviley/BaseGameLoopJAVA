package Principal.Managers;

import java.util.ArrayList;
import java.util.List;

import Tiles.Tile;
import Tiles.TileBehaviors.TileBehavior;
import Util.Input.AssetInput;
import Util.Input.TileInput;

public class TileManager {
	/**
		A classe TileManager instancia, armazena e gerencia todos os tiles
		que serão utilizados no jogo.
	*/
	
	// List que armazena os tiles
	private List<Tile> tilesFromActualMap;
	private List<Tile> tilesFromNextMap;
	
	// Dependências
	private AssetInput assetI;
	private TileInput tileI;
	
	// Construtor
	public TileManager(AssetInput assetI, TileInput tileI) {
		
		/*
			Vai carregar os tiles do map1
			vai armazenar na lista e chamar o worldManager para renderizar
		*/
		
		// Injeção de dependências
		this.assetI = assetI;
		this.tileI = tileI;
		
		// Iniciando as listas
		tilesFromActualMap = new ArrayList<>();		// Armazena os tiles do mapa atual
		tilesFromNextMap = new ArrayList<>();		// Armazena os tiles do próximo mapa
	}
	
	private void creatingTiles() {
		
		// Usa um laço for para instanciar vários blocos
		// Ele junta as informações de cada Tile do TileInput
		// com as imagens para formar o Tile que será utilizado
		
	}
	
	public TileBehavior getTileBehavior() {
		
		
		
		return null;
		
	}
	
}
