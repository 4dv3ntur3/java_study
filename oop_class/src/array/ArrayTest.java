package array;

public class ArrayTest {

	public static void main(String args[]) {
		
		int num = 10;
		// �迭 ����
		int[] numbers = new int[3];
		// �ʱ�ȭ
		numbers[0] = 1;
		numbers[1] = 3;
		numbers[2] = 4;
		
		// �迭 ���� �� �ʱ�ȭ
		int[] numbers__; // �길 ������ ���� 
		numbers__ = new int[3]; // �ڷ����� �°� 0���� �ʱ�ȭ��
		// 0, 0.0, null(��ü �迭�� ���)
		// numbers__ = {0, 1, 2}; �̷��Դ� �ȵ� 
		
		// �迭 ���� & �ʱ�ȭ
		int[] numbers2 = new int[] {0, 1, 2};
		
		// �̷��Ե� ���� 
		int[] numbers3 = {0, 1, 2};
		
//		System.out.println(numbers.length);
		
		// i <= 3 ���ٴ� i < 4
		for(int i=0; i<numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
	}
}
