import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<String>();
//        arr.add("Uday");
//        arr.add("Tushar");
//        arr.set(0, "Bhargav");
//        System.out.println(arr.get(0));
//        HashMap<String, Integer> arr = new HashMap<>();
//        arr.put("Uday", 20);
//        arr.put("Tushar", 16);
//        arr.replace("Uday", 20, 21);
//        for(String s: arr.keySet()) {
//            System.out.println(s + arr.get(s));
//        }
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("uday",20));
//        for(Students s: students) {
//            System.out.println(s.getName());
//            System.out.println(s);
//        }
        System.out.println(students.get(0).getId());
    }
}
