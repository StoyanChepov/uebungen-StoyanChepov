package uebung9;

public class Recursion {

	public static void main(String[] args) {

		System.out.println("Factorial:" + factorial(5));

		System.out.println("Factorial recursive:" + factorialRecursive(5));

		System.out.println("Fibonacci:" + fibonacci(12));

		System.out.println("Fibonacci recursive:" + fibonacciRecursive(12));

	}

	private static int factorial(int n) {

		int result = 1;

		for (int number = 2; number <= n; number++) {

			result *= number;

		}

		return result;

	}

	private static int factorialRecursive(int n) {

		if (n < 2) {

			return 1;

		} else {

			return n * factorialRecursive(n - 1);
		}

	}

	private static int fibonacci(int n) {

		int firstNumber = 0;

		int secondNumber = 1;

		while (n > 1) {

			secondNumber = firstNumber + secondNumber;//2
			System.out.printf("second number ist "+secondNumber+"\n");

			firstNumber = secondNumber - firstNumber;//1
			System.out.printf("first number ist "+firstNumber+"\n");

			n--;

		}

		return firstNumber;

	}

	private static int fibonacciRecursive(int n) {

		if (n <= 1) {

			return 0;

		} else if (n == 2) {

			return 1;

		} else {

			return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

		}

	}

}