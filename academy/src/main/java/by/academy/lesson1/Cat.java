package by.academy.lesson1;

public class Cat {
	String nickname;
	String color;
	int age;
	int sleep;
	int money;
	int weight;
	boolean isHomeAnimals;
	char initials;

	public Cat() {
		super();
	}

	public Cat(String nickname, int weight, String color, int age) {
		this.nickname = nickname;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}

	public void grow() {
		age = age + 1;
		System.out.println("The cat " + nickname + " getting older: " + age );
	}

	public void sleep() {
		sleep = sleep + 1;
		System.out.println("The cat " + nickname + sleep );
	}

	public void eat() {
		weight = weight + 1;
		System.out.println("The cat " + nickname + weight );
	}

	public void walk() {
		weight = weight - 1;
		System.out
				.println("The cat " + nickname  + weight );
	}

	public int getmoney() {
		return getmoney();
	}

	public void setmoney(int money) {
		this.money = money;
	}

	public char getInitials() {
		initials = nickname.charAt(0);
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean isHomeAnimals() {
		isHomeAnimals = true;
		return isHomeAnimals;
	}

	public void setisHomeAnimals(boolean isHomeAnimals) {
		this.isHomeAnimals = isHomeAnimals;
	}

	@Override
	public String toString() {
		return "nickname: " + nickname + ',' + " age: " + age + ',' + " initials: " + initials + ',' + " money: "
				+ money + ',' + " isHomeAnimal: " + isHomeAnimals + ',' + " color: " + color + ',' + " weight "
				+ weight;
	}
}