package Util.Input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Principal.Config;
import Tiles.Tile;

public class WorldInput {

	public WorldInput() {}

	public List<Integer> carregarMundo() {
	    List<Integer> numbers = new ArrayList<>();
	    
	    // O "/" no início indica a raiz do seu diretório de recursos (geralmente src)
	    String path = "/Worlds/worldtest.txt";
	    
	    // Usamos getResourceAsStream para que funcione dentro do JAR
	    try (BufferedReader br = new BufferedReader(
	            new InputStreamReader(getClass().getResourceAsStream(path)))) {
	        
	        String line;
	        while ((line = br.readLine()) != null) {
	            // Trim remove espaços extras no início/fim que podem quebrar o parseInt
	            String[] tokens = line.split(" ");
	            
	            for (String s : tokens) {
	                if (!s.isEmpty()) { // Garante que não tente converter espaços vazios
	                    numbers.add(Integer.parseInt(s));
	                }
	            }
	        }
	    } catch (Exception e) {
	        System.err.println("Erro ao carregar o mundo! Verifique se o caminho está correto: " + path);
	        e.printStackTrace();
	    }
	    
	    return numbers;
	}
	
	
}
