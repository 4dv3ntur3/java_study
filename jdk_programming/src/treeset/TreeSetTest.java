package treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tree = new TreeSet<>();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		//�÷��� �����ӿ�ũ class���� toString �����ǵǾ� ����
		
		// String class�� comparable �̹� ������ ����
		System.out.println(tree); 
		

	}

}
