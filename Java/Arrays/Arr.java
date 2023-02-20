import java.util.Scanner;

public class Arr{
	public static void main(String[] args){
		String[] names = {"uday", "pratik", "bhargav", "tushar"};
		int[] numbers = {12345, 12354, 98643, 54211};

		for (int i = 0; i < names.length ; i++) {
			System.out.println(names[i]);
		}

		System.out.println("Enter a name : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		for (int i = 0; i < names.length; i++) {
			if(name.equals(names[i])) {
				System.out.println(numbers[i]);
			} else {
				System.out.print("No user found");
			}
		}
	}
}