package main;


import animals.Animal;
import utils.AnimalsUtils;
import utils.GameUtils;

/* Spawnare animali random FATTO
 * Gli animali hanno dei cibi preferiti FATTO
 * Gli aniamli fanno versi diversi FATTO
 *
 * Completamento barra felicità giornaliera
 * Dopo tot turni spawna un figlio se si hanno un maschio e una femmina nel recinto
 * Animali divisi per recinti
 *
 * Introdurre id autoincrementali per rendere univoci gli animali
 * Introdurre gestione del cibo tramite classe aggiuntiva con array di cibi ammessi ed utilizzare nei campi dei cibi preferiti dei singoli animali e nell'input del cibo dall'utente
 * Gestire meglio i sessi per fare i regazzini
 * Introdurre nuovi animali
 * Gestire animali con un unico sesso (gallina, mucca, toro ecc.)
 */

public class ZooMain {
	public static void main(String[] args) {

		GameUtils game = new GameUtils();
		AnimalsUtils animalsUtils = new AnimalsUtils();
		int turn = 0;

		while (game.handleTurn(turn) == 0) {
			// La partita va avanti
			Animal animal = animalsUtils.spawnAnimal();
			System.out.println("È apparso un animale!: " + animal.getName());
			String food = animalsUtils.askFood();
			animal.feed(food);
			turn = turn + 1;
		}
		System.out.println("Ciao! Torna presto!");
	}
}