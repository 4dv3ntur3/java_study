package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	
	// Member가 collection.arraylist 패키지 밑에 없음
	// 공유하지 않는 패키지라서 안 보임...
	// reflect 패키지 아님 우리 거 불러와야 함 
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		// 멤버 아이디가 같은 멤버를 삭제
		// 101 이순신 - 102 김유신 - 103 강감찬
		// 103번 삭제 -> element를 각각 꺼내서 비교해서 확인
		
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
			// 다음에 가져올 거 없으면 null 반환 -> while 빠져나옴 
			// cursor : 다음에 가져올 element가 있느냐
			Member member = iterator.next(); // 제네릭 타입이 없으면 Object로 반환
			
			int tempId = member.getMemberId();
			
			if (memberId == tempId) {
				arrayList.remove(member);
				// index랑 object 자체를 넣을 수 있다 
				// 이번엔 object 자체를 넣어서 삭제 
				return true;
			}
		}
		
		
		// 멤버 아이디 같은 게 없더라 
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;

	}
	
	public void showAll() {
		// 이것도 iterator로 고칠 수 있음 
		for(Member m: arrayList) {
			// toString 재정의해 뒀으니까 알아서  출력될 것 
			System.out.println(m);
		}
		
		// 한줄 개행
		System.out.println();
		// arrayList의 toString()
		// 모든 멤버의 toString 호출해서 쉼표로 구분 출력 
//		System.out.println(arrayList);
	}

}
