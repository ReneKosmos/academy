package by.academy.homework1;

public class Zadanie1 {

	public static void main(String[] args) {
		int buyerAge = 17;
		int summ = 299;
		double result = 0.0;
		if (summ < 100) {
			System.out.println(summ * 0.05);
		} else if (summ < 200) {
			System.out.println(summ * 0.07);
		} else if (summ < 300) {
			System.out.println();
			if  (buyerAge >= 18) {
				System.out.println(buyerAge * 0.16);
			}
			else {
				System.out.println(summ * 0.13);
				
			}

		} else if (summ < 400) {
			System.out.println(summ * 0.15);
		} else if (summ > 400) {
			System.out.println(summ * 0.2);
		}

		System.out.println(result);
	}

}
