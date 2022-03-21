package collection.arraylist;

import collection.Member;

public class MemberArraylistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList members = new MemberArrayList();
		
		Member lee = new Member(101, "Lee");
		Member kim = new Member(102, "Kim");
		Member park = new Member(103, "Park");
		

		members.addMember(lee);
		members.addMember(kim);
		members.addMember(park);
		members.showAll();
		
		members.removeMember(kim.getMemberId());
		members.showAll();
		
		
		
		
	}

}
