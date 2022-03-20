package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc"); // final로 선언이 되어 있음 
		// "abcd"가 될 수가 없음
		String str2 = new String("abc");
		
		System.out.println(str1==str2); // false
		
		
		// 문자열 상수로 하게 되면 동일한 메모리를 가리키게 됨 
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3==str4); // true
		
	
		
		String str5 = new String("java");
		
		System.out.println(System.identityHashCode(str5));
		
		String str6 = new String("android");
		
		str5 = str5.concat(str6); 
		// 붙은 게 아니라 새로운 메모리가 생겨서 java android
		
		System.out.println(str5);
		
		System.out.println(System.identityHashCode(str5)); // 위의 것과 다른 메모리 값 
		


	}

}
