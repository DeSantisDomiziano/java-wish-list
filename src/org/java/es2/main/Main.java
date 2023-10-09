package org.java.es2.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci una parola: ");
		String word = sc.nextLine();
		
		Map<Character, Integer> occurrences = new HashMap<>();
		
		for (char singleChar : word.toCharArray()) {
			occurrences.put(singleChar, occurrences.getOrDefault(singleChar, 0) + 1);
		}
		
		occurrences.forEach((key, value) -> System.out.println(key + ": " + value));
		
		sc.close();

	}

}
