package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	// private�� �Ϸ��ϱ� ����ϴ� Ŭ�������� �� �� 
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}

}
