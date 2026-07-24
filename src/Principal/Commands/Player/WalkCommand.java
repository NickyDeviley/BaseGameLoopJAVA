package Principal.Commands.Player;

import Entities.Entity;
import Entities.Behaviors.Direction;
import Entities.Behaviors.PlayerState;
import Entities.Player.Player;
import Entities.Player.States.WalkState;
import Principal.Commands.Command;

public class WalkCommand implements Command {
	/**
	 	WalkCommand permite que o jogador se mova, mas
	 	apenas indica a direção para onde ele vai se
	 	mover, o método -movement- se encarrega de
	 	movimentar o jogador.
	 	
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
		
		//player.setState(WalkState.walkS);
		player.movement(this.direction);
		
	}

}