package Principal.Managers;

import java.awt.Graphics2D;
import java.util.List;

import Principal.Config;
import Util.Input.WorldInput;

public class WorldManager {

	private WorldInput worldI;
	
	private AssetManager assetM;
	
	private List<Integer> world;
	
	public WorldManager(WorldInput worldI, AssetManager assetM) {
		
		this.worldI = worldI;
		this.assetM = assetM;
		this.world = worldI.carregarMundo();
		
	}
	
	public void drawWorld(Graphics2D g2) {
	    int x = 0;
	    int y = 0;
	    int index = 0; // Usamos um índice para percorrer a lista 'world'

	    for (int i = 0; i < Config.QTD_TILES_Y; i++) {
	        for (int j = 0; j < Config.QTD_TILES_X; j++) {
	            
	            // Verificamos se ainda temos dados na lista para evitar erro de índice
	            if (index < world.size()) {
	                int tileID = world.get(index);
	                
	                // Desenha apenas o tile correspondente àquela posição
	                g2.drawImage(assetM.getTiles().get(tileID), x, y, null);
	                
	                index++; // Move para o próximo número da lista
	            }
	            
	            x += Config.TILE_SIZE;
	        }
	        y += Config.TILE_SIZE;
	        x = 0; // Reseta o X para o início da linha
	    }
	}
	
	/*
	public void drawWorld(Graphics2D g2) {
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < Config.QTD_TILES_Y; i++) {
			
			for (int j = 0; j < Config.QTD_TILES_X; j++) {
				
				for (int w : world) { 
					g2.drawImage(assetM.getTiles().get(w), null, x, y);
				}
				
				x += Config.TILE_SIZE;
			}
			y += Config.TILE_SIZE;
			x *= 0;
		}
		
	}
	*/
}
