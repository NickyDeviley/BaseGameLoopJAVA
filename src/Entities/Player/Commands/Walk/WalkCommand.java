package Entities.Player.Commands.Walk;

import Entities.Entity;
import Entities.Behaviors.Command;
import Entities.Behaviors.Direction;
import Entities.Behaviors.PlayerState;
import Entities.Player.Player;
import Entities.Player.States.WalkState;

public class WalkCommand implements Command {

	private Direction direction;
	
	public WalkCommand(Direction direction) {
		
		this.direction = direction;
		
	}
	
	@Override
	public void execute(Player player) {
		
		if (!(player.getState() instanceof WalkState)) {
			player.setState(WalkState.walkS);
		}
		
		//player.setWorldPosY(player.getWorldPosY() + player.getSpeed());
		//player.setScreenPosY(player.getScreenPosY() + player.getSpeed());
		
		//player.setWorldPosX(player.getWorldPosX() + (this.direction.x * player.getSpeed()));
		//player.setWorldPosY(player.getWorldPosY() + (this.direction.y * player.getSpeed()));
		
		player.setDirection(direction);
		player.setScreenPosX(player.getScreenPosX() + (this.direction.x * player.getSpeed()));
		player.setScreenPosY(player.getScreenPosY() + (this.direction.y * player.getSpeed()));
		
	}

}