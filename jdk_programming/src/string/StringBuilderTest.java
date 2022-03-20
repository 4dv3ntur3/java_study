package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1)); // 438135304
	
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer)); //936580213
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer)); //936580213
		
		String str2 = buffer.toString();
		System.out.println(str2); // java and android
		
		// 계속 문자열을 연결해서 결과를 찍어내야 하는 일 -> String x StringBuilder / Buffer 중 하나 사용 후
		// 내용물만 뽑을 때는 toString 사용
		
//		Integer i = new Integer(100); // deprecated 예정.
		Integer i = 100;
		

	}

}
