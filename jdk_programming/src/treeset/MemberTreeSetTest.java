package treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberTreeSet mhashset = new MemberTreeSet();
		
		Member lee = new Member(101, "Lee");
		
		// ���⼭ ������ ��
		// ��??? Member class�� ������ BST�� ������� �ǵ�
		// ��� ���ؼ� ������ ������ �� �Ǿ� �ִ�!!! 
		// Member ����
		Member kim = new Member(102, "Kim");
		Member park = new Member(103, "Park");
		
		mhashset.addMember(lee);
		mhashset.addMember(park);
		mhashset.addMember(kim);
		
		mhashset.showAll();
		
	

	}

}
