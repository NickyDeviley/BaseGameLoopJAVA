package Tiles.SpecificTiles;

import java.awt.image.BufferedImage;
import java.util.EnumSet;
import java.util.List;

import Tiles.Tile;
import Tiles.TileBehaviors.TileBehaviors;

public class AnimatedTile extends Tile {

	private List<BufferedImage> animation;
	
	public AnimatedTile(EnumSet<TileBehaviors> behaviors, int ID) {
		super(behaviors, ID);
		
	}
	
	
	
}
