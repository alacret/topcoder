package alacret;

public class FoxAndClassroom {

	public String ableTo(int n, int m) {
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				matrix[i][j] = 0;

		int iN = 0, iM = 0;
		matrix[0][0] = 1;

		for (int i = 0, end = n * m; i < end; i++) {
			iN = (iN + 1) % n;
			iM = (iM + 1) % m;
			matrix[iM][iN] = 1;
		}

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (matrix[i][j] == 0)
					return "Impossible";

		return "Possible";
	}

}
