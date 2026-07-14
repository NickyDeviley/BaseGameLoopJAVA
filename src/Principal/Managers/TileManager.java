package Principal.Managers;

import java.util.HashMap;
import java.util.Map;

import Tiles.Tile;

public class TileManager {
	/**
		A classe TileManager instancia, armazena e gerencia todos os tiles
		que serão utilizados no jogo.
	*/
	
	private static Map<Integer, Tile> tiles = new HashMap<>();
	
	public static void adicionarTile(Tile tile) {
		
		tiles.put(tile.getID(), tile);
	
	}
	
	public static Tile getTile(int ID) {
		
		Tile tile = tiles.get(ID);
		if (tile == null) {
			throw new IllegalArgumentException("ID não Existe!");
		}
		return tile;
		
	}
	
	
}
