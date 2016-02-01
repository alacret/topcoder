package alacret;

public class HowEasy {
	public int pointVal(String problem) {
		String[] tokens = problem.split(" ");
		int wordsAvg = 0;
		int words = 0;
		int counter = 0;

		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].matches("([a-zA-Z])*")) {
				int dotApp = tokens[i].lastIndexOf(".");
				int length = tokens[i].length();
				if (dotApp != -1 && tokens[i].endsWith(".")) {
					counter += length;
					words++;
				} else if (dotApp == -1) {
					counter += length;
					words++;
				}
			}
		}
		try {
			wordsAvg = counter / words;

		} catch (Exception e) {
			// System.out.println("No words founded");
			return 0;
		}
		// System.out.println(words + " words founded");
		if (wordsAvg <= 3)
			return 250;
		else if (wordsAvg == 4 || wordsAvg == 5)
			return 500;
		else if (wordsAvg >= 6)
			return 1000;
		else
			return 0;
	}

	public static void main(String args[]) {
		HowEasy h = new HowEasy();
		System.out.println(h
				.pointVal("Implement a class H5 which contains some method."));

	}
}
