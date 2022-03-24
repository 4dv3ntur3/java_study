package myblog;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public List<Integer> getBasketList() {
		// TODO Auto-generated method stub
		
		// import할 때 주의하자... 애먼 List import하면 안 됨 
		// 1. 로또 번호 추출시 저장할 곳이 필요
		List<Integer> basketList = new ArrayList<Integer>();
		
		// 2.로또 번호를 추출할 클래스
		Random random = new Random();
		
		// 3. 로또 번호를 6개 추출
		while(true) {
			int number = random.nextInt(46); // 0부터 45까지 나옴
			System.out.println(number);
			
			if(number == 0) {
				continue; // 이 밑의 거 실행하지 말고 그냥 다음 반복으로 
			}
			
			if (basketList.contains(number)) {
				// 장바구니에 지금 번호가 있다!
				System.out.println("number: " + number + " 는 기존에 등록된 번호입니다.");
				
			} else {
				// 장바구니에 지금 번호 없다
				System.out.println("number: " + number + " 는 기존에 등록되지 않은 번호입니다.");
				basketList.add(number);
			}
			
			if (basketList.size() >= 6) {
				System.out.println("로또 번호 6개 추출완료");
				break;
			}
		}
		
		return basketList;
		

		
	}

}
