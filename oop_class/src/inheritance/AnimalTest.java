package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	// �� Ŭ�������� �޼��尡 �� �� ���� 
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
	public void hunt() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void fly() {
		System.out.println("�ϴ��� ���ư��ϴ�.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());

		
		// �̰Ͱ� �Ȱ��� 
//		Animal a = new Human();
//		test.moveAnimal(a);
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
	}
	
	// human�� �ǰ� tiger�� �ǰ� eagle�� ���;� �ϴϱ� ���� Ŭ���� animal
	public void moveAnimal(Animal animal) {
		
		// ��� -> �����Լ� 
		// �������� ��Ÿ���� �ڵ� 
		animal.move(); // �� �ڵ� �� �ٿ� ���� ����� �پ��ϰ� ���� -> ������
		
		// tiger�� ���͵� animal�� upcasting�ż� hunt �Լ��� �� �� ����
		// ���� type���� ���ư��� �� -> downcasting
		
		// downcasting
		// �������� ��. �׷��� �̷��� �ϰ� �Ǹ� moveAnimal ȣ���� animal�� Human�� �ƴ� ���� ������ ��...
//		Human human = (Human)animal;
//		human.readBook();

		
		// animal�� �ٽ� human�� �� �� �ִ°�?
		// Human h = animal; (x)
		

		// Human h = (Human)animal;
		
		
		if(animal instanceof Human) {
			Human h = (Human)animal;
			h.readBook();
		}
		
		else if (animal instanceof Tiger) {
			Tiger t = (Tiger)animal;
			t.hunt();
		}
		
		else if (animal instanceof Eagle) {
			Eagle e = (Eagle)animal;
			e.fly();
		}
		
		else{ // �߶׸��� �ν��Ͻ��� ������ �� 
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		// Object�� ���� ���� ����. �� Object�� ���� type���� �ٲ� ��.
		
	}

}
