package treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tree = new TreeSet<>();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		//컬렉션 프레임워크 class들은 toString 재정의되어 있음
		
		// String class는 comparable 이미 구현해 놨음
		System.out.println(tree); 
		

	}

}
