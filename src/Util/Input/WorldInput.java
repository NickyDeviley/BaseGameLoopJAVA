package Util.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import Principal.Config;

public class WorldInput {

	public int[][] carregarMundo() {
		
		int col = 0;
		int row = 0;
		
		int[][] mundo = new int[20][12];
		
		try (
			InputStream is = getClass().getResourceAsStream(Config.WORLDS_PATH + "worldtest.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			) {
			
			while (col < Config.QTD_TILES_X && row < Config.QTD_TILES_Y) {
				
				String line = br.readLine();
				
				while (col < Config.QTD_TILES_X) {
					
					String numbers[] = line.split(" ");
					
					int num = Integer.parseInt(numbers[col]);
					
					mundo[col][row] = num;
					col++;
					
				}
				if (col == Config.QTD_TILES_X) {
					col = 0;
					row++;
				}
			}
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		return mundo;
	}
	
}
