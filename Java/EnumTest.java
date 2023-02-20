enum Test {
	LOW,
	MEDIUM,
	HIGH
}
public class EnumTest {
	public static void main(String[] args) {
			for(Test myVar : Test.values()) {
				System.out.println(myVar);
			}
	}
}
