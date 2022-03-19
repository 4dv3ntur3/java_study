package array;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = new Book[3];
		
		bookArray1[0] = new Book("�¹���1", "������");
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");
		
		// deep copy
		bookArray3[0] = new Book();
		bookArray3[1] = new Book();
		bookArray3[2] = new Book();
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("=================");
		
		// deep copy 
		for (int i = 0; i<bookArray1.length; i++) {
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
			bookArray3[i].setBookName(bookArray1[i].getBookName());
		}
		
		for (int i = 0; i<bookArray1.length; i++) {
			bookArray3[i].showBookInfo();
		}
		
		System.out.println("=================");
		
		
		// ����
		bookArray1[0].setBookName("�ҳ��� �´�");
		bookArray1[0].setAuthor("�Ѱ�");

		for (int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("========2=========");
		
		// ���� �� array1�� �ٲ���� array2�� ���� �ٲ�� ����
		// �ּҰ� ����� ��! ���� ����.
		for (int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("=========3========");
		
		for (int i = 0; i<bookArray1.length; i++) {
			bookArray3[i].showBookInfo();
		}
		
		String[] strArr = {"Java", "Android", "C"};
		
		
		// ���� for��
		for (int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// ���� for�� (�迭 ��ȸ: ó������ ������ ��� ��� ������ �� ��)
		for (String s : strArr) {
			System.out.println(s);
		}
		
		int[] intArr = {1, 2, 3};
		for (int i : intArr) { // i = intArr[i, i+1...];
			System.out.println(i);
		}
		
		
		
		
	}
	
	

}
