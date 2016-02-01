package alacret;

import java.util.PriorityQueue;

public class TheJackpotDivTwo {
	
	public int[] find(int[] money, int jackpot){
		PriorityQueue<Integer> friends = new PriorityQueue<Integer>();
		for (int i = 0; i < money.length; i++) 
			friends.add(money[i]);
		
		while (jackpot > 0){
			int el = friends.poll().intValue();
			el++;
			friends.add(el);
			jackpot--;
		}
		int[] r = new int[friends.size()];
		
		for (int i = 0; i < r.length; i++) {
			r[i] = friends.poll();
		}
		
		return r;
		
	} 
}
