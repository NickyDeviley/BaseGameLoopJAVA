package Principal;

public class Config {

	// Public Nome do jogo
	public static final String nomeJogo = "Nome Temporário";
	
	// Caminho dos arquivos externos:
	public static final String ENTITIES_ASSET_PATH = "/Assets/EntitiesAssets/";
	public static final String TILES_ASSET_PATH = "/Assets/TilesAssets/";
	public static final String WORLDS_PATH = "/Worlds/";
	
	// Tamanho dos sprites
	public static final int ORIGINAL_TILE_SIZE = 32;
	public static final int SCALE = 2;
	public static final int TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE;
	
	// Configurações da tela
	public static final int QTD_TILES_X = 20;
	public static final int QTD_TILES_Y = 12;
	public static final int SCREEN_WIDTH = QTD_TILES_X * TILE_SIZE;		// 1280
	public static final int SCREEN_HEIGHT = QTD_TILES_Y * TILE_SIZE;	// 768
	
	
}
