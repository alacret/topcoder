package alacret;

public class LuckyRemainder {
	public static int getLuckyRemainder(String x){
		long X = Long.valueOf(x);
		char[] charArray = x.toCharArray();
		int rep = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i; j < charArray.length; j++) {
				if(charArray[i] == charArray[j])
					rep++;
			}
		}	
		return ((int) ((X-rep) % 9)) ;
	}
	private void syso() {
		// TODO Auto-generated method stub

	}
	public static void main(String args[]){
		System.out.println(getLuckyRemainder("11235813213455"));
	}

}
