// -*- coding: UTF-8 -*-

package exemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetExamplesLinkedHashSet {
	public static void main(String[] args) {
		// Exemplo de TreeMap (ordenado pelas chaves)
		/*
		 * Map não garante nenhuma ordenação 
		 * específica das chaves, enquanto um TreeMap 
		 * garante uma ordenação com base nas chaves. 
		 * A escolha entre eles depende dos requisitos 
		 * específicos do seu aplicativo. Se a ordem das 
		 * chaves não é importante, HashMap ou LinkedHashMap 
		 * são geralmente mais eficientes. Se você precisa de
		 *  uma ordenação específica, TreeMap é a escolha adequada.
		 */
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("maçã", 3);
		treeMap.put("banana", 2);
		treeMap.put("laranja", 5);
		System.out.println("TreeMap: " + treeMap);
	}
}