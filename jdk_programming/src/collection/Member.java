package collection;

import java.util.Comparator;

// comparable이랑 comparator 중 하나만 구현
// comparator 쓸 때 collection class 생성자에 default constructor 넘겨줘야 하고
// 대부분 comparable이 구현되어 있는데 다른 걸로 비교하는 걸 바꾸고 싶다
// -> comparator방식으로 구현 
public class Member implements Comparable<Member>, Comparator<Member>{
	
	// f1 도움말
	// 필요할 때 찾아서 쓸 수 있으면 된다
	// interface임 
	// 이런 메서드를 니가 구현해야 한다~... ->abstract도 있기는 한데 아무튼 클래스가 구현함 
	// Collection
	
	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// toString 재정의
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// 가장 합리적인 값
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if (obj instanceof Member) {
			Member member = (Member)obj; // obj를 Member로 다운캐스팅
			
			if(this.memberId == member.memberId) {
				return true;
			}
			
			else return false;
		}
		// member 인스턴스가 아니면 볼 것도 없음
		return false;
	}

	// Comparable implements 
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		// 추가되는 객체 = 나 = this와 기존의 트리를 구성하고 있던 멤버들 중 하나와 비교
		// 트리가 어떻게 구성되어 있느냐에 따라 어떤 애랑 비교하게 될지 다름
		
		// 이순신 김유신 신사임당 순
		// 뭘 비교할 건지?
		// 이름순? id순? 
		// id순으로 해 보자
		
		//return (this.memberId - member.memberId);
//		 return (this.memberId - member.memberId)*(-1); // 내림차순
		// 이 값이 양수이면 오름차순, 음수이면 내림차순으로 정렬됨
		
		// 이름순을 해 보겠다
		return (this.memberName.compareTo(member.memberName));
		
	}

	// Comparator 
	// 근데 Comparable이랑 같이 쓰면 얘 말고 위에 애가 불림
	// 왜지??? -> Constructor 수정
	@Override
	public int compare(Member m1, Member m2) {
		// TODO Auto-generated method stub
		//  두 개씩 넘겨받음
		// o1이 나고 o2가 비교할 애
		return (m1.memberId - m2.memberId);

		
	}

}
