package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		// ����ֱ� = put
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		
		// memberId�� ���� ��� ����
		// iterator�� �ִ��� ������ Ȯ���ϰ� �����µ� 
		// hashmap���� containskey��� �޼��尡 ����
		if(hashMap.containsKey(memberId)) {
			
			// memberid��� �� key���� ���� ������Ʈ�� �ؽø� ���̺� �ȿ� �ִ���
//			hashMap.get(memberId);
			hashMap.remove(memberId);
			return true; // ���� ����
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false; // ���� ����
		
	}
	
	public void showAllMember() {
		
		// keyset �ϸ� key list, �̰� iterator��
		// value�� �ص� ��
		// �� �� �ҷ����� �� ���� 
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while (ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
		
	}
}
