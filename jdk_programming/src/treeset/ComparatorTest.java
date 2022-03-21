package treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	// string�� �̹� �����Ǿ� ������ comparator�� ����ؼ� �����ϰڴ� 
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		// return o1.compareTo(o2); // �̰� default�� (��������)
		// �� default�� ������������ �ٲٰڴ� 
		return o1.compareTo(o2)*(-1);
	}
		
}


public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeSet<String> tree = new TreeSet<>(); // ����
		
		// �� ��� �����ض� 
		TreeSet<String> tree = new TreeSet<>(new MyCompare());
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		//�÷��� �����ӿ�ũ class���� toString �����ǵǾ� ����
		
		// String class�� comparable �̹� ������ ����
		System.out.println(tree); // ccc bbb aaa 

	}

}
