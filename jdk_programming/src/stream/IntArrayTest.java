package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int[] arr = {1, 2, 3, 4, 5};
//		IntStream stream = Arrays.stream(arr);
		// 이런 식으로 선언 후 재활용? -> 첫 번째 연산만 결과 뜨고 이후부터는 에러남 
//		int sum = stream.sum();		
		
	//	Arrays.stream(arr); // 스트림 생성
		int sum = Arrays.stream(arr).sum();		

		System.out.println(sum);
		
//		int count = (int)stream.count();
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
	}

}
