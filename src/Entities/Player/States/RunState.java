package Entities.Player.States;

import java.util.List;

import Entities.Behaviors.PlayerState;
import Entities.Player.Player;
import Principal.Commands.Command;
import Principal.Commands.Player.RunCommand;
import Principal.Commands.Player.WalkCommand;

public class RunState implements PlayerState {
	/**
		Um dos estados que o jogador pode ficar.
		Essa classe representa o estado -CORRENDO-
	*/
	
	public static final RunState runS = new RunState();
	
	public RunState() {}
	
	@Override
	public void handleCommands(Player player, List<Command> commands) {
		
		player.setActualSpeed(player.getRunningSpeed());
		
		for (Command command : commands) {
			command.execute(player);			
		}
		
		if (commands.isEmpty()) {
			player.setState(IdleState.idleS);
		}
		else if (!player.getIsRunning()) {
			player.setState(WalkState.walkS);
		}
	}

	@Override
	public void update(Player player) {}

	@Override
	public States getStateName() {
		return States.RUN;
	}	
}
