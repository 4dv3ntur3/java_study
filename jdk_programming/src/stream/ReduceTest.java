package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
	
	// binary operator�� functional interface�� 
	// �׻� apply��� �޼��尡 ȣ��ǰ� �Ǿ� �ִ�
	
	// reduce()�� ������ �� apply �޼����� �����ΰ� ����Ǵ� �� 
	

	@Override
	public String apply(String s1, String s2) {
		// TODO Auto-generated method stub
		
		// �̰� <= �� �ϸ� ���� ���ڿ� ���� ���� ª�� �� ��ȯ�ϰ� ��
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] greetings = {"�ȳ��ϼ���~~~~~", "hello", "Good Morning", "�ݰ����ϴ�"};
		
		// ���� �� ���ڿ� ã�� �� ������ �����ڰ� �ƴ�
		// �츮�� �����ؾ� ��
		
		// �ѱ� 2����Ʈ�� ���� 1����Ʈ�ϱ� ����Ʈ ���
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
						if(s1.getBytes().length >= s2.getBytes().length)
							return s1;
						else return s2; }
		
							) // reduce()
		); // System.out.println();
		
		
		// apply �κ� ȣ��� 
//		Arrays.stream(greetings).reduce("", new CompareString());
//		Arrays.stream(greetings).reduce(new CompareString()); // �̷��� �� ���� "" ���� ����
		String strr = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(strr);
	}
		
				
}


