package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberHashMap mhashmap = new MemberHashMap();
		
		Member lee = new Member(101, "Lee");
		
		// 여기서 에러가 남
		// 왜??? Member class를 가지고 BST에 집어넣을 건데
		// 어떻게 비교해서 넣을지 구현이 안 되어 있다!!! 
		// Member 구현
		Member kim = new Member(102, "Kim");
		Member park = new Member(103, "Park");
		
		mhashmap.addMember(lee);
		mhashmap.addMember(park);
		mhashmap.addMember(kim);
		
		mhashmap.showAllMember();
		
		mhashmap.removeMember(102); // 삭제
		
		mhashmap.showAllMember();
		
		// 넣을 땐 put 꺼낼 땐 get
		// hashtable은 vector처럼 동기화 제공
		

	}

}
