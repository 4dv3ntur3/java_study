package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int size = 0;
		double[] num = new double[5];
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		
		// ��������� �ʱ�ȭ�ϸ� 3, 4 index���� 0.0���� �ʱ�ȭ�Ǿ� ���� 
		num[2] = 30.0; size++; 
		
		double total_sum = 0.0;
		double total_mul = 1;
		
		// num.length �ƴϰ� size��ŭ
		for(int i = 0; i < size; i++) {
			System.out.println(num[i]);
			total_sum += num[i];
			total_mul *= num[i];
			
			// �׷��� ���ϱ⸦ �ϰ� �Ǹ� 0.0�� �־ 0.0���� ������ ��
			// ������ ���鸸 ���ϱ� �ϰ� �ʹٸ�? 
			// length��ŭ�� for�� ���� �� �ƴ� -> ��ȿ�� size�� ����� 
		}
		
		System.out.println("total: "+total_mul);

	}

}
