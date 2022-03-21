package treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

		
	private TreeSet<Member> hashSet;
	
	public MemberTreeSet() {
//		hashSet = new TreeSet<Member>();
		
		// comparator ����� ����
		hashSet = new TreeSet<Member>(new Member());
		// �̷��� �ϸ� Member() �⺻ ������ ���� �� ���� ����
		// ���� ����� �ָ� ��
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {

		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			// ������ ������ �� ������ null ��ȯ -> while �������� 
			// cursor : ������ ������ element�� �ִ���
			Member member = iterator.next(); // ���׸� Ÿ���� ������ Object�� ��ȯ
			
			int tempId = member.getMemberId();
			
			if (memberId == tempId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		
		// ��� ���̵� ���� �� ������ 
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;

	}
	
	public void showAll() {

		// hash�� get ��� for �Ұ� 
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {

			Member member = iterator.next(); // ���׸� Ÿ���� ������ Object�� ��ȯ
			System.out.println(member);
	
			System.out.println();

		}
	}

}
