package treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	// string에 이미 구현되어 있지만 comparator를 사용해서 구현하겠다 
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		// return o1.compareTo(o2); // 이게 default임 (오름차순)
		// 이 default를 내림차순으로 바꾸겠다 
		return o1.compareTo(o2)*(-1);
	}
		
}


public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeSet<String> tree = new TreeSet<>(); // 기존
		
		// 비교 방식 변경해라 
		TreeSet<String> tree = new TreeSet<>(new MyCompare());
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		//컬렉션 프레임워크 class들은 toString 재정의되어 있음
		
		// String class는 comparable 이미 구현해 놨음
		System.out.println(tree); // ccc bbb aaa 

	}

}
