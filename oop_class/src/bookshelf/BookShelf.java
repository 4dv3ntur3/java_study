package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		// 배열의 맨 뒤에 추가 
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		// 맨 앞에서 꺼내기 (get은 아님) = pop
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
