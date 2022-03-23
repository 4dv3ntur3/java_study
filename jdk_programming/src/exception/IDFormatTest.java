package exception;

public class IDFormatTest {
	
	private String userID;
	

	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
		else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 해 주세요.");
		}
		this.userID = userID;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자 정의 exception 및 메시지 
		IDFormatTest idTest = new IDFormatTest();
		String userID = null;
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		userID = "1234567";
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()); // message만 보인다 
		}
		

	}



}
