package Principal.Managers;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Entities.Behaviors.Direction;
import Entities.Player.Player;

import Principal.Commands.Command;
import Principal.Commands.Player.WalkCommand;
import Util.Input.KeyboardInput;

public class InputManager {
	/**
		Classe que instancia os objetos das teclas e gerencia
		o que cada tecla faz, além de permitir que o usuário 
		altere a tecla se desejado.
	*/
	
	
	// Map que contém todas as teclas possíveis e seus respectivos IDs
	private Map<Integer, Command> keyBindings = new HashMap<>();
	
	// Objeto que identifica as teclas pressionadas
	private KeyboardInput keyboardI;
	
	// Objeto Jogador para atualizar o movimento
	private Player jogador;
	
	public InputManager(KeyboardInput keyboardI, Player jogador) {
		
		// Injeção de dependência
		this.keyboardI = keyboardI;
		this.jogador = jogador;

		
	// Atribuindo o comando as teclas específicas
		
		// PLAYER COMMANDS
			// WALK
				keyBindings.put(KeyEvent.VK_W, new WalkCommand(Direction.UP));
				keyBindings.put(KeyEvent.VK_S, new WalkCommand(Direction.DOWN));
				keyBindings.put(KeyEvent.VK_A, new WalkCommand(Direction.LEFT));
				keyBindings.put(KeyEvent.VK_D, new WalkCommand(Direction.RIGHT));
				
			// RUN
			
			// ATTACK
				
			// INTERACT
				
		// UTIL
				
			// MENU
		
				
		// DEBUG	
			//System.out.println(KeyEvent.VK_W);
	}
	
	// Retorna o comando se a tecla estiver pressionada
	public List<Command> getCommandForPressedKey() {
		
	// DEBUG
		//System.out.println("Chamou as teclas pressionadas!");
		
		List<Command> activeKeys = new ArrayList<>();
		for (Integer code : keyBindings.keySet()) {
			if (keyboardI.getKeys()[code]) {
				activeKeys.add(keyBindings.get(code));
			}
		}
		return activeKeys;
	}
	
// GETTERS & SETTERS
	public Map<Integer, Command> getKeyBindings() {
		return keyBindings;
	}

}
