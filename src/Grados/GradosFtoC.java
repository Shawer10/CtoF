package Grados;

import java.util.*;

public class GradosFtoC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		double C, F;
		System.out.println("1- Conversion de grados Celsius a Fahrenheit: ");
		System.out.println("2- Conversion de grados Fahrenheit a Celsius: ");
		num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Introduce un numero :");
			C = sc.nextDouble();
			F = 32 + (9 * C / 5);
			System.out.println(F + " Grados Fahrenheit ");
			break;

		case 2:
			System.out.println("Introduce un numero :");
			F = sc.nextDouble();
			C = (F - 32) * 5 / 9;
			System.out.println(C + " Celsius ");
			break;

		default:
			System.out.println("Error");
		}
	}

}