package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �׳� List��� �ص� �� (arraylist�� ���� �������̽�)
		List<String> sList = new ArrayList<String>();
		sList.add("Thomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		// stream ���� ���� �����̳� �׷� �� ���� ��ȯ�� Ȯ���ؼ� �ޱ� 
		stream.forEach(s->System.out.println(s));
		// ��Ʈ�� �Ҹ�. �ٽ� �����ؼ� ��� �� ��Ȱ�� �Ұ�
		
		//���� �Ͱ� ������ ���� 
//		for(String s:sList) {
//			System.out.println(s);
//		}
		
		// sorted������ �߰�������
		// foreach���� ����ϴ°� ����������
		sList.stream().sorted().forEach(s->System.out.println(s));
		

	}

}
