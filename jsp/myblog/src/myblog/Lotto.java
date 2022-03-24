package myblog;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public List<Integer> getBasketList() {
		// TODO Auto-generated method stub
		
		// import�� �� ��������... �ָ� List import�ϸ� �� �� 
		// 1. �ζ� ��ȣ ����� ������ ���� �ʿ�
		List<Integer> basketList = new ArrayList<Integer>();
		
		// 2.�ζ� ��ȣ�� ������ Ŭ����
		Random random = new Random();
		
		// 3. �ζ� ��ȣ�� 6�� ����
		while(true) {
			int number = random.nextInt(46); // 0���� 45���� ����
			System.out.println(number);
			
			if(number == 0) {
				continue; // �� ���� �� �������� ���� �׳� ���� �ݺ����� 
			}
			
			if (basketList.contains(number)) {
				// ��ٱ��Ͽ� ���� ��ȣ�� �ִ�!
				System.out.println("number: " + number + " �� ������ ��ϵ� ��ȣ�Դϴ�.");
				
			} else {
				// ��ٱ��Ͽ� ���� ��ȣ ����
				System.out.println("number: " + number + " �� ������ ��ϵ��� ���� ��ȣ�Դϴ�.");
				basketList.add(number);
			}
			
			if (basketList.size() >= 6) {
				System.out.println("�ζ� ��ȣ 6�� ����Ϸ�");
				break;
			}
		}
		
		return basketList;
		

		
	}

}
