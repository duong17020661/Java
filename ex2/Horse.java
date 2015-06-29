package ex2;

import java.util.Random;

public class Horse extends Thread {
	private String nameH;
	private int length = 0;
	private int step = 0;

	public Horse(String nameH) {
		this.nameH = nameH;
	}

	public void run() {
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (length != 100) {
			Random randomNumber = new Random();
			length += randomNumber.nextInt(10) + 1;
			step += 1;
			System.out.println(nameH + ": " + length);
			if (length > 100) {
				length -= 100;
			}
		}
		System.out.println("Con ngua " + nameH + " ve dich voi " + step
				+ " buoc.");
	}

	public int getLength() {
		return this.length;
	}

	public int getStep() {
		return step;
	}

	public String getNameH() {
		return nameH;
	}

}
