import org.jetbrains.annotations.NotNull;

import java.util.*;
//public class Main {
//
//    static int occurrence(@NotNull String str) {
//        String toCheck = str.substring(0,3);
//        int count = 0;
//        if (str.length() < 6) {
//            return 0;
//        } else {
//            for(int i = 0; i < str.length()-2; i++) {
//                if(str.substring(i, i+3).equals(toCheck)) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string to check");
//        String input = sc.nextLine();
//        System.out.println(occurrence(input));
//        System.out.println(input.substring(0, 0+3));
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] numbers = new int[10];
        numbers[0] = a;
        numbers[1] = b;
        int gcf = findGCF(numbers);
        System.out.println(gcf);
    }

    public static int findGCF(int[] numbers) {
        int a = numbers[0];
        int b = numbers[1];

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
