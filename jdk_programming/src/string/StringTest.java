package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc"); // final�� ������ �Ǿ� ���� 
		// "abcd"�� �� ���� ����
		String str2 = new String("abc");
		
		System.out.println(str1==str2); // false
		
		
		// ���ڿ� ����� �ϰ� �Ǹ� ������ �޸𸮸� ����Ű�� �� 
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3==str4); // true
		
	
		
		String str5 = new String("java");
		
		System.out.println(System.identityHashCode(str5));
		
		String str6 = new String("android");
		
		str5 = str5.concat(str6); 
		// ���� �� �ƴ϶� ���ο� �޸𸮰� ���ܼ� java android
		
		System.out.println(str5);
		
		System.out.println(System.identityHashCode(str5)); // ���� �Ͱ� �ٸ� �޸� �� 
		


	}

}
