package jdk_programming;

class Book {
	String title;
	String author;
	
	// 생성자
	Book(String title, String author) {
		this.title = title;
		this.author = author;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return title+","+author;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book book = new Book("두잇자바", "박은종");
		System.out.println(book); // jdk_programming.Book@32d2fa64
		
		// String class의 toString이 이미 주소 출력이 아니라 문자열 출력하도록 재정의가 되어 있음
		String str = new String("test");
		System.out.println(str); // test
		

	}

}
