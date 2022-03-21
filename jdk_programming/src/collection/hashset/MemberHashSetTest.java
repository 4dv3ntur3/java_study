package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberHashSet mhashset = new MemberHashSet();
		
		Member lee = new Member(101, "Lee");
		Member kim = new Member(102, "Kim");
		Member park = new Member(103, "Park");
		
		mhashset.addMember(lee);
		mhashset.addMember(kim);
		mhashset.addMember(park);
		
		mhashset.showAll();
		
		System.out.println("========= �ߺ� �߰� �׽�Ʈ ========");
		// �Ѹ� �߰�
		Member shin = new Member(103, "Shin");
		mhashset.addMember(shin);
		mhashset.showAll();
		
		
		// ���? id�� ������ ����... 
		// hashset "aaa" �� �ߺ� �� �Ǵ��� �̰� ���� ��
		// cf. source attachment configuration �߰� �����ϱ�
		// String�� equals�� �����Ǿ� ����
		// �� equals�� hashcode �� �� �����Ǹ� �ؾ� ��
		// Member ��ü���ٰ� �ؾ� �� 
		// ������ �ϰ� ���� �ߺ� �߰� �� �� 
		
		// ������ ��ü�� ���ؼ� (Member)�� ���� equals�� hashcode�� �������ؼ� ��� ��
		// �츮�� ���� ��ü�� 

	}

}
