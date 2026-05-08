package Util.Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Entities.Behaviors.Command;
import Entities.Behaviors.Direction;
import Entities.Player.Commands.Walk.WalkCommand;

public class KeyboardInput implements KeyListener {

	private Map<Integer, Command> keyBindings = new HashMap<>();
	private boolean[] keys = new boolean[256];
	
	public KeyboardInput() {
		
		// Interligando os objetos das teclas com uma classe de movimento
		
// MOVIMENTAÇÃO
		
	// WALK
		keyBindings.put(KeyEvent.VK_W, new WalkCommand(Direction.UP));
		keyBindings.put(KeyEvent.VK_S, new WalkCommand(Direction.DOWN));
		keyBindings.put(KeyEvent.VK_A, new WalkCommand(Direction.LEFT));
		keyBindings.put(KeyEvent.VK_D, new WalkCommand(Direction.RIGHT));
		
// UTIL
		
	// MENU
		
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() < 256) {
			keys[e.getKeyCode()] = true;	
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() < 256) {	
			keys[e.getKeyCode()] = false;
		}
	}

	// Retorna o comando se a tecla estiver pressionada
	public List<Command> getCommandForPressedKey() {
		List<Command> activeKeys = new ArrayList<>();
		for (Integer code : keyBindings.keySet()) {
			if (keys[code]) {
				activeKeys.add(keyBindings.get(code));
			}
		}
		return activeKeys;
	}
	
}
