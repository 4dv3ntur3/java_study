package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
	
	// binary operator는 functional interface고 
	// 항상 apply라는 메서드가 호출되게 되어 있다
	
	// reduce()가 구현될 때 apply 메서드의 구현부가 수행되는 것 
	

	@Override
	public String apply(String s1, String s2) {
		// TODO Auto-generated method stub
		
		// 이걸 <= 로 하면 이제 문자열 길이 가장 짧은 걸 반환하게 됨
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] greetings = {"안녕하세요~~~~~", "hello", "Good Morning", "반갑습니다"};
		
		// 가장 긴 문자열 찾는 건 기존의 연산자가 아님
		// 우리가 구현해야 함
		
		// 한글 2바이트고 영어 1바이트니까 바이트 계산
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
						if(s1.getBytes().length >= s2.getBytes().length)
							return s1;
						else return s2; }
		
							) // reduce()
		); // System.out.println();
		
		
		// apply 부분 호출됨 
//		Arrays.stream(greetings).reduce("", new CompareString());
//		Arrays.stream(greetings).reduce(new CompareString()); // 이렇게 쓸 때는 "" 생략 가능
		String strr = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(strr);
	}
		
				
}


