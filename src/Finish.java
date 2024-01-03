import java.util.Random; 

public class Finish {
	
	public static void raceResults(int typeOfRace, int numberHorses) {
		// La classe Random est utilisé pour générer des nombres aléatoires :
		Random random = new Random();
		int[] resultatList = new int[typeOfRace];
		for(int i = 0; i < typeOfRace; i++) {
			while(true) {
				int nextHorse = random.nextInt(numberHorses) + 1;
				System.out.println("Numéro suivant : " + nextHorse);
				if(contains(resultatList, nextHorse) == false) {
					resultatList[i] = nextHorse;
					break;
				}
			}
		}
		for(int numero : resultatList) {
			System.out.println(numero + " - ");
		}

	}
	
	// Méthode pour vérifier si un nombre est déjà présent dans le tableau d'arrivé :
	public static boolean contains(int[] horseNumberList, int nextHorseNumber) {
		for(int number : horseNumberList) {
			if(nextHorseNumber == number) {
				return true;
			}
		}
		return false;
	}
}
