package Util.Input;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import Util.UtilityTools;

public class AssetInput {
	/**
		Classe que lê as imagens e armazena dentro de listas em maps,
		ela então retorna as listas para seus devidos objetos para
		que os Assets sejam instanciados na memória apenas uma vez.
		
		Player, inimigos, cenários, NPCs, Animais
	*/
	
// MAPS
	private Map<Integer, ArrayList<BufferedImage>> enemySprites = new HashMap<>();
	private Map<Integer, ArrayList<BufferedImage>> cenarioSprites = new HashMap<>();
	private Map<Integer, ArrayList<BufferedImage>> NPCSprites = new HashMap<>();
	private List<BufferedImage> playerSprites = new ArrayList<>();
	
// OBJETOS
	private UtilityTools utilityT;
	
	// Construtor
	public AssetInput() {
		
		this.utilityT = new UtilityTools();
		
	}
	
	
	public void carregarSpritesInimigos(String caminhoImagens) {
		
		// Implementação do método que lê todas as imagens em uma pasta e armazena no map
		
	}
	
	public void carregarSpritesCenarios(String caminhoImagens) {
		
		// Implementação do método que lê todas as imagens em uma pasta e armazena no map
		
	}
	
	public void carregarSpritesNPC(String caminhoImagens) {
		
		// Implementação do método que lê todas as imagens em uma pasta e armazena no map
	}
	
	public void carregarSpritesPlayer(String nomeImagens, int width, int height) {
		
		// Implementação do método que lê todas as imagens em uma pasta e armazena no map
		try {
			
			BufferedImage originalImage = ImageIO.read(getClass().getResourceAsStream("/Assets/EntitiesAssets/PlayerAssets/" + nomeImagens + ".png"));
			BufferedImage image = utilityT.scaleImage(originalImage, width, height);
			
			this.playerSprites.add(image);
//			this.playerSprites.add(ImageIO.read(getClass().getResourceAsStream("/Assets/EntitiesAssets/PlayerAssets/" + nomeImagens + ".png")));
			// Adicionando os sprites do player a lista
			// usamos a classe "ImageIO" e o método "read"
			// Nós convertemos a imagem para o tipo Stream 
			// com a classe object do java.
		}
		catch (IOException e) {
			
			System.out.println("Ocorreu um erro ao carregar os arquivos do player!");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		
	}

// GETTERS & SETTERS
	public Map<Integer, ArrayList<BufferedImage>> getEnemySprites() { return enemySprites; }

	public Map<Integer, ArrayList<BufferedImage>> getCenarioSprites() { return cenarioSprites; }

	public Map<Integer, ArrayList<BufferedImage>> getNPCSprites() { return NPCSprites; }

	public List<BufferedImage> getPlayerSprites() { return playerSprites; }
	
	
	
}
