package Screen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel extends JPanel {

	// Constantes
	private final int SCREENWIDTH = 1280;
	private final int SCREENHEIGHT = 720;
	
	public Panel() {
		
		// Gerando a janela
		this.setScreenSize();				// Método que determina o tamanho da janela
		this.setBackground(Color.BLACK);	// Método que pinta o fundo de preto
		this.setFocusable(true);			// Método que torna a janela o "alvo" das entradas do jogador
		this.setDoubleBuffered(true);		// Método que impede a janela de piscar
		//this.addKeyListener(null);
		
		//this.setVisible(true);				// Método que torna a janela visível
		
	}
	
	// Método que une todos os desenhos do jogo
	// Tudo que for desenhado no jogo passa por aqui
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.dispose();
	}
	
	// Método que determina os tamanhos da janela
	private void setScreenSize() {
		Dimension size = new Dimension(this.SCREENWIDTH, this.SCREENHEIGHT);
		this.setMinimumSize(size);
		this.setPreferredSize(size);
		this.setMaximumSize(size);
	}
}
