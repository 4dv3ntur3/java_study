package myblog;

import java.util.List;

// ����ȯ���� �ƴ� �ٸ� �����쿡�� �����ϴ� ��
public class LottoStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lotto lotto = new Lotto();
		List<Integer> basketList = lotto.getBasketList();
		
		StringBuffer sb = new StringBuffer();
		
		for(Integer number: basketList) {
			// ��ȣ +" "(����) �� �� �ٷ� 
			sb.append(number).append(" ");
		}
		
		// ��� �α�
		System.out.println("=========================================");
		System.out.println("�̹� �ֿ� ���� �� �ζ� 1�� ��ȣ�� " + sb.toString());
		System.out.println("=========================================");
		


	}

}
