package Principal.Managers;

import java.awt.Graphics2D;

import Entities.Player.Player;
import Principal.Config;
import Util.Input.AssetInput;
import Util.Input.KeyboardInput;

public class EntityManager {

	// Variáveis
	private int screenWidth;
	private int screenHeight;
	
	// Objeto jogador
	private Player Jogador;
	
	
	// Construtor
	public EntityManager(AssetInput assetInput, KeyboardInput keyboardI) {
		
		this.screenWidth = Config.SCREEN_WIDTH;
		this.screenHeight = Config.SCREEN_HEIGHT;
		
		this.Jogador = new Player(Config.nomeJogo, this.screenWidth, this.screenHeight, assetInput, keyboardI);
		
	}
	
	public void updateLogic() {}
	
	public void draw(Graphics2D g2) {
		
		this.Jogador.drawSprites(g2);
		
	}
	
}
