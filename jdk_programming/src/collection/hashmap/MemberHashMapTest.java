package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberHashMap mhashmap = new MemberHashMap();
		
		Member lee = new Member(101, "Lee");
		
		// ���⼭ ������ ��
		// ��??? Member class�� ������ BST�� ������� �ǵ�
		// ��� ���ؼ� ������ ������ �� �Ǿ� �ִ�!!! 
		// Member ����
		Member kim = new Member(102, "Kim");
		Member park = new Member(103, "Park");
		
		mhashmap.addMember(lee);
		mhashmap.addMember(park);
		mhashmap.addMember(kim);
		
		mhashmap.showAllMember();
		
		mhashmap.removeMember(102); // ����
		
		mhashmap.showAllMember();
		
		// ���� �� put ���� �� get
		// hashtable�� vectoró�� ����ȭ ����
		

	}

}
