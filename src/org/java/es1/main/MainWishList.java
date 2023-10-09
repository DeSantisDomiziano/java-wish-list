package org.java.es1.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.java.es1.main.gift.Gift;

public class MainWishList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Gift> wishList = new ArrayList<>();
		
		do {
			System.out.println("Che regalo vuoi inserire nella lista?: ");
			String nameGift = sc.nextLine();
			
			System.out.println("A chi è destinato il regalo?: ");
			String recipientGift = sc.nextLine();
			
			Gift gift = new Gift(nameGift, recipientGift);
			wishList.add(gift);
			
			System.out.println("Al momento la tua lista dei regali è di " + wishList.size() + " elementi.");
			
			wishList.stream()
            .forEach(giftPrint -> System.out.println(giftPrint));
			
			System.out.println("Vuoi continuare ad aggiungere regali?: [digitare: \"si/no\"]");
		} while (sc.nextLine().equalsIgnoreCase("si"));
		
		System.out.println("Arrivederci!");
		sc.close();
	}
}