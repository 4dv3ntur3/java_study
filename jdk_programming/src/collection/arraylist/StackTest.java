package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	
	// 이렇게 해도 컴파일 에러 안 난다 
	// private ArrayList<String> arrayStack = new ArrayList<>();
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	// push
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// 우리가 String으로 넣었으니 빼는 객체도 String이겠지
	public String pop() {
		
		//underflow error handling
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		// 제일 마지막 element
		return arrayStack.remove(len-1);
		
		
//		String data = arrayStack.remove(len-1);
//		return data;
				
		
	}
	
	// 꺼내 보기만 함 
	public String peek() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		// 제일 마지막 element get!!
		return arrayStack.get(len-1);
	}
}

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.peek());
		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		// 비었다 
		System.out.println(stack.pop());
		// underflow 확인 안 해 주면 에러 남 

	}

}
