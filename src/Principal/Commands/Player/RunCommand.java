package Principal.Commands.Player;

import Entities.Behaviors.Direction;
import Entities.Player.Player;
import Principal.Commands.Command;

public class RunCommand implements Command {
	/**
		Classe que permite a corrida do jogador;
		ela implementa a interface -Command- que é
		implementada por todos os comandos que o jogador
		pode realizar.
	*/
	private boolean isRunning;
	
	public RunCommand(boolean isRunning) {
		
		this.isRunning = isRunning;
		
	}
	
	@Override
	public void execute(Player player) {
		
		player.setIsRunning(this.isRunning);
		
	}

}
