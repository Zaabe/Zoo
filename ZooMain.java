package main;


/* Spawnare animali random FATTO
 * Gli animali hanno dei cibi preferiti FATTO
 * Completamento barra felicità giornaliera
 * Gli aniamli fanno versi diversi FATTO
 * Dopo tot turni spawna un figlio se si hanno un maschio e una femmina nel recinto
 * Animali divisi per recinti
 * 
 */
public class ZooMain {
	public static void main(String[] args) {	
		
		Checks game = new Checks();
		Animals spawnAnim = new Animals();
		
		String animal;
		
		while(game.stop() == 0) {
			// La partita va avanti
			animal = spawnAnim.spawn();
			System.out.println("E' apparso un animale!: " + animal);
			spawnAnim.feed(animal);
			
		}
		
		System.out.println("Ciao! Torna presto!");
	}
}
