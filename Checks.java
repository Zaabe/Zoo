package main;

import java.util.Scanner;

public class Checks {
	public int stop() {

		boolean check = true;
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vuoi smettere di giocare? Digitare '0' per continuare o '1' per smttere");

		while(check) {
			try {
				String num = scan.nextLine();
				n = Integer.parseInt(num);
				if(n > 1 || n < 0) {
					System.out.println("Inserisci una risposta valida");
					check = true;
				}
				else check = false;
			}
			catch(NumberFormatException e) {
				System.out.println("Inserisci una risposta valida");
				check = true;

			}
		}
		return n;
	}
	
	public String isItFood() {
		
		boolean foodCheck = false;
		String givenFood = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cosa gli dai da mangiare? Fieno, semi, mele, erba o sbobba");
		
		while(!foodCheck) {
			givenFood = scan.nextLine();
			
			if(givenFood.equals("fieno") || givenFood.equals("semi") || givenFood.equals("mele") || givenFood.equals("erba") || givenFood.equals("sbobba")) {
				foodCheck = true;
				
			}
			
			else {
				System.out.println("Inserisci un cibo valido tra quelli prima elencati!");
				foodCheck = false;
				
			}
				
		}
		return givenFood;
	}
	
	public String favoriteFood(String animal, String food) {
		
		if(animal.equals("Mucca") && food.equals("fieno")) {
			System.out.println("Mangia felicemente e sembra piacergli!");
		}
		else if(animal.equals("Maiale") && food.equals("sbobba")) {
			System.out.println("Mangia felicemente e sembra piacergli!");
		}
		else if(animal.equals("Pecora") && food.equals("erba")) {
			System.out.println("Mangia felicemente e sembra piacergli!");
		}
		else if(animal.equals("Cavallo") && food.equals("mele")) {
			System.out.println("Mangia felicemente e sembra piacergli!");
		}
		else if(animal.equals("Gallina") && food.equals("semi")) {
			System.out.println("Mangia felicemente e sembra piacergli!");
		}
		else {
			System.out.println("Non sembra piacergli molto...");
		}
		return "";
	}
}
