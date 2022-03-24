package myblog;

import java.util.List;

// 개발환경이 아닌 다른 윈도우에서 실행하는 방
public class LottoStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lotto lotto = new Lotto();
		List<Integer> basketList = lotto.getBasketList();
		
		StringBuffer sb = new StringBuffer();
		
		for(Integer number: basketList) {
			// 번호 +" "(공백) 을 한 줄로 
			sb.append(number).append(" ");
		}
		
		// 출력 로그
		System.out.println("=========================================");
		System.out.println("이번 주에 찍어야 할 로또 1등 번호는 " + sb.toString());
		System.out.println("=========================================");
		


	}

}
