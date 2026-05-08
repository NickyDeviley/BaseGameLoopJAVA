package Entities.Player.States;

import java.util.List;

import Entities.Behaviors.Command;
import Entities.Behaviors.PlayerState;
import Entities.Player.Player;

public class WalkState implements PlayerState {

	public static final WalkState walkS = new WalkState();
	
	private WalkState() {}
	
	@Override
	public void handleCommands(Player player, List<Command> commands) {
		
		for (Command command : commands) {
			command.execute(player);
		}
		
		if (commands.isEmpty()) {
			player.setState(IdleState.idleS);
		}
		
	}

	@Override
	public void update(Player player) {}

	@Override
	public States getStateName() {
		return States.WALK;
	}

}
