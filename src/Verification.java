import java.util.Scanner;

public class Verification {
		
	public static int verificationUserChoice(Scanner scanner) {
			
		int userChoice;
		
		while(true) {
			if(scanner.hasNextInt()) {
				userChoice = scanner.nextInt();
					
				if(userChoice < 1 || userChoice > 4) {
					System.out.println("Veuillez saisir un choix correct (1 - 4) :");
				}else {
					break;
				}
			}else {
				System.out.println("Veuillez saisir un choix correct (1 - 4) :");
				scanner.next();
			}
		}		
		return userChoice;
	}

}


