package Principal.Managers;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

import Entities.Player.Player;
import Principal.Config;
import Principal.Managers.AssetManager;
import Util.Input.AssetInput;
import Util.Input.WorldInput;

public class WorldManager {
	/**
	 	Classe que vai gerenciar o mundo.
	 	O arquivo TXT vai ser lido, e armazenado aqui dentro de uma matriz.
	 	Os tiles vão ser acessados e, através do ID serão posicionados na ordem.
	 	Os assets vão estar separados e serão gerenciados pelo AssetManager.
	*/
	
	// Dependências
	private WorldInput worldI;
	private Player player;
	
	// Mundo do jogo
	private int[][] world;
	
	// Construtor
	public WorldManager(WorldInput worldI, Player player) {
		
		this.player = player;
		
		this.worldI = worldI;
		this.world = worldI.carregarMundo();
		
	// DEBUG
		/* 
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(world[j][i]);
			}
			System.out.println("");
		}
		*/
	}
	
	public void draw(Graphics2D g2) {
		
		for (int i = 0; i < world[0].length; i++) {			// Altura do mapa
			for (int j = 0; j < world.length; j++) {		// Largura do mapa
				
				// CAMERA
				int tileWorldX = j * Config.TILE_SIZE;		// Criando uma posição X no mundo para o TILE baseado na quantidade de blocos no mapa
				int tileWorldY = i * Config.TILE_SIZE;		// Criando uma posição Y no mundo para o TILE baseado na quantidade de blocos no mapa
				
				int tileScreenX = tileWorldX - player.getWorldPosX() + player.getScreenPosX();	// Calcula a posição X que o tile precisa ser renderizado na tela
				int tileScreenY = tileWorldY - player.getWorldPosY() + player.getScreenPosY();	// Calcula a posição Y que o tile precisa ser renderizado na tela
				
				/*
					Para criar o movimento do jogador pelo mapa nós precisamos 
					determinar qual é a posição de cada bloco no próprio mapa.
					Após isso nós precisamos calcular onde, na tela, o bloco
					precisa ser desenhado, então nós fazemos o calculo:
					
					posição do bloco na tela = Posição do bloco no mundo - A posição do jogador no mundo + A posição do jogador na tela
					
					Nós criamos a sensação de movimento ao mudar a posição onde o tile
					é desenhado na tela a cada quadro usando a posição do jogador como
					referência.
					
				*/
				
				// CAMERA
				
				// Troca a cor do bloco dependendo o ID
				if (world[j][i] == 0) { g2.setColor(Color.GREEN); }
				if (world[j][i] == 1) { g2.setColor(Color.PINK); }
				if (world[j][i] == 2) { g2.setColor(Color.GRAY); }
				if (world[j][i] == 3) { g2.setColor(Color.BLUE); }
				
				// Só renderiza as coisas que estão dentro dos limites da janela
				if (tileScreenX > (-64) && tileScreenX < Config.SCREEN_WIDTH) {
					if (tileScreenY > (-64) && tileScreenY < Config.SCREEN_HEIGHT) {
						g2.fillRect(tileScreenX, tileScreenY, Config.TILE_SIZE, Config.TILE_SIZE);
					
						/*
							A lógica é, se o bloco está dentro da janela ele pode ser renderizado,
							se não estiver ele não é desenhado, com o objetivo de deixar o jogo
							mais leve evitando processamento desnecessário.
						*/
						
					}
				}
			}
		}
		
		
		
	}
	
	/*
    int x = 0;
    int y = 0;
    int index = 0; // Usamos um índice para percorrer a lista 'world'

    for (int i = 0; i < Config.QTD_TILES_Y; i++) {
        for (int j = 0; j < Config.QTD_TILES_X; j++) {
            
            // Verificamos se ainda temos dados na lista para evitar erro de índice
            if (index < world.size()) {
                int tileID = world.get(index);
                
                int animatedID = (tileID + aniIndex) % 4;
                
                // Desenha apenas o tile correspondente àquela posição
                g2.drawImage(assetM.getTiles().get(animatedID), x, y, null);
                
                index++; // Move para o próximo número da lista
            }
            
            x += Config.TILE_SIZE;
        }
        y += Config.TILE_SIZE;
        x = 0; // Reseta o X para o início da linha
    }

 */
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

