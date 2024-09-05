package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class generos {

	public static void main(String[] args) {
		//Set<Users> usuarios = new HashSet<Users>();
		Map<String, String> map = new HashMap<>();
		String nome;
		String genero;
		map.put(nome = "Allan", genero = "Masculino");
		map.put(nome = "Roberta", genero = "Feminino");
		map.put(nome = "Sofia", genero = "Feminino");
		map.put(nome = "Arthur", genero = "Masculino");
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		

	}

}
