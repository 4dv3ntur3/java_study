package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	// private로 하려니까 상속하는 클래스에서 못 씀 
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
