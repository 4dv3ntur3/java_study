package lambda;

interface PrintString {
	void showString(String str);
}

// �տ� ��� �;�� ��... 
// �Լ��� ���α׷��ֿ� ���� ������ ���� �ʿ� (javascript)
public class lamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ϳ��� ���ٽ��� ���� ������� ����
		
		// 1. ������ �����ؼ� �ٷ� implementation
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		
		// 2. implementation �� ��ü�� �Ѱ��ִ� ���
		showMyString(lambdaPrint);
		
		// 3. implementation�� ��ü�� ��ȯ������ �ѱ�� ���
		PrintString reStr = returnPrint();
		reStr.showString("hello");

	}
	
	// main�� static�̶� �굵 static�̾�� ��
	// �����ΰ� �Ű�����ó�� �Ѿ�� 
	// ��ü�� �Ѿ�� �Ŵϱ� �翬�� 
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
		
	}
	
	// �������̽� Ÿ��
	public static PrintString returnPrint() {
		return s->System.out.println(s + " world");
	}

}
