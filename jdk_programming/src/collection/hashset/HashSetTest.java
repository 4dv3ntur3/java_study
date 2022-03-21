package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set 인터페이스
		// 내부적으로 해시방식으로 저장하기 떄문에 저장순서 출력순서 다를 수 있다
		
		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		System.out.println(b1);
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
		
		boolean b = set.add("aaa");
		System.out.println(b); // false 안 들어갔다. 같은 element라서 
		System.out.println(set); // 중복 안 받음
		
		
		
		
		
	}

}
