package Interview;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String s = sc.nextLine();
		int n = s.length();
		boolean b = false;
		String reverse = "";

		if (n >= 1 && n <= 100) {
			for (int i = n - 1; i >= 0; i--) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {

					reverse += s.charAt(i);
					b = true;
				} else {
					b = false;
					break;
				}

			}

		}
		if (b == true) {
			System.out.println(reverse);

		} else {
			System.out.println("Input Constraints\n"
					+ "1<=Length of string<=100\n"
					+ "Input string contains only lowercase characters ['a' to 'z']. ");
		}
	}

}
