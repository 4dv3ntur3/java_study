package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQ = new ArrayList<>();
	
	public void enQueue(String data) {
		
		arrayQ.add(data);
		
	}
	
	public String deQueue(String data) {
		int len = arrayQ.size();
		
		if(len == 0) {
			System.out.println("ť�� ������ϴ�");
			return null;
		}
		// FIFO
		return arrayQ.remove(0);
		// get�� ��ȯ������ arrayList���� ������� ���� 
		// �����ٿ� ���������� ���� 
		
		
	}
	
	
	
	
}

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
