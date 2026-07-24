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
		
		int[][] mundo = new int[50][50];
		
		try (
			InputStream is = getClass().getResourceAsStream(Config.WORLDS_PATH + "worldtest.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			) {
			
		// DEBUG
			//System.out.println(mundo.length);
			//System.out.println(mundo[0].length);
			
			while (col < mundo.length && row < mundo[0].length) {
				
				String line = br.readLine();
				
				while (col < mundo.length) {
					
					String numbers[] = line.split(" ");

					
					int num = Integer.parseInt(numbers[col]);
					
				// DEBUG
					//System.out.println(line);
					//System.out.print(num + " ");
					
					mundo[col][row] = num;
					col++;
					
				}
				if (col == 50) {
					//System.out.println("\n");
					col = 0;
					row++;
				}
			}
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		/*
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				
				System.out.print(mundo[j][i]);
				
			}
			System.out.println();
		}
		*/
		return mundo;
	}
	
}
