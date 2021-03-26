package utils;

import java.util.Scanner;

public class GameUtils {
	public int handleTurn(int turn) {

		boolean check = true;
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
			
		if(turn == 0) {
			System.out.println("Benvenuto! Questa è una simulazione (brutta) di uno Zoo! Iniziamo!");
			return 0;
		}
		else {
			System.out.println("Vuoi smettere di giocare? Digitare '0' per continuare o '1' per smettere");
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
		}
		return n;
	}
}
