package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberTreeMap mtreemap = new MemberTreeMap();
		
		Member lee = new Member(101, "Lee");
		
		// ���⼭ ������ ��
		// ��??? Member class�� ������ BST�� ������� �ǵ�
		// ��� ���ؼ� ������ ������ �� �Ǿ� �ִ�!!! 
		// Member ����
		Member kim = new Member(102, "Kim");
		Member park = new Member(103, "Park");
		
		mtreemap.addMember(lee);
		mtreemap.addMember(park);
		mtreemap.addMember(kim);
		 
		// ������ �ż� ��µ� 
		mtreemap.showAllMember(); 
		
//		
//		mtreemap.removeMember(102); // ����
//		
//		mtreemap.showAllMember();
		
		// ���� �� put ���� �� get
		// hashtable�� vectoró�� ����ȭ ����
		

	}

}
