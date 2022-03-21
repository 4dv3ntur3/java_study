package collection;

import java.util.Comparator;

// comparable�̶� comparator �� �ϳ��� ����
// comparator �� �� collection class �����ڿ� default constructor �Ѱ���� �ϰ�
// ��κ� comparable�� �����Ǿ� �ִµ� �ٸ� �ɷ� ���ϴ� �� �ٲٰ� �ʹ�
// -> comparator������� ���� 
public class Member implements Comparable<Member>, Comparator<Member>{
	
	// f1 ����
	// �ʿ��� �� ã�Ƽ� �� �� ������ �ȴ�
	// interface�� 
	// �̷� �޼��带 �ϰ� �����ؾ� �Ѵ�~... ->abstract�� �ֱ�� �ѵ� �ƹ�ư Ŭ������ ������ 
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
	
	// toString ������
	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// ���� �ո����� ��
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if (obj instanceof Member) {
			Member member = (Member)obj; // obj�� Member�� �ٿ�ĳ����
			
			if(this.memberId == member.memberId) {
				return true;
			}
			
			else return false;
		}
		// member �ν��Ͻ��� �ƴϸ� �� �͵� ����
		return false;
	}

	// Comparable implements 
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		// �߰��Ǵ� ��ü = �� = this�� ������ Ʈ���� �����ϰ� �ִ� ����� �� �ϳ��� ��
		// Ʈ���� ��� �����Ǿ� �ִ��Ŀ� ���� � �ֶ� ���ϰ� ���� �ٸ�
		
		// �̼��� ������ �Ż��Ӵ� ��
		// �� ���� ����?
		// �̸���? id��? 
		// id������ �� ����
		
		//return (this.memberId - member.memberId);
//		 return (this.memberId - member.memberId)*(-1); // ��������
		// �� ���� ����̸� ��������, �����̸� ������������ ���ĵ�
		
		// �̸����� �� ���ڴ�
		return (this.memberName.compareTo(member.memberName));
		
	}

	// Comparator 
	// �ٵ� Comparable�̶� ���� ���� �� ���� ���� �ְ� �Ҹ�
	// ����??? -> Constructor ����
	@Override
	public int compare(Member m1, Member m2) {
		// TODO Auto-generated method stub
		//  �� ���� �Ѱܹ���
		// o1�� ���� o2�� ���� ��
		return (m1.memberId - m2.memberId);

		
	}

}
