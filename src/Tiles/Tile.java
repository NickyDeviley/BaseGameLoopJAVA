package Tiles;

import java.awt.Graphics2D;
import java.util.EnumSet;

import Tiles.Behaviors.Behaviors;

public abstract class Tile {

	// Atributos
	private int ID;
	private String name;
	private EnumSet<Behaviors> behaviors;
	
	// Construtor
	public Tile (int ID, String name, EnumSet<Behaviors> behaviors) {
		
		this.ID = ID;
		this.name = name;
		this.behaviors = behaviors;
		
	}

// COMPORTAMENTOS
	public boolean hasBehavior(Behaviors behavior) {
		
		return behaviors.contains(behavior);
		
	}
	
// GETTERS & SETTERS
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnumSet<Behaviors> getBehaviors() {
		return behaviors;
	}

	public void setBehaviors(EnumSet<Behaviors> behaviors) {
		this.behaviors = behaviors;
	}
	
	
}
