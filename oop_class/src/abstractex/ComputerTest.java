package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ��. �߻� Ŭ������ new �� �� ���� (�ν��Ͻ�ȭ �Ұ���)
//		Computer c1 = new Computer();
//		c1.display();
		Computer c2 = new Desktop();
		// Computer c3 = new Laptop(); // abstract class�ϱ� �굵 �� ��
		Computer c4 = new MyLaptop();
		Laptop c5 = new MyLaptop();
		
		c2.display();
		c4.display();
		
//		c4.aaa() // �� �ȵ�
		c5.aaa(); // �� ���� 
		

	}

}
