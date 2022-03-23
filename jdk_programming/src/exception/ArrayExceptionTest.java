package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// f1 눌러서 javadoc 보기 
		// 외울 필요 없음 쓰다 보면 외우게 됨 
		// Exception
		
		int[] arr = {1, 2, 3, 4, 5};
		try {
			// try의 {} 안에서 수행하는 동안 오류가 발생한다면
			for(int i =0; i<=5; i++) {
				System.out.println(arr[i]);
			}
			// runtime exception (프로그래밍이 돌다가 발생)
			
		// 그 오류가 이거라면 여기로 들어온다 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // 여기다가 로그 
//			System.out.println(e.toString()); 이 불린 것임
			return;
		} finally {
			System.out.println("finally");
			// 위에서 return해서 end는 안 찍히는데 얘는 찍힘
			// finally 구문 수행 후 return 수행함
			// try 수행되면 무조건 수행되는 블럭임
		}
		// 시스템이 죽으면 이건 출력 안됨 
		// 예외가 나도 프로그램이 죽지는 않은 것 
		System.out.println("end");
	}
	
}


