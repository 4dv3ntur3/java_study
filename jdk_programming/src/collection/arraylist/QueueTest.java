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
			System.out.println("큐가 비었습니다");
			return null;
		}
		// FIFO
		return arrayQ.remove(0);
		// get은 반환하지만 arrayList에서 사라지지 않음 
		// 꺼낸다와 꺼내본다의 차이 
		
		
	}
	
	
	
	
}

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
