package Principal;

public class Config {

	// Public Nome do jogo
	public static final String nomeJogo = "Nome Temporário";
	
	// Caminho dos arquivos externos:
	public static final String ENTITIES_ASSET_PATH = "/Assets/EntitiesAssets/";
	public static final String TILES_ASSET_PATH = "/Assets/TilesAssets/";
	public static final String TILES_INFO_PATH = "/Assets/TilesAssets/TilesInfo.txt";
	public static final String WORLDS_PATH = "/Worlds/";
	
	// Tamanho dos sprites
	public static final int ORIGINAL_TILE_SIZE = 16;
	public static final int SCALE = 4;
	public static final int TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE;
	
	// Tamanho da SpriteSheet
	public static final int SPRITESHEET_WIDTH = 112;
	public static final int SPRITESHEET_HEIGHT = 80;
	public static final int SPRITESHEET_WIDTH_SIZE = SPRITESHEET_WIDTH * SCALE; 
	public static final int SPRITESHEET_HEIGHT_SIZE = SPRITESHEET_HEIGHT * SCALE;
	
	// Configurações da tela
	public static final int QTD_TILES_X = 20;
	public static final int QTD_TILES_Y = 12;
	public static final int SCREEN_WIDTH = QTD_TILES_X * TILE_SIZE;		// 1280
	public static final int SCREEN_HEIGHT = QTD_TILES_Y * TILE_SIZE;	// 768
	
	
}
