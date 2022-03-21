package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> hashMap;
	
	public MemberTreeMap() {
		// comparable �ٲ� �� ���⼭ new Integer()
		// �ٸ� Ŭ������ �� Ŭ������ ���� comparable �����ϰ� ���� �־� �ְ� .
		hashMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		// ����ֱ� = put
		// �� ������ �ɱ�?
		// int�� ���͵� Integer ��ü�� ����ڽ�
		// Integer ��ü�� comparable�� �����Ǿ� �ִ�
		// �̰� �ٲٷ��� comparator �����ϸ� �� 
		// �Ʊ�� Member�� ���� �����ߴµ�
		// �̰� �ٲٷ��� treeMap = new TreeMap<Integer, Member>(new Integer());
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
