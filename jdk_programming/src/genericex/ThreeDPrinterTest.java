package genericex;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���׸� ���α׷��� 
		ThreeDPrinter<Powder> printer = new ThreeDPrinter();
		
		printer.setMaterial(new Powder());
		
		Powder powder = printer.getMaterial();
		
		// toString() ������
		System.out.println(printer);
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter();
		
		printer2.setMaterial(new Plastic());
		
		Plastic plastic = printer2.getMaterial();
		
		// toString() ������
		System.out.println(printer2);
		
		// Water�� Material�� ��ӹ��� �ʱ� ������ �� �� ���� 
//		ThreeDPrinter<Water> printer3 = new ThreeDPrinter();
//		printer3.setMaterial(new Water());
//		System.out.println(printer3);
		
		printer2.printing();
		printer.printing();
		
		// <> �� �� ���� �ֱ�� �� �ٵ� Object�� ������ 
		ArrayList list = new ArrayList();


	}

}
