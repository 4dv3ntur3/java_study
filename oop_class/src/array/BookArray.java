package array;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intarr = new int[3];
		// 4바이트짜리가 3개 = 12바이트
		
		
		Book[] library = new Book[5];
		// 책 다섯 권이 만들어진 게 아님!!!
		// 책이 만들어질 건데 그 책을 가리킬 주소의 자리가 5개
		// 따라서 new Book 해서 생성하고 이걸 대입해야 됨 

		
		library[0]= new Book("태백산맥1", "조정래");
		library[1]= new Book("태백산맥2", "조정래");
		library[2]= new Book("태백산맥3", "조정래");
		library[3]= new Book("태백산맥4", "조정래");
		library[4]= new Book("태백산맥5", "조정래");
		
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}

		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		

	}

}
