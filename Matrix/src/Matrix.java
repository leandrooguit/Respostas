
public class Matrix {

	public int diffDiagonal(int[][] mtrx, int n) {
		int diagonal_1 = 0;
		int diagonal_2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					diagonal_1 = diagonal_1 + mtrx[i][j];
				}
				if (j == (n-1-i)) {
					diagonal_2 = diagonal_2 + mtrx[i][j];
				}
			}
		}
		
		System.out.println("Resultado diagonal 1.: " + diagonal_1);
		System.out.println("Resultado diagonal 2.: " + diagonal_2);
		
		return diagonal_1 - diagonal_2;
	}
	
}
