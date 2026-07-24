package Tiles;

import java.util.EnumSet;

import Tiles.TileBehaviors.TileBehaviors;

public abstract class Tile {

	protected EnumSet<TileBehaviors> behaviors;
	protected int ID;
	
	public Tile(EnumSet<TileBehaviors> behaviors, int ID) {
		
		this.behaviors = behaviors;
		this.ID = ID;
		
	}
	
}
