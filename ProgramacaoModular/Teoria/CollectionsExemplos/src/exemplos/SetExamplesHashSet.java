package exemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamplesHashSet {
	public static void main(String[] args) {
		// Exemplo de HashSet (sem ordem específica)
		Set<String> hashSet = new HashSet<>();
		hashSet.add("maca");
		hashSet.add("banana");
		hashSet.add("laranja");
		hashSet.add("maca");
		System.out.println("HashSet: " + hashSet);
	}
}