package utils;

import animals.*;

import java.util.Random;
import java.util.Scanner;

public class AnimalsUtils {

	public Animal spawnAnimal() {
		Random rand = new Random();
		int generatedNumber = rand.nextInt(6);

		switch(generatedNumber) {
			case 0:
				return new Horse(0, "maschio");
			case 1:
				return new Cow(0, "femmina");
			case 2:
				return new Sheep(0, "femmina");
			case 3:
				return new Hen(0, "femmina");
			case 4:
				return new Pig(0, "maschio");
			case 5: return new Fox(0, "femmina")	;
			default:
				return new Animal("errore", "errore", "ao", 0, "errore");
		}
	}

	public String askFood() {
		boolean foodCheck = false;
		String givenFood = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("Cosa gli dai da mangiare? Fieno, semi, mele, erba, sbobba o bacche");

		while(!foodCheck) {
			givenFood = scan.nextLine();

			if(givenFood.equals("fieno") || givenFood.equals("semi") || givenFood.equals("mele") || givenFood.equals("erba") || givenFood.equals("sbobba") || givenFood.equals("bacche")) {
				foodCheck = true;
			}
			else {
				System.out.println("Inserisci un cibo valido tra quelli prima elencati!");
				foodCheck = false;
			}
		}
		return givenFood;
	}
}
