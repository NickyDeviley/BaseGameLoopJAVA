package Principal.Commands.Player;

import Entities.Entity;
import Entities.Behaviors.Direction;
import Entities.Behaviors.PlayerState;
import Entities.Player.Player;
import Entities.Player.States.WalkState;
import Principal.Commands.Command;

public class WalkCommand implements Command {
	/**
	 	Classe que permite a movimentação do jogador,
	 	ela implementa a interface -Command- que é
	 	implementada por todos os comandos que o jogador
	 	pode realizar.
	*/
	private Direction direction;					// Variável para armazenar a direção que o player está se movendo
	
	// Construtor que recebe a direção
	public WalkCommand(Direction direction) {
		
		this.direction = direction;
		
	}
	
	@Override
	public void execute(Player player) {
		
		player.movement(this.direction);
		
	}

}