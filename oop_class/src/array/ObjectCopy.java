package array;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
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
		
		
		// 변경
		bookArray1[0].setBookName("소년이 온다");
		bookArray1[0].setAuthor("한강");

		for (int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("========2=========");
		
		// 복사 후 array1을 바꿨더니 array2도 같이 바뀌어 버림
		// 주소가 복사된 것! 얕은 복사.
		for (int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("=========3========");
		
		for (int i = 0; i<bookArray1.length; i++) {
			bookArray3[i].showBookInfo();
		}
		
		String[] strArr = {"Java", "Android", "C"};
		
		
		// 기존 for문
		for (int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// 향상된 for문 (배열 순회: 처음부터 끝까지 모든 요소 참조할 떄 편리)
		for (String s : strArr) {
			System.out.println(s);
		}
		
		int[] intArr = {1, 2, 3};
		for (int i : intArr) { // i = intArr[i, i+1...];
			System.out.println(i);
		}
		
		
		
		
	}
	
	

}
