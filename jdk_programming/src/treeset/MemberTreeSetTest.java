package treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberTreeSet mhashset = new MemberTreeSet();
		
		Member lee = new Member(101, "Lee");
		
		// 여기서 에러가 남
		// 왜??? Member class를 가지고 BST에 집어넣을 건데
		// 어떻게 비교해서 넣을지 구현이 안 되어 있다!!! 
		// Member 구현
		Member kim = new Member(102, "Kim");
		Member park = new Member(103, "Park");
		
		mhashset.addMember(lee);
		mhashset.addMember(park);
		mhashset.addMember(kim);
		
		mhashset.showAll();
		
	

	}

}
