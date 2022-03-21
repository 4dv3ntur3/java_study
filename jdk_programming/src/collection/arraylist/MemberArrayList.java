package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	
	// Member�� collection.arraylist ��Ű�� �ؿ� ����
	// �������� �ʴ� ��Ű���� �� ����...
	// reflect ��Ű�� �ƴ� �츮 �� �ҷ��;� �� 
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		// ��� ���̵� ���� ����� ����
		// 101 �̼��� - 102 ������ - 103 ������
		// 103�� ���� -> element�� ���� ������ ���ؼ� Ȯ��
		
		/*
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			
			if (memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}
		*/
		
		// iterator ver.
		// util.iterator
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			// ������ ������ �� ������ null ��ȯ -> while �������� 
			// cursor : ������ ������ element�� �ִ���
			Member member = iterator.next(); // ���׸� Ÿ���� ������ Object�� ��ȯ
			
			int tempId = member.getMemberId();
			
			if (memberId == tempId) {
				arrayList.remove(member);
				// index�� object ��ü�� ���� �� �ִ� 
				// �̹��� object ��ü�� �־ ���� 
				return true;
			}
		}
		
		
		// ��� ���̵� ���� �� ������ 
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;

	}
	
	public void showAll() {
		// �̰͵� iterator�� ��ĥ �� ���� 
		for(Member m: arrayList) {
			// toString �������� �����ϱ� �˾Ƽ�  ��µ� �� 
			System.out.println(m);
		}
		
		// ���� ����
		System.out.println();
		// arrayList�� toString()
		// ��� ����� toString ȣ���ؼ� ��ǥ�� ���� ��� 
//		System.out.println(arrayList);
	}

}
