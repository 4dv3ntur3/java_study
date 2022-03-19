package array;

public class ArrayTest3 {
	public static void main(String args[]) {
		
		char[] alphas = new char[26];
		char ch = 'A'; // 내부적으로는 정수 
		
		for (int i=0; i<alphas.length; i++, ch++) {
			alphas[i] = ch;
		}
		
		for (int i=0; i<alphas.length; i++, ch++) {
			System.out.println(alphas[i]);
		}
		
		// 문자 배열 -> 문자열 String (java class에서 제공해 주고 있음)
		
	}

}
