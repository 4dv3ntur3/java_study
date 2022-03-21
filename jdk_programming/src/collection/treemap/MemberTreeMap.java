package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> hashMap;
	
	public MemberTreeMap() {
		// comparable 바꿀 때 여기서 new Integer()
		// 다른 클래스면 그 클래스에 가서 comparable 구현하고 여기 넣어 주고 .
		hashMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		// 집어넣기 = put
		// 왜 정렬이 될까?
		// int로 들어와도 Integer 객체로 오토박싱
		// Integer 객체에 comparable이 구현되어 있다
		// 이거 바꾸려면 comparator 구현하면 됨 
		// 아까는 Member가 들어가서 구현했는데
		// 이거 바꾸려면 treeMap = new TreeMap<Integer, Member>(new Integer());
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
