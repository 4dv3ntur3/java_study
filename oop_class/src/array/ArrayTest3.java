package array;

public class ArrayTest3 {
	public static void main(String args[]) {
		
		char[] alphas = new char[26];
		char ch = 'A'; // ���������δ� ���� 
		
		for (int i=0; i<alphas.length; i++, ch++) {
			alphas[i] = ch;
		}
		
		for (int i=0; i<alphas.length; i++, ch++) {
			System.out.println(alphas[i]);
		}
		
		// ���� �迭 -> ���ڿ� String (java class���� ������ �ְ� ����)
		
	}

}
