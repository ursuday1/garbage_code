import java.util.Scanner;
import java.util.Random;

public class Game{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the game \nPlease Enter your last name :");
		String name = scan.next();
		System.out.println("Hello " + name );
		String start;
		while (true) {
    		System.out.println("Press Y to Start");
   			start = scan.next();
   			start = start.toLowerCase();
    		if (start.equals("y")) {
        		break;
    		}
		}
		Random rand = new Random();
		int num = rand.nextInt(5) + 1;
		int uNum = 200;
		for(int i = 0; i < 5; i++) {
			if(uNum != num) {
				System.out.println("Enter a number from 1 to 5 ");
				uNum = scan.nextInt();
				if(num == uNum) {
					System.out.println("Congrats");
				}
			}
		} 
	}
}