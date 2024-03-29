import java.util.Scanner;

public class Course {

	public static void main(String[] args) {
		// Déclaration du scanner et des variables qui contiendront le choix de l'utilisateur, ainsi que le nombre de chevaux :
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		int numberHorses;
		
		System.out.println("Bonjour, à quel type de course souhaitez-vous jouer ?");
		System.out.println();
		System.out.println("1 - Tiercé");
		System.out.println("2 - Quarté");
		System.out.println("3 - Quinté");
		System.out.println("4 - Quittez l'application");
		System.out.println();
		System.out.print("Veuillez saisir votre choix : ");
		
		// On assigne la valeur de retour de la méthode verificationUserChoice à la variable userChoice :
		userChoice = Verification.verificationUserChoice(scanner);
		
		// Si le choix de l'utilisateur est 4, alors on stop le programme :
		if(userChoice == 4) {
			System.out.println("A bientôt !");
			System.exit(0);
		}
		
		System.out.print("Veuillez indiquer le nombre de chevaux dans la course (12 - 20) : ");
		
		// On assigne le nombre de chevaux à la variable numberHorses :
		numberHorses = Verification.verificationNumberHorses(scanner);
		
		Finish.raceResults(userChoice, numberHorses, scanner);
		scanner.close();

	}

}
