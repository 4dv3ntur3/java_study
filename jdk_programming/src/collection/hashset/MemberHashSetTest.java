package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberHashSet mhashset = new MemberHashSet();
		
		Member lee = new Member(101, "Lee");
		Member kim = new Member(102, "Kim");
		Member park = new Member(103, "Park");
		
		mhashset.addMember(lee);
		mhashset.addMember(kim);
		mhashset.addMember(park);
		
		mhashset.showAll();
		
		System.out.println("========= 중복 추가 테스트 ========");
		// 한명 추가
		Member shin = new Member(103, "Shin");
		mhashset.addMember(shin);
		mhashset.showAll();
		
		
		// 어라? id가 같은데 들어가네... 
		// hashset "aaa" 는 중복 안 되더니 이게 무슨 일
		// cf. source attachment configuration 추가 정리하기
		// String은 equals가 구현되어 있음
		// 즉 equals랑 hashcode 둘 다 재정의를 해야 함
		// Member 객체에다가 해야 함 
		// 재정의 하고 나면 중복 추가 안 됨 
		
		// 쓰려는 객체에 대해서 (Member)에 대해 equals랑 hashcode는 재정의해서 써야 됨
		// 우리가 만든 객체들 

	}

}
