package Util.Input;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import Principal.Config;
import Util.UtilityTools;

public class AssetInput {

	UtilityTools utilityT;
	
	public AssetInput() {
		
		utilityT = new UtilityTools();
		
	}
	
	public BufferedImage tileSpriteSheet() {
		
		BufferedImage tileSheet = null;
		
		try {
			
			BufferedImage originalTileSheet = ImageIO.read(getClass().getResourceAsStream(Config.TILES_ASSET_PATH + "TileSet.png"));
			
			tileSheet = utilityT.scaleImage(originalTileSheet, Config.SPRITESHEET_WIDTH_SIZE, Config.SPRITESHEET_HEIGHT_SIZE);
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return tileSheet;
		
	}
	
}
