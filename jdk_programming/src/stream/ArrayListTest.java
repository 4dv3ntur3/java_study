package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 그냥 List라고 해도 됨 (arraylist의 상위 인터페이스)
		List<String> sList = new ArrayList<String>();
		sList.add("Thomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		// stream 쓰기 전에 도움말이나 그런 거 보고 반환형 확인해서 받기 
		stream.forEach(s->System.out.println(s));
		// 스트림 소모. 다시 생성해서 써야 함 재활용 불가
		
		//위의 것과 동일한 문장 
//		for(String s:sList) {
//			System.out.println(s);
//		}
		
		// sorted까지는 중간연산자
		// foreach에서 출력하는게 최종연산자
		sList.stream().sorted().forEach(s->System.out.println(s));
		

	}

}
