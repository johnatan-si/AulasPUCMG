// -*- coding: UTF-8 -*-

package exemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetExamplesTreeMap {
	public static void main(String[] args) {
		// Exemplo de LinkedHashSet (mantém a ordem de inserção)
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("maca");
		linkedHashSet.add("banana");
		linkedHashSet.add("laranja");
		linkedHashSet.add("maca");
		System.out.println("LinkedHashSet: " + linkedHashSet);

	}
}