package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		// 어떤 class의 정보를 알아올 수 있음 
//		Class c 
		// 원격에 있는 class 로딩
		// local에서 알 수 없는 class를 사용해야 할 때 (reflection programming)
		// 요새는 웹서버가 다 있어서 이럴 일은 잘 없음...
		// 안드로이드? 
		
		// Class.forName("클래스 이름") 메서드는 중요하다
		
		// 이름 가져오는 방법 3가지 
		// 1, 2 같은 경우는 person이라는 클래스가 컴파일되어 있어야 사용 가능 (static 로딩)
		// 데이터 타입이 다 맞아야 컴파일
		// 3 같은 경우는 문자열로 쓰기 때문에 이 이름의 클래스가 있으면 그 클래스를 메모리에 로드 (동적 로딩)***
		// 얘는 컴파일은 다 됨... 근데 run time때 에러 
		// 1. 이미 생성된 인스턴스가 있으면 Object의 getClass 메서드 
		Person person = new Person();
		Class pClass = person.getClass();
		System.out.println(pClass.getName()); // classex.Person (클래스의 풀 네임: 패키지.클래스이름)
		
		// 2. 
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName()); // classex.Person 
		// 3. 꼭 기억할 것!!!
		Class pClass3 = Class.forName("classex.Person"); // classex.Person
		// 저 클래스가 실제로 없을 수도 있지만 일단 string으로 처리되기 떄문에 실행하기 전에는 모른다 
		// 그러므로 exception throws
		
		// reflection programming 
		Person p = new Person();
		Person p2 = (Person)pClass3.newInstance(); // deprecated 예정
		// newInstance()가 불리면 default constructor 호출됨 
		// 다른 생성자 쓰려면 Constructor[] 로 가져와서 쓰면 됨
		System.out.println(p);
		System.out.println(p2);
		
		
		
	}
	

}
