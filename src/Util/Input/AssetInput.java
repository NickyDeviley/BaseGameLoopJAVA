package Util.Input;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import Principal.Config;
import Tiles.Tile;
import Util.UtilityTools;
import Entities.Behaviors.PlayerState;
import Entities.Player.States.States;

public class AssetInput {
	/**
		Classe que lê as imagens e armazena dentro de listas em maps,
		ela então retorna as listas para seus devidos objetos para
		que os Assets sejam instanciados na memória apenas uma vez.
		
		Player, inimigos, cenários, NPCs, Animais
	*/
	

// OBJETOS
	private UtilityTools utilityT;
	
	// Construtor
	public AssetInput() {
		
		this.utilityT = new UtilityTools();
		
	}

	public Map<PlayerState, List<BufferedImage>> carregarSpritesJogador() {
		
		// Map que é retornado
		Map<PlayerState, List<BufferedImage>> playerAnimations = new HashMap<>();

		try {	
			
			// Lendo Imagem
			BufferedImage originalImage = ImageIO.read(getClass().getResourceAsStream("/Assets/EntitiesAssets/Player/Player.png"));
			
			// Redimensionando a imagem
			BufferedImage image = utilityT.scaleImage(originalImage, Config.TILE_SIZE, Config.TILE_SIZE);

			
		}
		catch (IOException e) {
			System.out.println("Ocorreu um erro ao carregar os arquivos do player!");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		
		return playerAnimations;
		
	}
	
	public void carregarSpritesEntities(String nomeEntidade, String nomeImagens) {
		
		//Map<State, List<BufferedImage>> entidade = new HashMap();
		
		// Carrega todos os Sprites de uma entidade
		try {
			
			BufferedImage originalImage = ImageIO.read(getClass().getResourceAsStream(Config.ENTITIES_ASSET_PATH + nomeEntidade + "/" + nomeEntidade + ".png"));
			
			
			// Redimensionando a imagem
			BufferedImage image = utilityT.scaleImage(originalImage, Config.TILE_SIZE, Config.TILE_SIZE);
			
//			this.playerSprites.add(image);

		}
		catch (IOException e) {
			
			System.out.println("Ocorreu um erro ao carregar os arquivos " + nomeEntidade + "!");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}	
	}
	
	public List<BufferedImage> carregarTiles() {
		
		List<BufferedImage> tiles = new ArrayList<>();
		
		try {
			
			BufferedImage Arvore = ImageIO.read(getClass().getResourceAsStream(Config.TILES_ASSET_PATH + "PLACEHOLDERArvore.png"));
			BufferedImage Grama = ImageIO.read(getClass().getResourceAsStream(Config.TILES_ASSET_PATH + "PLACEHOLDERGrama.png"));
			BufferedImage AguaParada = ImageIO.read(getClass().getResourceAsStream(Config.TILES_ASSET_PATH + "PLACEHOLDERAguaParada.png"));
			BufferedImage EstradaTerra = ImageIO.read(getClass().getResourceAsStream(Config.TILES_ASSET_PATH + "PLACEHOLDEREstradaTerra.png"));
			BufferedImage Flores = ImageIO.read(getClass().getResourceAsStream(Config.TILES_ASSET_PATH + "PLACEHOLDERFlores.png"));
			BufferedImage Onda = ImageIO.read(getClass().getResourceAsStream(Config.TILES_ASSET_PATH + "PLACEHOLDEROnda.png"));
			BufferedImage Pedra = ImageIO.read(getClass().getResourceAsStream(Config.TILES_ASSET_PATH + "PLACEHOLDERPedra.png"));
			
			// Redimensionando a imagem
			BufferedImage ArvoreR = utilityT.scaleImage(Arvore, Config.TILE_SIZE, Config.TILE_SIZE);
			BufferedImage GramaR = utilityT.scaleImage(Grama, Config.TILE_SIZE, Config.TILE_SIZE);
			BufferedImage AguaParadaR = utilityT.scaleImage(AguaParada, Config.TILE_SIZE, Config.TILE_SIZE);
			BufferedImage EstradaTerraR = utilityT.scaleImage(EstradaTerra, Config.TILE_SIZE, Config.TILE_SIZE);
			BufferedImage FloresR = utilityT.scaleImage(Flores, Config.TILE_SIZE, Config.TILE_SIZE);
			BufferedImage OndaR = utilityT.scaleImage(Onda, Config.TILE_SIZE, Config.TILE_SIZE);
			BufferedImage PedraR = utilityT.scaleImage(Pedra, Config.TILE_SIZE, Config.TILE_SIZE);
			
			tiles.add(GramaR);
			tiles.add(ArvoreR);
			tiles.add(AguaParadaR);
			tiles.add(EstradaTerraR);
			tiles.add(FloresR);
			tiles.add(OndaR);
			tiles.add(PedraR);
		}
		catch (IOException e) {
			
			//System.out.println("Ocorreu um erro ao carregar os arquivos " + nomeTile + "!");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}	
		
		return tiles;
		
	}
	
}
