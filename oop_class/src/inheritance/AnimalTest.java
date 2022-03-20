package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	// 이 클래스만의 메서드가 들어갈 수 있음 
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void fly() {
		System.out.println("하늘을 날아갑니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());

		
		// 이것과 똑같다 
//		Animal a = new Human();
//		test.moveAnimal(a);
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
	}
	
	// human도 되고 tiger도 되고 eagle도 들어와야 하니까 상위 클래스 animal
	public void moveAnimal(Animal animal) {
		
		// 상속 -> 가상함수 
		// 다형성을 나타내는 코드 
		animal.move(); // 이 코드 한 줄에 대한 결과가 다양하게 나옴 -> 다형성
		
		// tiger가 들어와도 animal로 upcasting돼서 hunt 함수를 볼 수 없음
		// 원래 type으로 돌아가야 함 -> downcasting
		
		// downcasting
		// 컴파일은 됨. 그런데 이렇게 하게 되면 moveAnimal 호출한 animal이 Human이 아닐 때는 에러가 남...
//		Human human = (Human)animal;
//		human.readBook();

		
		// animal이 다시 human이 될 수 있는가?
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
		
		else{ // 쌩뚱맞은 인스턴스가 들어왔을 떄 
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		// Object로 들어올 수도 있음. 그 Object를 원래 type으로 바꿀 떄.
		
	}

}
