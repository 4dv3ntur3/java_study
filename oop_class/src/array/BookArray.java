package array;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intarr = new int[3];
		// 4����Ʈ¥���� 3�� = 12����Ʈ
		
		
		Book[] library = new Book[5];
		// å �ټ� ���� ������� �� �ƴ�!!!
		// å�� ������� �ǵ� �� å�� ����ų �ּ��� �ڸ��� 5��
		// ���� new Book �ؼ� �����ϰ� �̰� �����ؾ� �� 

		
		library[0]= new Book("�¹���1", "������");
		library[1]= new Book("�¹���2", "������");
		library[2]= new Book("�¹���3", "������");
		library[3]= new Book("�¹���4", "������");
		library[4]= new Book("�¹���5", "������");
		
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}

		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		

	}

}
