package info.exam;

import java.util.Scanner;

public class Power {
	public String input(int power) {
		String word = "";
		boolean valid = true;
		switch (power) {
		case 6:
			word = "million";
			break;
		case 9:
			word = "Billion";
			break;
		case 12:
			word = "Trillion";
			break;
		case 15:
			word = "quadrillion";
			break;
		case 18:
			word = "Quintillion";
			break;
		case 21:
			word = "Sextillion";
			break;
		case 30:
			word = "Nontillion";
			break;
		case 100:
			word = "Googol";
			break;
		default:
			valid = false;
		}

		if (valid) {
			System.out.println("10 raised to the" + power + "th power is" + word);
		} else {
			System.out.println("there is no single word for 10 raised to the" + power + "th power");
		}
		return word;

	}

}
