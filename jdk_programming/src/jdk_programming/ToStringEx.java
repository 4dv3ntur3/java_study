package jdk_programming;

class Book {
	String title;
	String author;
	
	// ������
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
		
		
		Book book = new Book("�����ڹ�", "������");
		System.out.println(book); // jdk_programming.Book@32d2fa64
		
		// String class�� toString�� �̹� �ּ� ����� �ƴ϶� ���ڿ� ����ϵ��� �����ǰ� �Ǿ� ����
		String str = new String("test");
		System.out.println(str); // test
		

	}

}
