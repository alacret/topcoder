package alacret;

public class PalindromizationDiv2 {
	public static int getMinimumCost(int x){
		if(x == 0)
			return 0;
		if(esPalindromo(x))
			return 0;
		int cost = 0;
		while(true){
			cost++;
			if(esPalindromo(x + cost))
				return cost;
			if(esPalindromo(x - cost))
				return cost;
		}
	}

	private static boolean esPalindromo(int x) {
		String xString = String.valueOf(x);
		char[] charArray = xString.toCharArray();
		int len = xString.length();
		double mitad = len/2d;
		if(len % 2 == 0){		
			int mitadEntera = (int) mitad;
			for(int i = 0; i < mitadEntera; i++){
				int pos1 = mitadEntera-i-1;
				int pos2 = mitadEntera + i;
				if(charArray[pos1] != charArray[pos2])
					return false;
			}
		}else{
			double temp = Math.ceil(mitad);
			int mitadEntera = (int) temp;
			for(int i = 0; i < mitadEntera-1; i++) {
				int pos1 = mitadEntera-i-2;
				int pos2 = mitadEntera + i;
				if(charArray[pos1] != charArray[pos2])
					return false;
			}
		}
			
		return true;
	}
}