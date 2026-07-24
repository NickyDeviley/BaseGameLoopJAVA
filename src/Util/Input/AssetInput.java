package Util.Input;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import Principal.Config;
import Util.RedimensionTool;

public class AssetInput {

	RedimensionTool utilityT;
	
	public AssetInput() {
		
		utilityT = new RedimensionTool();
		
	}
	
	public BufferedImage tileSpriteSheet() {
		
		BufferedImage tileSheet = null;
		
		try {
			
			// Recebe a spriteSheet com todos os Tiles de um mapa específico
			BufferedImage originalTileSheet = ImageIO.read(getClass().getResourceAsStream(Config.TILES_ASSET_PATH + "TileSet.png"));
			
			// Redimensiona a imagem para ela ficar na escala correta
			tileSheet = utilityT.scaleImage(originalTileSheet, Config.SPRITESHEET_WIDTH_SIZE, Config.SPRITESHEET_HEIGHT_SIZE);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return tileSheet;
		
	}
	
}
