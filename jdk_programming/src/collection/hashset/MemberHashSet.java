package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

		
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {

		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			// 다음에 가져올 거 없으면 null 반환 -> while 빠져나옴 
			// cursor : 다음에 가져올 element가 있느냐
			Member member = iterator.next(); // 제네릭 타입이 없으면 Object로 반환
			
			int tempId = member.getMemberId();
			
			if (memberId == tempId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		
		// 멤버 아이디 같은 게 없더라 
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;

	}
	
	public void showAll() {

		// hash는 get 없어서 for 불가 
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {

			Member member = iterator.next(); // 제네릭 타입이 없으면 Object로 반환
			System.out.println(member);
	
			System.out.println();

		}
	}

}
