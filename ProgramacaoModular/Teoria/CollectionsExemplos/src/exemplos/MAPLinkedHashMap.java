package exemplos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAPLinkedHashMap {
	public static void main(String[] args) {

		/*
		 * Map é uma coleção que armazena pares chave-valor, onde as chaves são únicas.
		 */

		// Exemplo de LinkedHashMap (mantém a ordem de inserção)
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("maca", 3);
		linkedHashMap.put("banana", 2);
		linkedHashMap.put("laranja", 5);
		System.out.println("LinkedHashMap: " + linkedHashMap);

	}
}
