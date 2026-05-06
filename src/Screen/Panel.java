package Screen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import Principal.Config;
import Principal.Managers.EntityManager;

public class Panel extends JPanel {
		
// OBJETOS
	private EntityManager entityM;
	
	public Panel(EntityManager entityM) {
		
		// Referenciando o EntityManager
		this.entityM = entityM;
		
		// Gerando a janela
		this.setScreenSize(Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);	// Método que determina o tamanho da janela
		this.setBackground(Color.BLACK);				// Método que pinta o fundo de preto
		this.setFocusable(true);						// Método que torna a janela o "alvo" das entradas do jogador
		this.setDoubleBuffered(true);					// Método que impede a janela de piscar
		//this.addKeyListener(null);
		
	}
	
	// Método que une todos os desenhos do jogo
	// Tudo que for desenhado no jogo passa por aqui
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		/* CHAME OS MÉTODOS DE DESENHO ABAIXO DESTE COMENTARIO */
		
		this.entityM.draw(g2);		// Desenhando as entidades
		
		/* CHAME OS MÉTODOS DE DESENHO ACIMA DESTE COMENTARIO */
		
		g2.dispose();
	}
	
	// Método que determina os tamanhos da janela
	private void setScreenSize(int screenW, int screenH) {
		Dimension size = new Dimension(screenW, screenH);
		this.setMinimumSize(size);
		this.setPreferredSize(size);
		this.setMaximumSize(size);
	}
	
}
