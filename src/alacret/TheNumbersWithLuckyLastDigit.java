package alacret;

import java.util.ArrayList;
import java.util.List;

public class TheNumbersWithLuckyLastDigit {
	public 	int find(int n){
		List<Integer> luckyNumbers = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if(isLuzyNumber(i))
				luckyNumbers.add(i);
		}
		
		if(luckyNumbers.size() == 0)
			return 0;
		
		int r = n % 10;
		if(r == 4 || r == 7)
		return 1;
		
		
		
		
		return 0;
	}

	private boolean isLuzyNumber(int i) {
		int r = i % 10;
		if(r == 4 || r == 7)
			return true;
		return false;
	}
}
