package codingtest;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class NumberToString {

	static final String EXCEPTION_MESSAGE = "Number is out of range, we support only from 0 upto 999,999,999!!!";
	HashMap h;

	public NumberToString() {
		h = new HashMap<Integer, String>();
	}

	public static void main(String[] args) {

		NumberToString obj = new NumberToString();
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int choice = 0;

		try {
			do {
				System.out.println("Enter the number below from 1 to 999,999,999\n");
				System.out.println("Enter Number: ");
				try {
					int num = sc.nextInt();
					if (num <= 0 || Integer.toString(num).length() > 9) {
						throw new RuntimeException(NumberToString.EXCEPTION_MESSAGE);
					}

					System.out.println("Your Number: " + num);
					System.out.println("String: " + obj.convertToWord(num));
				} catch (Exception e) {
					System.out.println("Invalid input, try again!!");
					sc.nextLine();
				}

				do {
					try {
						System.out.println("\nto continue press 0, to quit press 1");
						choice = sc.nextInt();
						if (choice != 0 && choice != 1) {
							System.out.println("invalid choice, try again!!");
							sc.nextLine();
						}
					} catch (Exception e) {
						System.out.println("Invalid input, try again!!");
						sc.nextLine();
						choice = -1; // setting choice to invalid value
					}
				} while (choice != 0 && choice != 1);
			} while (choice == 0);

		} catch (Exception e) {
			System.out.println("Invalid input!!");
		}

		System.out.println("Exiting Application, Thanks for using!!!");

	}

	public String convertToWord(int number) {

		if (number == 0)
			return "";

		String str = Integer.toString(number);
		int len = str.length();
		StringBuffer finalString = new StringBuffer();

		initializeMap();

		if (h.containsKey(number)) {
			return (String) h.get(number);
		} else if (len < 3) {
			int temp = number - number % 10;
			finalString.append((String) h.get(temp)).append(" ").append((String) h.get(number % 10));

		} else if (len < 4) {
			int temp = number / 100;
			finalString.append(convertToWord(temp)).append(" ").append((String) h.get(100)).append(" and ")
					.append(convertToWord(number % 100));

		} else if (len < 7) {
			int temp = number / 1000;
			finalString.append(convertToWord(temp)).append(" ").append((String) h.get(1000)).append(" ")
					.append(convertToWord(number % 1000));
		} else if (len >= 7 && len <= 9) {
			int temp = number / 1000000;
			finalString.append(convertToWord(temp)).append(" ").append((String) h.get(1000000)).append(" ")
					.append(convertToWord(number % 1000000));
		}

		return finalString.toString();
	}

	public void initializeMap() {
		h.put(0, "zero");
		h.put(1, "one");
		h.put(2, "two");
		h.put(3, "three");
		h.put(4, "four");
		h.put(5, "five");
		h.put(6, "six");
		h.put(7, "seven");
		h.put(8, "eight");
		h.put(9, "nine");
		h.put(10, "ten");
		h.put(11, "eleven");
		h.put(12, "twelve");
		h.put(13, "thirteen");
		h.put(14, "forteen");
		h.put(15, "fifteen");
		h.put(16, "sixteen");
		h.put(17, "seventeen");
		h.put(18, "eighteen");
		h.put(19, "ninteen");
		h.put(20, "twenty");
		h.put(30, "thirty");
		h.put(40, "forty");
		h.put(50, "fifty");
		h.put(60, "sixty");
		h.put(70, "seventy");
		h.put(80, "eighty");
		h.put(90, "ninty");
		h.put(100, "hundred");
		h.put(1000, "thousand");
		h.put(1000000, "million");

	}

}
