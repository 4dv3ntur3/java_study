package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		// �迭�� �� �ڿ� �߰� 
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		// �� �տ��� ������ (get�� �ƴ�) = pop
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
