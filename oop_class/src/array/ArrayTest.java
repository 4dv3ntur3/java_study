package array;

public class ArrayTest {

	public static void main(String args[]) {
		
		int num = 10;
		// 배열 선언
		int[] numbers = new int[3];
		// 초기화
		numbers[0] = 1;
		numbers[1] = 3;
		numbers[2] = 4;
		
		// 배열 선언 및 초기화
		int[] numbers__; // 얘만 있으면 오류 
		numbers__ = new int[3]; // 자료형에 맞게 0으로 초기화됨
		// 0, 0.0, null(객체 배열의 경우)
		// numbers__ = {0, 1, 2}; 이렇게는 안됨 
		
		// 배열 선언 & 초기화
		int[] numbers2 = new int[] {0, 1, 2};
		
		// 이렇게도 가능 
		int[] numbers3 = {0, 1, 2};
		
//		System.out.println(numbers.length);
		
		// i <= 3 보다는 i < 4
		for(int i=0; i<numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
	}
}
