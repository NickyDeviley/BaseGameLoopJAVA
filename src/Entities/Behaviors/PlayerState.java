package Entities.Behaviors;

import Entities.Player.Player;
import Util.Input.KeyboardInput;

public interface PlayerState {

	void handleInput(Player player, KeyboardInput keyH);
	void update(Player player);
	
}
