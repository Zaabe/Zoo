package main;

import java.util.Random;

public class Animals {
	public String spawn() {

		Random rand = new Random();

		String[] animals = {"Mucca", "Maiale", "Pecora", "Cavallo", "Gallina"};

		return animals[rand.nextInt(animals.length)];
	}

	public String feed(String animal) {
		
		Checks food = new Checks();
		
		String foodgiven = ""; 
		switch (animal) {
		case "Mucca":
			foodgiven = food.isItFood();
			System.out.println("'Mooooooooooooo'");
			food.favoriteFood(animal, foodgiven);
			
		break;
		case "Maiale":
			foodgiven = food.isItFood();
			System.out.println("'Oink Oink'");
			food.favoriteFood(animal, foodgiven);
			
		break;
		case "Pecora":
			foodgiven = food.isItFood();
			System.out.println("'Beeeeeeeeeeeeeeee'");
			food.favoriteFood(animal, foodgiven);
			
		break;
		case "Cavallo":
			foodgiven = food.isItFood();
			System.out.println("'Hihihihihihi'");
			food.favoriteFood(animal, foodgiven);
			
		break;
		case "Gallina":
			foodgiven = food.isItFood();
			System.out.println("'Coccodè'");
			food.favoriteFood(animal, foodgiven);
			
		break;
		default:
			System.out.println("Fratm me sa che ho programmato de merda");
			
		break;
		}
		
		return "Hai dato: " + foodgiven + " a " + animal;
    }
}


