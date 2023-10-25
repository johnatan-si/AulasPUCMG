package exemplos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAPTreeMap {
	public static void main(String[] args) {

		/*
		 * Map é uma coleção que armazena pares chave-valor, onde as chaves são únicas.
		 */

		// Exemplo de TreeMap (ordenado pelas chaves)
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("maçã", 3);
		treeMap.put("banana", 2);
		treeMap.put("laranja", 5);
		System.out.println("TreeMap: " + treeMap);
	}
}
