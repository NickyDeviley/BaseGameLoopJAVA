package Entities.Player.States;

import java.util.List;

import Entities.Behaviors.PlayerState;
import Entities.Player.Player;
import Principal.Commands.Command;

public class IdleState implements PlayerState {
	/**
	 	Um dos estados que o jogador pode ficar.
	 	Essa classe representa o estado -PARADO-
	*/
	
	public static final IdleState idleS = new IdleState();
	
	private IdleState() {}
	
	@Override
	public void handleCommands(Player player, List<Command> commands) {
		// Idle Permite qualquer comando
		for (Command command : commands) {
			command.execute(player);
		}
		
	}

	@Override
	public void update(Player player) {
		
		// Se nenhum comando foi dado no frame anterior, permanece Idle.
		// A transição para outros estados é feita pelos próprios commands.
		
	}

	@Override
	public States getStateName() {
		return States.IDLE;
	}

}
