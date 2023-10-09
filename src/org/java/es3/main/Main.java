package org.java.es3.main;

import org.java.es3.main.listint.ListInt;

public class Main {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		
		ListInt listInt = new ListInt(x);
		
		while(listInt.hasAncoraElementi()) {
			try {
				System.out.println(listInt.getElementoSuccessivo());
				System.out.println(listInt.hasAncoraElementi());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		//per testare messaggio di errore
		try {
			System.out.println(listInt.getElementoSuccessivo());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//aggiungendo un nuovo elemento e ciclando nuovamente
		listInt.addElemento(100);
		
		while(listInt.hasAncoraElementi()) {
			try {
				System.out.println(listInt.getElementoSuccessivo());
				System.out.println(listInt.hasAncoraElementi());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
