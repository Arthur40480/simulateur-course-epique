import java.util.Scanner;

public class Course {

	public static void main(String[] args) {
		// Déclaration du scanner et des variables qui contiendront le choix de l'utilisateur, ainsi que le nombre de chevaux :
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		int numberHorses;
		
		System.out.println("Bonjour, à quel type de course souhaitez-vous jouer ?");
		System.out.println("1 - Tiercé");
		System.out.println("2 - Quarté");
		System.out.println("3 - Quinté");
		System.out.println("4 - Quittez l'application");
		
		// On assigne le choix de l'utilisateur à la variable userChoice :
		userChoice = scanner.nextInt();
		
		System.out.println("Veuillez indiquer le nombre de chevaux dans la course (12 - 20) :");
		
		// On assigne le nombre de chevaux à la variable numberHorses :
		numberHorses = scanner.nextInt();
		
		System.out.println("Choix de l'utilisateur :" + userChoice + " - Nombre de chevaux :" + numberHorses);
		scanner.close();

	}

}
