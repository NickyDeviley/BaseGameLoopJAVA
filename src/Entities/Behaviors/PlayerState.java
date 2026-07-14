package Entities.Behaviors;

import java.util.List;

import Entities.Player.Player;
import Entities.Player.States.States;
import Principal.Commands.Command;

public interface PlayerState {
	/**
		Interface utilizada para gerenciar o estado atual do jogador,
		identificar quais comandos estão sendo enviados e executá-los.
	*/
	
	void handleCommands(Player player, List<Command> commands);
	void update(Player player);
	States getStateName();
}
