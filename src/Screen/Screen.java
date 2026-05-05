package Screen;

import javax.swing.JFrame;


public class Screen extends JFrame {

	private Panel gamePainel;
	
	public Screen(String title, Panel gamePainel) {
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(gamePainel);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
}
