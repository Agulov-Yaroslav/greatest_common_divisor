package greatest_common_divisor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arr) {
		System.out.println("Введите первое число: ");
		int a = valid();
		System.out.println("Введите второе число: ");
		int b = valid();
		int c = euclidsAlgorithm(a, b);
		System.out.println("Наибольший общий делитель чисел " + a + " и " + b + ": " + c);

		scanner.close();

	}

	public static int valid() {
		int num = 0;
		String fail = "Введите целое положительное число! ";
		boolean loop = true;
		while (loop) {
			try {
				num = scanner.nextInt();
				if (num < 0)
					System.out.println(fail);
				else
					loop = false;
			} catch (InputMismatchException e) {
				System.out.println(fail);
				scanner.next();
			}
		}

		return num;
	}

	public static int euclidsAlgorithm(int a, int b) {
		int c = 0;
		boolean loop = true;
		while (loop) {
			if (a == b) {
				c = a;
				loop = false;
			} else {
				if (a > b) {
					a -= b;
				} else {
					b -= a;
				}
			}
		}

		return c;
	}
}
