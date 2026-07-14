package Util.Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {
	
	// array que armazena qual tecla foi pressionada ou solta
	private boolean[] keys = new boolean[256];
	
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() < 256) {
			keys[e.getKeyCode()] = true;	
		}
		
	// DEBUG
		//System.out.println("Apertou a tecla");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() < 256) {	
			keys[e.getKeyCode()] = false;
		}
	}
	
// GETTERS & SETTERS
	public boolean[] getKeys() {
		return keys;
	}
	
}
