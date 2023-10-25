package exemplos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAPHasMap {
	public static void main(String[] args) {

		/*
		 * Map é uma coleção que armazena pares chave-valor, onde as chaves são únicas.
		 */

		// Exemplo de HashMap (sem ordem específica)
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("maca", 3);
		hashMap.put("banana", 2);
		hashMap.put("laranja", 5);
		System.out.println("HashMap: " + hashMap);
	}
}
