package by.academy.homework1;

public class Zadanie1 {

	public static void main(String[] args) {
		int summ = 100;
		double result = 0.0;
		if (summ < 100) {
			System.out.println(summ * 0.05);
		} else if (summ < 200) {
			System.out.println(summ * 0.07);
		} else if (summ < 300) {
			System.out.println(summ * 0.12);
			
		} else if (summ < 400) {
			System.out.println(summ * 0.15);
		} else if (summ > 400) {
			System.out.println(summ * 0.2);
		}

		System.out.println(result);
	}

}
