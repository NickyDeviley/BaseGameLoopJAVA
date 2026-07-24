package Entities.Player.States;

import java.util.List;

import Entities.Behaviors.PlayerState;
import Entities.Player.Player;
import Principal.Commands.Command;
import Principal.Commands.Player.WalkCommand;

public class WalkState implements PlayerState {
	/**
	 	Um dos estados que o jogador pode ficar.
	 	Essa classe representa o estado -ANDANDO-
	*/
	
	public static final WalkState walkS = new WalkState();
	
	private WalkState() {}
	
	@Override
	public void handleCommands(Player player, List<Command> commands) {
		
		player.setActualSpeed(player.getWalkingSpeed());
		
		for (Command command : commands) {
			command.execute(player);
		}
		
		if (commands.isEmpty()) {
			player.setState(IdleState.idleS);
		}
		else if (player.getIsRunning()) {
			player.setState(RunState.runS);
		}
	}

	@Override
	public void update(Player player) {}

	@Override
	public States getStateName() {
		return States.WALK;
	}

}
