import java.util.Random;

public class Finish {
	
	public static void raceResults() {
		Random random = new Random();
		
		int result = random.nextInt(18);
		System.out.println(result);
	}
}
