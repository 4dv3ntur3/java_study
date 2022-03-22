package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
//	Runnable runnable; �ϰ� ���� ���� ������ ����?
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("runnable");
			
		}
	};
	
	// ���� ���� Ŭ����
	
	public Runnable getRunnable(int i) {
		
		int localNum = 100;
	
		// Runnable�� �������̽�
		// ������ �����ϴ� ��
		
		/*
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				
				// ���� �����Ű�� ����
				// ������ ��ȿ��
				// localNum: Outer class�� getRunnable�̶�� �޼����� �Ű������� ��������
				// -> stack: �޼��� ȣ�� ������ ������
				// runnable.run() ȣ���ϰ� ���� ������ ������
				// ���� ����ϴ� �� ���������, �ٲٴ� �� �ȵ� (����������)
				
//				localNum += 100;
//				i += 200;
//				
				outNum += 10; // �̰� ������. �ν��Ͻ� �����ϱ� 
				
				// TODO Auto-generated method stub
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
				
			}
		}
		
		// Runnable Ŭ���� ����� Runnable�� ��ü�� ����(����)�ؼ� ��ȯ
		// return new MyRunnable();
		 * 
		*/
		
		// local inner class���� �̸��� ���ذ� �͸� ���� Ŭ���� 
		// Ŭ���� �޼��� �� �Ű�����(��������)�� ������ ���� �Ұ�
		// Runnable�� �� �� �� �����µ� ���⼭���� ���⼭������ ���̴ϱ� �ǹ̰� ����
		// -> class �̸��� �ǹ̰� �����Ƿ� ���ش� 
		
		// getRunnable()�� �θ��� �ٷ� ���ʺ� ��ü �����ؼ� ��ȯ�� �ְڴ� 
		return new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				outNum += 10; // �̰� ������. �ν��Ͻ� �����ϱ� 
				
				// TODO Auto-generated method stub
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
				
			}
		};
	
		
		
			
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer outer = new Outer();
//		outer.getRunnable().run(); // ���� int i �޴� �ɷ� �ٲ���� �ǽ��ؼ� �ȵ�
		//outer.getRunnable(20).run();
		
		Runnable runnable = outer.getRunnable(20);
		// run�� ȣ���ϱ� ���� getRunnable()�� ȣ��
		// �̷��� run()�� ȣ���ϴ� ������ 
		// getrunnable�� �Ű������� ���������� stack���� ����� ���� ���� ����
		// ���� ���� Ŭ������ ���Ǵ� ������ final�� -> ���ȭ -> �� �� �ٲ� 
		// ��� ������ ������ ������ ����. �ƹ�ư final�� ��� �׳� �ε� ���� �ٲ� �� ���� 
		
		
		
		runnable.run();
		
		// �͸� ���� Ŭ���� 
		// �ȵ���̵忡�� ������ ���� ���� �̷��� ���� �� 
		outer.runnable.run();
	}

}
