package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int[] arr = {1, 2, 3, 4, 5};
//		IntStream stream = Arrays.stream(arr);
		// �̷� ������ ���� �� ��Ȱ��? -> ù ��° ���길 ��� �߰� ���ĺ��ʹ� ������ 
//		int sum = stream.sum();		
		
	//	Arrays.stream(arr); // ��Ʈ�� ����
		int sum = Arrays.stream(arr).sum();		

		System.out.println(sum);
		
//		int count = (int)stream.count();
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
	}

}
