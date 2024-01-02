package loops;

public class Test2 {

	public static void main(String[] args) {
		int rem = 6749;
		int sum = 0;
		while (rem > 0) {
		sum = sum + rem % 10;
		rem = rem / 10;
		}
		System.out.println(sum);

	}

}
