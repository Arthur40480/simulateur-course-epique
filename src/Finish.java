import java.util.Random; 

public class Finish {
	
	public static void raceResults(int typeOfRace, int numberHorses) {
		// La classe Random est utilisé pour générer des nombres aléatoires :
		Random random = new Random();
		int numberArrivals;
		
		if(typeOfRace == 1) {
			numberArrivals = 3;
		} else if(typeOfRace == 2) {
			numberArrivals = 4;
		} else {
			numberArrivals = 5;
		}
		
		// On créer un nouveau tableau de longueur égale au type de course :
		// Tableau qui contiendra les résultats de la course :
		int[] listResult = new int[numberArrivals];
		
		// On boucle sur le nombre d'arrivée ( tiercé, quarté, quinté .. ) donc ( 3, 4 ou 5) :
		for(int i = 0; i < numberArrivals; i++) {
			while(true) {
				int nextHorse = random.nextInt(numberHorses) + 1;
				if(contains(listResult, nextHorse) == false) { // Si la méthode contains return false, alors :
					listResult[i] = nextHorse;
					break;
				} // Sinon, on boucle :
			}
		}
		
		displayResult(listResult, typeOfRace, numberHorses);

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
	
	// Méthode permettant d'afficher le resultat :
	public static void displayResult(int[] horseNumberList, int typeOfRace, int numberHorses) {
		System.out.println();
		System.out.println("*****************************************************************");
		switch (typeOfRace) {
		case 1: 
			System.out.println("Tiercé d'une course comportant " + numberHorses + " chevaux :");
			break;
		
		case 2:
			System.out.println("Quarté d'une course comportant " + numberHorses + " chevaux :");
			break;
			
		case 3:
			System.out.println("Quinté d'une course comportant " + numberHorses + " chevaux :");
			break;
		}
		
		for(int i = 0; i < horseNumberList.length; i++) {
			System.out.print(horseNumberList[i]);
			if( i < horseNumberList.length - 1) {
				System.out.print(" - ");
			}
		}
		System.out.println();
		System.out.println("*****************************************************************");
	}
}
