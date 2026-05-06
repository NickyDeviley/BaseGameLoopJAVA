package Util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class UtilityTools {

	public BufferedImage scaleImage(BufferedImage imageInput, int width, int height) {
		
		BufferedImage scaledImage = new BufferedImage(width, height, imageInput.getType());
		Graphics2D g2 = scaledImage.createGraphics();
		g2.drawImage(imageInput, 0, 0, width, height, null);
		g2.dispose();
		
		return scaledImage;
		
	}
	
}
