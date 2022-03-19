package array;

public class TowDimsArray {
	
	public static void main(String args[]) {

		int[][] arr = new int[2][3];
		int[][] arr2 = {{1, 2, 3}, {4, 5, 6}}; // 2행 3열로 잡힘 
		
		System.out.println(arr.length); // 2 (행 기준)
		System.out.println(arr[0].length); // 3 (첫 행의 요소=열 개수)
	
		
		// 이차원 배열 순회
		for (int i = 0; i<arr2.length; i++) {
			
			for(int j =0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j]); // (0,0) ~ (0,2)
			}
		}
		
		System.out.println("====================");
		
		char[][] alphas = new char[13][2];
		char start = 'A';
		
		for (int i = 0; i<alphas.length; i++) {
			for(int j =0; j<alphas[i].length; j++, start++) {
				alphas[i][j] = start;
				System.out.println(alphas[i][j]); // (0,0) ~ (0,2)
			}
		}

		System.out.println("====================");
		System.out.println(alphas[0]);
		
		
	}
	
}
