package Entities.Behaviors;

import java.util.List;

import Entities.Player.Player;
import Entities.Player.States.States;

public interface PlayerState {

	void handleCommands(Player player, List<Command> commands);
	void update(Player player);
	States getStateName();
}
