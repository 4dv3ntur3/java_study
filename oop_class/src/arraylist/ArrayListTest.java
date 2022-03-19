package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ctrl shift O[오] -> 자동 import
		// 클릭하고 f1 ->  도움말 -> java doc for 어쩌고 누르면 설명 뜸
		// ArrayList에서 String type을 가져다 쓰겠다
		
		ArrayList<String> list = new ArrayList<String>();
		
		// 제네릭 타입으로 (5점대부터는 이렇게 잘 안 씀) 
//		ArrayList list = new ArrayList();
		// 타입 지정 안 하면 String s = list.get(i)가 안 먹힘
		// object로 끌어옴 (최상위 타입)
		// 그떄는 String s = (String)list.get(i)로 type casting 해 줘야 
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		// 향상된 for문
		for(String s: list) {
			System.out.println(s);
		}

		// 기존의 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			// list[i]는 안 됨. ArrayList에서는 index 접근 제공 안 함. 
			// 순수 배열에서만 가능 
		}
		
	}

}
