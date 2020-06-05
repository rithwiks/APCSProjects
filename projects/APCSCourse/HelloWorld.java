import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int hi = user_input.nextInt();
		int hello = user_input.nextInt();
		System.out.println(hello + hi);
	}
}

