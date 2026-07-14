package Entities.Behaviors;

public enum Direction {
	/**
		Enumerador que identifica para onde o jogador
		está se movimentando para ajustar a animação.
	*/
	
	
	UP(0, -1),
	DOWN(0, 1),
	LEFT(-1, 0),
	RIGHT(1, 0);

	public final int x, y;
	Direction(int x, int y) { this.x = x; this.y = y; }
}
