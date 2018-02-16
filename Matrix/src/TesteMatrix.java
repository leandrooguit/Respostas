
public class TesteMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrix matrix = new Matrix();
		int[][] mtrx_1 = new int[4][4];
		mtrx_1[0][0] = 1;
		mtrx_1[0][1] = 5;
		mtrx_1[0][2] = 3;
		mtrx_1[0][3] = 2;
		
		mtrx_1[1][0] = 4;
		mtrx_1[1][1] = 8;
		mtrx_1[1][2] = -5;
		mtrx_1[1][3] = 6;
		
		mtrx_1[2][0] = 7;
		mtrx_1[2][1] = 3;
		mtrx_1[2][2] = 4;
		mtrx_1[2][3] = 5;
		
		mtrx_1[3][0] = 2;
		mtrx_1[3][1] = 5;
		mtrx_1[3][2] = 9;
		mtrx_1[3][3] = -9;
		
		int resultado_1 = matrix.diffDiagonal(mtrx_1, 4);
		System.out.println("Resultado final 1.: " + resultado_1 + "\n");
		
		int[][] mtrx_2 = new int[3][3];
		mtrx_2[0][0] = 1;
		mtrx_2[0][1] = 5;
		mtrx_2[0][2] = 3;
		
		mtrx_2[1][0] = 4;
		mtrx_2[1][1] = 8;
		mtrx_2[1][2] = -5;
		
		mtrx_2[2][0] = 7;
		mtrx_2[2][1] = 3;
		mtrx_2[2][2] = 4;
		
		int resultado_2 = matrix.diffDiagonal(mtrx_2, 3);
		System.out.println("Resultado final 2.: " + resultado_2 + "\n");
		
		int[][] mtrx_3 = new int[5][5];
		mtrx_3[0][0] = 10;
		mtrx_3[0][1] = 6;
		mtrx_3[0][2] = 5;
		mtrx_3[0][3] = 8;
		mtrx_3[0][4] = 9;
		
		mtrx_3[1][0] = 2;
		mtrx_3[1][1] = -1;
		mtrx_3[1][2] = 3;
		mtrx_3[1][3] = 3;
		mtrx_3[1][4] = 1;
		
		mtrx_3[2][0] = 0;
		mtrx_3[2][1] = 2;
		mtrx_3[2][2] = 5;
		mtrx_3[2][3] = 5;
		mtrx_3[2][4] = 0;
		
		mtrx_3[3][0] = 3;
		mtrx_3[3][1] = -2;
		mtrx_3[3][2] = 3;
		mtrx_3[3][3] = 5;
		mtrx_3[3][4] = 0;
		
		mtrx_3[4][0] = 2;
		mtrx_3[4][1] = 0;
		mtrx_3[4][2] = 0;
		mtrx_3[4][3] = 0;
		mtrx_3[4][4] = -1;
		
		int resultado_3 = matrix.diffDiagonal(mtrx_3, 5);
		System.out.println("Resultado final 3.: " + resultado_3 + "\n");
	}

}
