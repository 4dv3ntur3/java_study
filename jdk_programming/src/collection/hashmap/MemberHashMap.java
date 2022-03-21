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
		// 집어넣기 = put
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		
		// memberId에 대한 멤버 삭제
		// iterator로 있는지 없는지 확인하고 지웠는데 
		// hashmap에는 containskey라는 메서드가 있음
		if(hashMap.containsKey(memberId)) {
			
			// memberid라는 이 key값에 대한 오브젝트가 해시맵 테이블 안에 있느냐
//			hashMap.get(memberId);
			hashMap.remove(memberId);
			return true; // 삭제 성공
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false; // 삭제 실패
		
	}
	
	public void showAllMember() {
		
		// keyset 하면 key list, 이걸 iterator로
		// value로 해도 됨
		// 둘 다 불러오는 건 없음 
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while (ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
		
	}
}
