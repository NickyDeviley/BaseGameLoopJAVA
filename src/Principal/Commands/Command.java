package Principal.Commands;

import Entities.Player.Player;

public interface Command {
	/**
		Interface que permite ao jogador
		realizar comandos, como andar e atacar
	*/
	void execute(Player player);
	
}
