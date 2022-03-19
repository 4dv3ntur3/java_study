package thisex;

class Person {
	
	String name;
	int age;
	
	public Person() {
		
		// 기본 생성자가 호출됐을 때 name은 이름 없음, 나이는 1이라고 넣도록 하고 싶다
		// 이렇게 할 수도 있지만 이미 이름이랑 나이를 넣어주는 생성자가 있으므로
		// 이를 활용하자 
//		name = "이름없음";
//		age = 1;
		
		// 매개변수 타입/개수가 맞으면 알아서 맞는 걸로 
		// 매핑돼서 호출
		this("이름 없음", 1); 
		
		// 주의할 점
		// 이렇게 this를 쓸 때는 이 위에 다른 코드(문장)이 올 수가 없음
		// name = "";
		// age = 1;
		// this("이름 없음", 1); 
		// 이렇게 쓰면 오류 남 
		// 왜냐하면 멤버변수는 person이라는 인스턴트가 다 생성돼야 만들어짐. 메모리 잡히고.
		// 그런데 생성자 생성이 언제 끝나냐면 this가 불린 다음 
		// 다른 초기화가 다 일어난 다음에 만들어지는 것
		// 그래서 생성하려고 this를 부르는 건데, 그 전에 name= 이런 식으로 하면
		// 오류가 발생할 수 있음 
		// 생성하지 않은 메모리에 값을 assign하는 일이 일어날 수도 
		// 따라서 이렇게 쓸 때는 this는 이 객체가 생성되기 위해서 다른 생성자를 부르는 거니까
		// 아직 이 객체가 제대로 생성이 안 됐다는 뜻임!
		// 그래서 이 전에 다른 statement를 사용할 수 없다 

		
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this; // this를 return할 때 반환형은 class 이름
		// 현재 인스턴스의 주소값 반환 
	}
	
}

public class CallAnotherConst {
	
	Person p1 = new Person();
	
	public static void main(String args[]) {
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf()); // thisex.Person@32d2fa64
	}
	
	

}
