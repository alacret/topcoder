package alacret;

import java.util.Random;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int cont0 = 0;
		int cont1 = 0;
		int cont2 = 0;
		for (int i = 0; i < 1000; i++) {
			switch (ran.nextInt(3)) {
			case 0:
				cont0++;
				break;
			case 1:
				cont1++;
				break;
			case 2:
				cont2++;
				break;
			}
		}
		System.out.println("ceros:" + cont0);
		System.out.println("unos:" + cont1);
		System.out.println("dos:" + cont2);
	}
}